package com.example.vkapplication.di

import androidx.lifecycle.ViewModel
import com.example.vkapplication.presentation.comments.CommentsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface CommentsViewModelModule {

    @IntoMap
    @Binds
    @ViewModelKey(CommentsViewModel::class)
    fun bindCommentsViewModel(viewModel: CommentsViewModel): ViewModel
}