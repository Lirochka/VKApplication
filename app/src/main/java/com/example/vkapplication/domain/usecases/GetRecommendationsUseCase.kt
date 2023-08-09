package com.example.vkapplication.domain.usecases

import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow

class GetRecommendationsUseCase( private val repository: NewsFeedRepository) {

    operator fun invoke(): StateFlow<List<FeedPost>>{
        return repository.getRecommendations()
    }
}