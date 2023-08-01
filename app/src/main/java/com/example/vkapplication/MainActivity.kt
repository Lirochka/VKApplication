package com.example.vkapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.vkapplication.ui.MainScreen
import com.example.vkapplication.ui.theme.VKApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           VKApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(MaterialTheme.colors.background)
//                        .padding(8.dp),
//                )
               MainScreen()
           }
        }
    }
}

