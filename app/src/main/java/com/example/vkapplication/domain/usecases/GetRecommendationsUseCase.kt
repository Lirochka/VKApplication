package com.example.vkapplication.domain.usecases

import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.domain.repository.NewsFeedRepository
import javax.inject.Inject
import kotlinx.coroutines.flow.StateFlow

class GetRecommendationsUseCase @Inject constructor
    (private val repository: NewsFeedRepository) {

    operator fun invoke(): StateFlow<List<FeedPost>>{
        return repository.getRecommendations()
    }
}