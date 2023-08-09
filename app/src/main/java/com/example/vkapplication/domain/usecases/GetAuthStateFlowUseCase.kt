package com.example.vkapplication.domain.usecases

import com.example.vkapplication.domain.entity.AuthState
import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.domain.entity.PostComment
import com.example.vkapplication.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

class GetAuthStateFlowUseCase(private val repository: NewsFeedRepository) {

    operator fun invoke(): StateFlow<AuthState> {
        return repository.getAuthStateFlow()
    }
}