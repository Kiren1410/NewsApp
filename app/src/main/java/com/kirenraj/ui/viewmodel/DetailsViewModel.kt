package com.kirenraj.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory

class DetailViewModel(
    private val repository: NewsRepo
): ViewModel() {

    fun getNewsById(newsId: Int): News {
        return repository.getTask(newsId) ?: throw IllegalStateException("Task not found")
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val myRepository = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MyApplication).repo
                DetailViewModel(myRepository)
            }
        }
    }
}
