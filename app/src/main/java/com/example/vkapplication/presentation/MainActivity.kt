package com.example.vkapplication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.vkapplication.ui.MainScreen
import com.example.vkapplication.ui.theme.VKApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VKApplicationTheme {
                MainScreen()
            }
        }
    }
}
