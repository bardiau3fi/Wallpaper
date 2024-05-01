package com.example.wallpaper.ui.search

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
import com.example.wallpaper.databinding.FragmentSearchBinding
import com.example.wallpaper.utils.base.LoadMoreAdapter
import com.example.wallpaper.utils.basee.BaseFragment
import com.example.wallpaper.utils.setStatusBarIconsColor
import com.example.wallpaper.viewmodel.SearchViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>() {

    //binding
    override val bindingInflater: (inflater: LayoutInflater) -> FragmentSearchBinding
        get() = FragmentSearchBinding::inflate

    //viewModel
    private val viewModel by viewModels<SearchViewModel>()

    //adapter
    @Inject
    lateinit var searchAdapter: SearchAdapter

    //args
    private val args by navArgs<SearchFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Args
        args.let {
            //Call api
            viewModel.updateQuery(it.query)
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Set color for status bar icons
        requireActivity().setStatusBarIconsColor(true)
        //InitViews
        binding.apply {
            //Back
            backImg.setOnClickListener { findNavController().popBackStack() }
            //Title
            args.let {
                searchTitle.text = "${it.query} ${getString(R.string.photos)}"
            }
        }
        //Load data
        loadData()
        //Init functions
        initRecyclerView()
        loadDataStates()
    }

    private fun loadData() {
        viewModel.searchPhotos.observe(viewLifecycleOwner) {
            searchAdapter.submitData(lifecycle, it)
        }
    }

    private fun initRecyclerView() {
        binding.searchList.apply {
            layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
            adapter = searchAdapter.withLoadStateFooter(LoadMoreAdapter { searchAdapter.retry() })
        }
        //Click
        searchAdapter.setOnItemClickListener {
            val direction = SearchFragmentDirections.actionToDetailFragment(it)
            findNavController().navigate(direction)
        }
    }

    private fun loadDataStates() {
        searchAdapter.addLoadStateListener { state ->
            binding.apply {
                loading.isVisible = state.source.refresh is LoadState.Loading
                searchList.isVisible = state.source.refresh is LoadState.NotLoading
                //Empty
                if (state.source.refresh is LoadState.NotLoading &&
                    state.append.endOfPaginationReached && searchAdapter.itemCount < 1
                ) {
                    emptyLay.isVisible = true
                    searchList.isVisible = false
                } else {
                    emptyLay.isVisible = false
                    searchList.isVisible = true
                }
            }
        }
    }
}