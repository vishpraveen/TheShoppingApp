package com.vishpraveen.theshoppingapp.di

import com.vishpraveen.theshoppingapp.usersscreen.userrepository.UserRepository
import com.vishpraveen.theshoppingapp.usersscreen.userrepository.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideUserRepository(): UserRepository = UserRepositoryImpl()
}