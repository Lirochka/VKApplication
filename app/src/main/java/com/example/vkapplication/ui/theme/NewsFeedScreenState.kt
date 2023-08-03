package com.example.vkapplication.ui.theme

import com.example.vkapplication.domain.FeedPost

sealed class NewsFeedScreenState {

    object Initial: NewsFeedScreenState()

    data class Posts(
        val posts: List<FeedPost>) : NewsFeedScreenState()
}
