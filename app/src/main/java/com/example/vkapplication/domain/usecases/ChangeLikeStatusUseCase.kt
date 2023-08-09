package com.example.vkapplication.domain.usecases

import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.domain.repository.NewsFeedRepository
import javax.inject.Inject

class ChangeLikeStatusUseCase @Inject constructor
    (private val repository: NewsFeedRepository) {

   suspend operator fun invoke(feedPost: FeedPost) {
        repository.changeLikeStatus(feedPost)
    }
}