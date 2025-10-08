package com.example.abc.di

import com.example.abc.data.ABCRepository
import com.example.abc.data.ABCRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideABCRepository(): ABCRepository {
        return ABCRepositoryImpl()
    }
}