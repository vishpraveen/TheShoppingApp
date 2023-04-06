package com.vishpraveen.theshoppingapp.usersscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.vishpraveen.theshoppingapp.ui.theme.TheShoppingAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UsersScreen(
    userScreenViewModel: UserScreenViewModel = viewModel()
) {
    with(userScreenViewModel.userScreenUiState) {
        TheShoppingAppTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background,
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(title = { Text(text = title!!)})
                    }
                ) {
                    LazyColumn(
                        modifier = Modifier.padding(top = it.calculateTopPadding())
                    ) {
                        items(users.size) { count->
                            Text(
                                modifier = Modifier.fillMaxWidth(),
                                text = "Hello $count!",
                                style = MaterialTheme.typography.headlineLarge
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewUsersScreen() {
    UsersScreen()
}