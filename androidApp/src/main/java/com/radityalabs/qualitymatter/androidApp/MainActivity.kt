package com.radityalabs.qualitymatter.androidApp

import android.os.Bundle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.setContent
import com.radityalabs.qualitymatter.androidApp.ui.AppTheme
import com.radityalabs.qualitymatter.shared.Greeting
import androidx.compose.runtime.getValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                HelloWorld()
            }
        }
    }
}


@Composable
fun HelloWorld() {
    val greeting = remember { Greeting() }
    Text(greeting.greeting())
}