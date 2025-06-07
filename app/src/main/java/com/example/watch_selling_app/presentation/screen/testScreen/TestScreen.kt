package com.example.watch_selling_app.presentation.screen.testScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.watch_selling_app.presentation.viewModel.TestViewModel

@Composable
fun TestScreen(viewModel: TestViewModel) {
    Text(text = "Product ID = ${viewModel.productId}")
}