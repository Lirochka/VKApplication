package com.example.vkapplication.ui.theme

import com.example.vkapplication.domain.FeedPost
import com.example.vkapplication.domain.PostComment

sealed class CommentsScreenState {

    object Initial : CommentsScreenState()

    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>,
    ) : CommentsScreenState()
}
