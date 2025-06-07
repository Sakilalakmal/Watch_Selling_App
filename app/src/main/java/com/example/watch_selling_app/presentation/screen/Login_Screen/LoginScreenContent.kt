package com.example.watch_selling_app.presentation.screen.Login_Screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Password
import androidx.compose.runtime.*
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.LoginContent
import com.example.watch_selling_app.domain.model.LoginFormData
import com.example.watch_selling_app.domain.model.LoginFormTextContent

@Composable
fun LoginScreen(
    onRegisterClick: () -> Unit,
    onLoginSuccess: () -> Unit
) {
    // Local form states instead of ViewModel
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var rememberMe by remember { mutableStateOf(false) }

    // Static content
    val content = remember {
        LoginContent(
            backgroundImageResId = R.drawable.login_head_image,
            backgroundImageDescriptionKey = "login_screen_top_image",
            illustrationImageResId = R.drawable.create_account,
            illustrationImageDescriptionKey = "login_illustration_image",
            backButtonIcon = Icons.Default.ArrowBackIosNew,
            backButtonIconDescriptionKey = "navigation_back_button",
            titleKey = "login_screen_main_title",
            subtitleKey = "login_screen_subtitle",
            registerPromptKey = "Don't_have_account",
            registerActionTextKey = "Register_on_login_Screen",
            loginButtonDescriptionKey = "Login_Button",
            loginButtonLightResId = R.drawable.login_btn_dark,
            loginButtonDarkResId = R.drawable.login_btn_light,
            googleButtonLightResId = R.drawable.google_btn,
            googleButtonDarkResId = R.drawable.google_btn_dark,
            googleButtonDescriptionKey = "google_signup_btn",
            emailButtonLightResId = R.drawable.email_btn_light,
            emailButtonDarkResId = R.drawable.email_btn_dark,
            emailButtonDescriptionKey = "email_button_desc"
        )
    }

    val formText = remember {
        LoginFormTextContent(
            emailLabelKey = "email_label",
            emailPlaceholderKey = "email_placeholder",
            passwordLabelKey = "password_label",
            passwordPlaceholderKey = "password_placeholder",
            rememberMeKey = "remember_me",
            forgotPasswordKey = "forget_password",
            leadingIconMailResId = Icons.Filled.Mail,
            leadingIconPassResId = Icons.Filled.Password
        )
    }

    // Pass local state and handlers to UI
    LoginScreenContent(
        content = content,
        formText = formText,
        formData = LoginFormData(
            email = email,
            password = password,
            rememberMe = rememberMe
        ),
        onEmailChanged = { email = it },
        onPasswordChanged = { password = it },
        onRememberMeChanged = { rememberMe = it },
        onLoginClick = {onLoginSuccess() },
        onRegisterClick = { onRegisterClick() },
        onGoogleSignInClick = { /* Optional */ },
        onBackClick = { /* Optional */ },
        onLoginSuccess = onLoginSuccess
    )
}
