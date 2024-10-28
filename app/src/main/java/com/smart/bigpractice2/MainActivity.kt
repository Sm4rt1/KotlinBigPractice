package com.smart.bigpractice2

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
import com.smart.bigpractice2.nizhnyanavigacia.MainScreen
import com.smart.bigpractice2.spisok.ListBrains
import com.smart.bigpractice2.ui.theme.BigPractice2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val listBrains = ListBrains()
            BigPractice2Theme {
                MainScreen(listBrains)
            }
        }
    }
}
