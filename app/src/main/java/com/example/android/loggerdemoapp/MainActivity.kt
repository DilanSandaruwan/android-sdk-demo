package com.example.android.loggerdemoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android.loggerdemoapp.ui.theme.LoggerDemoAppTheme
import com.example.android.loggersdk.Logger


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoggerDemoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    // Initialize the SDK
    Logger.init(true)

    // Use the logger
    Logger.logInfo("MainActivity", "App started")
    Logger.logWarning("MainActivity", "This is a warning")
    Logger.logError("MainActivity", "This is an error")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoggerDemoAppTheme {
        Greeting("Android")
    }
}