package com.kirenraj.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kirenraj.data.model.Article
import com.kirenraj.newsapp.databinding.NewsFeedListItemsBinding

class NewsAdapter(
    private var news: List<Article>,
): RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(val binding: NewsFeedListItemsBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = NewsFeedListItemsBinding.inflate(inflater, parent, false)
        return NewsViewHolder(binding)
    }

    override fun getItemCount() = news.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val new = news[position]
        holder.binding.tvTitle.text = new.title

    }

    fun setNews(news: List<Article>) {
        this.news = news
        notifyDataSetChanged()
    }
}