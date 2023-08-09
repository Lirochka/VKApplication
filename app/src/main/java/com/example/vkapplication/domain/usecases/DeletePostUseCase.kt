package com.example.vkapplication.domain.usecases

import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.domain.repository.NewsFeedRepository

class DeletePostUseCase(private val repository: NewsFeedRepository) {

   suspend operator fun invoke(feedPost: FeedPost) {
        repository.deletePost(feedPost)
    }
}