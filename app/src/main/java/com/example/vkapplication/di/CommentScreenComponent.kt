package com.example.vkapplication.di

import com.example.vkapplication.domain.entity.FeedPost
import com.example.vkapplication.presentation.ViewModelFactory
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [CommentsViewModelModule::class])
interface CommentScreenComponent {

    fun getViewModelFactory(): ViewModelFactory

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance feedPost: FeedPost,
        ): CommentScreenComponent
    }
}