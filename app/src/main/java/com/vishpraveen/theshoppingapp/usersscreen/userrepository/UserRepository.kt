package com.vishpraveen.theshoppingapp.usersscreen.userrepository

import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun getUsers(): Flow<String>
}