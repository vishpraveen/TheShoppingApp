package com.vishpraveen.theshoppingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.vishpraveen.theshoppingapp.ui.theme.TheShoppingAppTheme
import com.vishpraveen.theshoppingapp.ui.theme.spacing

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheShoppingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                        .padding(MaterialTheme.spacing.extraSmall),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(
    @PreviewParameter(SampleGreetingProvider::class) osName: String
) {
    TheShoppingAppTheme {
        Greeting(osName)
    }
}

class SampleGreetingProvider: PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf(
            "Android",
            "iOS",
            "Mac",
            "Linux",
            "Windows",
        )
}