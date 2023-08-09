package com.example.vkapplication.presentation.comments

import androidx.lifecycle.ViewModel
import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.domain.usecases.GetCommentsUseCase
import javax.inject.Inject
import kotlinx.coroutines.flow.map

class CommentsViewModel @Inject constructor(
   private val feedPost: FeedPost,
    private val getCommentsUseCase: GetCommentsUseCase,
) : ViewModel() {

    val screenState = getCommentsUseCase(feedPost)
        .map {
            CommentsScreenState.Comments(
                feedPost = feedPost,
                comments = it
            )
        }
}