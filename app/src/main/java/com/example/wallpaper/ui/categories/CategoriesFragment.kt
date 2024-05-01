package com.example.wallpaper.ui.categories

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.wallpaper.R
import com.example.wallpaper.databinding.FragmentCategoriesBinding
import com.example.wallpaper.utils.base.LoadMoreAdapter
import com.example.wallpaper.utils.basee.BaseFragment
import com.example.wallpaper.viewmodel.CategoriesViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CategoriesFragment : BaseFragment<FragmentCategoriesBinding>() {

    //binding
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentCategoriesBinding
        get() = FragmentCategoriesBinding::inflate

    //viewModel
    private val viewModel by viewModels<CategoriesViewModel>()

    //adapter
    @Inject
    lateinit var categoriesAdapter: CategoriesAdapter

    //args
    private val args by navArgs<CategoriesFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Args
        args.let {
            //Call api
            viewModel.updateCategoryId(it.topicId)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            //Back
            backImg.setOnClickListener { findNavController().popBackStack() }
            //Title
            args.let {
                categoriesTitle.text = "${it.title} ${getString(R.string.photos)}"
            }
        }
        //load data
        loadData()
        loadDataStates()
        initRecyclerView()

    }

    private fun loadData() {
        viewModel.categoriesPhotos.observe(viewLifecycleOwner) {
            categoriesAdapter.submitData(lifecycle, it)
        }
    }

    private fun initRecyclerView() {
        binding.categoriesList.apply {
            layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
            adapter = categoriesAdapter.withLoadStateFooter(LoadMoreAdapter { categoriesAdapter.retry() })
        }
       // Click
        categoriesAdapter.setOnItemClickListener {
            val direction = CategoriesFragmentDirections.actionToDetailFragment(it)
            findNavController().navigate(direction)
        }
    }

    private fun loadDataStates() {
        categoriesAdapter.addLoadStateListener { state ->
            binding.apply {
                loading.isVisible = state.source.refresh is LoadState.Loading
                categoriesList.isVisible = state.source.refresh is LoadState.NotLoading
            }
        }
    }

}