package com.example.vkapplication.domain.usecases

import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.domain.repository.NewsFeedRepository
import javax.inject.Inject

class DeletePostUseCase @Inject constructor
    (private val repository: NewsFeedRepository) {

   suspend operator fun invoke(feedPost: FeedPost) {
        repository.deletePost(feedPost)
    }
}