package com.kirenraj.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.kirenraj.newsapp.R
import com.kirenraj.newsapp.databinding.FragmentNewsFeedBinding
import com.kirenraj.ui.adapters.NewsAdapter
import com.kirenraj.ui.viewModel.NewsFeedViewModel
class NewsFeedFragment() : Fragment() {

    private lateinit var binding: FragmentNewsFeedBinding
    val isEmpty: MutableLiveData<Boolean> = MutableLiveData(false)

    private val viewModel: NewsFeedViewModel by viewModels {
        NewsFeedViewModel.Factory
    }

    private lateinit var adapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsFeedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()

        viewModel.articles.asLiveData().observe(viewLifecycleOwner) {
            adapter.setNews(it)
        }
    }

    fun setupAdapter() {
        adapter = NewsAdapter(emptyList()
        )


        val layoutManager = LinearLayoutManager(requireContext())
        binding.rvRecyclerView.adapter = adapter
        binding.rvRecyclerView.layoutManager = layoutManager
    }



}

