package com.example.watch_selling_app.presentation.screen.Splash_Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.watch_selling_app.presentation.components.AnimatedImageButton
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.R

@Composable
fun SplashScreen(
    onGetStartedClick: () -> Unit
) {
    // 🔧 Replace dynamic viewModel with hardcoded splash content
    val content = SplashContent(
        imageResId = R.drawable.splash_screen, // Replace with your image
        titleKey = "splash_title",
        subtitleKey = "splash_subtitle",
        buttonResId = R.drawable.main_botton,     // Replace with your image
        buttonDesKey = "get_started_button"
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = content.imageResId),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.splash_screen_title),
                style = MaterialTheme.typography.displayLarge,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(Dimens.SpacingL))
            Text(
                text = stringResource(id = R.string.splash_screen_subtitle),
                style = MaterialTheme.typography.titleLarge,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(Dimens.SpacingL))
        }

        AnimatedImageButton(
            imageResLight = content.buttonResId,
            imageResDark = content.buttonResId,
            contentDescription = content.buttonDesKey,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = Dimens.SpacingXXL),
            onClick = { onGetStartedClick() }
        )
    }
}

@Composable
fun getStringIdByName(name: String): Int {
    val context = LocalContext.current
    val id = context.resources.getIdentifier(name, "string", context.packageName)
    return if (id != 0) id else android.R.string.untitled // Or your own fallback
}

// Simple data class for static content
data class SplashContent(
    val imageResId: Int,
    val titleKey: String,
    val subtitleKey: String,
    val buttonResId: Int,
    val buttonDesKey: String
)
