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
import androidx.lifecycle.ViewModelProvider
import com.smart.bigpractice2.api.JokeItemContainer
import com.smart.bigpractice2.api.retrofit
import com.smart.bigpractice2.model.JokeItemList
import com.smart.bigpractice2.model.JokeItemListFactory
import com.smart.bigpractice2.model.JokeItemUseCase
import com.smart.bigpractice2.nizhnyanavigacia.MainScreen
import com.smart.bigpractice2.ui.theme.BigPractice2Theme

class MainActivity : ComponentActivity() {
    private lateinit var jokeItemList: JokeItemList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val api = retrofit.api
        val jokeItemContainer = JokeItemContainer(api)
        val useCase = JokeItemUseCase(jokeItemContainer)
        val factory = JokeItemListFactory(useCase)
        jokeItemList = ViewModelProvider(this, factory)[JokeItemList :: class.java]
        setContent {
            BigPractice2Theme {
                MainScreen(jokeItemList)
            }
        }
    }
}
