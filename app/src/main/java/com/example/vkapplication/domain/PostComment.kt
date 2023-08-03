package com.example.vkapplication.domain

import com.example.vkapplication.R

data class PostComment(
    val id: Int,
    val authorName: String = "Author_name",
    val authorAvatarId: Int = R.drawable.comment_author_avatar,
    val commentText: String = "Long comment text",
    val publicationDate: String = "23.08.23"
)
