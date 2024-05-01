package com.example.wallpaper.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wallpaper.R
import com.example.wallpaper.data.model.home.ResponsePhotos
import com.example.wallpaper.data.model.home.ResponseTopics
import com.example.wallpaper.databinding.FragmentHomeBinding
import com.example.wallpaper.ui.home.adapters.ColorsAdapter
import com.example.wallpaper.ui.home.adapters.NewestPhotosAdapter
import com.example.wallpaper.ui.home.adapters.TopicsAdapter
import com.example.wallpaper.utils.basee.BaseFragment
import com.example.wallpaper.utils.network.NetworkRequest
import com.example.wallpaper.utils.setStatusBarIconsColor
import com.example.wallpaper.utils.setupRecyclerview
import com.example.wallpaper.utils.showSnackBar
import com.example.wallpaper.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    //binding
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    //viewModel
    private val viewModel by viewModels<HomeViewModel>()

    //adapters
    @Inject
    lateinit var newestPhotosAdapter: NewestPhotosAdapter

    @Inject
    lateinit var topicsAdapter: TopicsAdapter

    @Inject
    lateinit var colorsAdapter: ColorsAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Set color for status bar icons
        requireActivity().setStatusBarIconsColor(true)

        //InitViews
        binding.apply {
            searchInpLay.setEndIconOnClickListener {
                val search = searchEdt.text.toString()
                if (search.isNotEmpty()) {
                    val direction = HomeFragmentDirections.actionToSearchFragment(search)
                    findNavController().navigate(direction)
                } else {
                    root.showSnackBar(getString(R.string.searchCanNotBeEmpty))
                }
            }
        }

        //color tones
        initColorsRecycler()
        //observers
        loadNewestPhotosLiveData()
        loadTopicsLiveData()
    }

    //--- observers ---//
    private fun loadNewestPhotosLiveData() {
        binding.apply {
            viewModel.newestPhotosLiveData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                        newestList.showShimmer()
                    }

                    is NetworkRequest.Success -> {
                        newestList.hideShimmer()
                        response.data?.let { data ->
                            if (data.isNotEmpty()) {
                                initNewestRecycler(data)
                            }
                        }
                    }

                    is NetworkRequest.Error -> {
                        newestList.hideShimmer()
                        root.showSnackBar(response.error!!)
                    }
                }
            }
        }
    }

    private fun loadTopicsLiveData() {
        binding.apply {
            viewModel.topicsLiveData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                        newestList.showShimmer()
                    }

                    is NetworkRequest.Success -> {
                        newestList.hideShimmer()
                        response.data?.let { data ->
                            if (data.isNotEmpty()) {
                                initTopicsRecycler(data)
                            }
                        }
                    }

                    is NetworkRequest.Error -> {
                        newestList.hideShimmer()
                        root.showSnackBar(response.error!!)
                    }
                }
            }
        }
    }

    //--- recycler views ---//
    private fun initNewestRecycler(list: List<ResponsePhotos.ResponsePhotosItem>) {
        newestPhotosAdapter.setData(list)
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.newestList.setupRecyclerview(layoutManager, newestPhotosAdapter)
        //Click
        newestPhotosAdapter.setOnItemClickListener {
            val direction = HomeFragmentDirections.actionToDetailFragment(it)
            findNavController().navigate(direction)
        }
    }

    private fun initTopicsRecycler(list: List<ResponseTopics.ResponseTopicsItem>) {
        topicsAdapter.setData(list)
        val layoutManager = GridLayoutManager(requireContext(), 2)
        binding.categoriesList.setupRecyclerview(layoutManager, topicsAdapter)
        //Click
        topicsAdapter.setOnItemClickListener { id, title ->
            val direction = HomeFragmentDirections.actionToCategoriesFragment(id, title)
            findNavController().navigate(direction)
        }
    }

    private fun initColorsRecycler() {
        colorsAdapter.setData(viewModel.getColorTones())
        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.colorToneList.setupRecyclerview(layoutManager, colorsAdapter)
        //Click
        colorsAdapter.setOnItemClickListener {
            val direction = HomeFragmentDirections.actionToSearchFragment(it)
            findNavController().navigate(direction)
        }
    }

}