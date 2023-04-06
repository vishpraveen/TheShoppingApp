package com.vishpraveen.theshoppingapp.usersscreen

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishpraveen.theshoppingapp.usersscreen.userrepository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class UserScreenViewModel @Inject constructor(
    private val userRepository: UserRepository
): ViewModel() {
    var userScreenUiState by mutableStateOf(UserScreenUiState(title = "Users"))

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        val list = mutableListOf<String>()
        viewModelScope.launch(Dispatchers.Main) {
            userRepository.getUsers().collect {
                list.add(it)
                userScreenUiState = userScreenUiState.copy(users = list)
            }
        }
    }
}