package com.example.vkapplication.di

import android.content.Context
import com.example.vkapplication.data.network.ApiFactory
import com.example.vkapplication.data.network.ApiService
import com.example.vkapplication.data.repository.NewsFeedRepositoryImpl
import com.example.vkapplication.domain.repository.NewsFeedRepository
import com.vk.api.sdk.VKPreferencesKeyValueStorage
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    @ApplicationScope
    fun bindRepository(impl: NewsFeedRepositoryImpl): NewsFeedRepository

    companion object{

        @Provides
        @ApplicationScope
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }

        @Provides
        @ApplicationScope
        fun provideVkStorage(
            context: Context
        ): VKPreferencesKeyValueStorage{
            return VKPreferencesKeyValueStorage(context)
        }
    }

}