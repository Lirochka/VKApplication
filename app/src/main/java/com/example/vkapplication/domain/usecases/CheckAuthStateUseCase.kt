package com.example.vkapplication.domain.usecases

import com.example.vkapplication.domain.repository.NewsFeedRepository
import javax.inject.Inject

class CheckAuthStateUseCase @Inject constructor
    (private val repository: NewsFeedRepository) {

   suspend operator fun invoke() {
        repository.checkAuthState()
    }
}