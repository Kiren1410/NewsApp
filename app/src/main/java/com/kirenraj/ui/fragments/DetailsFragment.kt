package com.kirenraj.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.kirenraj.ui.viewmodel.DetailsViewModel
import com.kirenraj.newsapp.R
import com.kirenraj.newsapp.databinding.FragmentDetailsBinding
import java.io.File

class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentDetailsBinding
    private val args: DetailsFragmentArgs by navArgs()
    private val viewModel: DetailsView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val file = File(args.path)
        Glide
            .with(this)
            .load(file)
            .placeholder(R.drawable.ic_img)
            .into(binding.ivImage)

        val task = viewModel.getTaskById(args.newsId)
        binding.tvNews.text = task.title

    }

}


