package com.vishpraveen.theshoppingapp.usersscreen.userrepository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepositoryImpl : UserRepository {
    override suspend fun getUsers(): Flow<String> = flow {
        repeat(500) {
            emit("$it")
        }
    }
}