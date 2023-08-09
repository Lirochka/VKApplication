package com.example.vkapplication.domain.usecases

import com.example.vkapplication.domain.repository.NewsFeedRepository

class LoadNextDataUseCase(private val repository: NewsFeedRepository) {

   suspend operator fun invoke() {
        repository.loadNextData()
    }
}