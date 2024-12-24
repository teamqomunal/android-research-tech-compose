package com.qomunal.opensource.androidresearch.ui.main.compose

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.leonranger.composeed.ui.theme.ComposeedTheme
import com.qomunal.opensource.androidresearch.common.base.BaseComponentActivity
import com.qomunal.opensource.androidresearch.ui.main.MainRouter
import com.qomunal.opensource.androidresearch.ui.main.MainViewModel

class MainActivity : BaseComponentActivity() {

    private val viewModel: MainViewModel by viewModels()

    private val router: MainRouter by lazy {
        MainRouter(this)
    }

    override fun initUI() {
        enableEdgeToEdge()
        setContent {
            ComposeedTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun initObserver() {
        viewModel.apply {

        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeedTheme {
        Greeting("Android")
    }
}