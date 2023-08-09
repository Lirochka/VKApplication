package com.example.vkapplication.presentation.comments

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.vkapplication.data.repository.NewsFeedRepositoryImpl
import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.domain.usecases.GetCommentsUseCase
import kotlinx.coroutines.flow.map

class CommentsViewModel(
    feedPost: FeedPost,
    application: Application,
) : ViewModel() {

    private val repository = NewsFeedRepositoryImpl(application)

    private val getCommentsUseCase = GetCommentsUseCase(repository)

    val screenState = getCommentsUseCase(feedPost)
        .map {
            CommentsScreenState.Comments(
                feedPost = feedPost,
                comments = it
            )
        }
}