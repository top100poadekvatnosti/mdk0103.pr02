package com.example.pr02

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
import com.example.pr02.data.Quote
import com.example.pr02.services.QuoteViewModel
import com.example.pr02.ui.theme.Pr02Theme
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val quotesViewModel: QuoteViewModel = viewModel()
            val quote = Quote(
                quote = "Способ делать великие дела — любить то, что вы делаете",
                author = "Стив Джобс"

            )
            quotesViewModel.createQuote(quote)
        }
    }
}