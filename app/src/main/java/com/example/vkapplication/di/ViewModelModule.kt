package com.example.vkapplication.di

import androidx.lifecycle.ViewModel
import com.example.vkapplication.presentation.comments.CommentsViewModel
import com.example.vkapplication.presentation.main.MainViewModel
import com.example.vkapplication.presentation.news.NewsFeedViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @Binds
    @ViewModelKey(NewsFeedViewModel::class)
    fun bindNewsFeedViewModel(viewModel: NewsFeedViewModel): ViewModel

    @IntoMap
    @Binds
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}