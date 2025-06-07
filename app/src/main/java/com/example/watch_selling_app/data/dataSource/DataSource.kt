package com.example.watch_selling_app.data.dataSource

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.MobileFriendly
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Pin
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.LoginContent
import com.example.watch_selling_app.domain.model.LoginFormTextContent
import com.example.watch_selling_app.domain.model.RegisterContent
import com.example.watch_selling_app.domain.model.RegisterFormTextContent
import com.example.watch_selling_app.domain.model.SearchBarContent
import com.example.watch_selling_app.domain.model.SplashContent
import com.example.watch_selling_app.domain.model.TopBarContent
import kotlin.Int

object DataSource {

    fun getSplashContent(): SplashContent {
        return SplashContent(
            imageResId = R.drawable.splash_screen,
            titleKey = "splash_screen_title",
            subtitleKey = "splash_screen_subtitle",
            buttonTextKey = "splash_screen_button_text",
            buttonResId = R.drawable.main_botton,
            buttonDesKey = "get_started_button_description"
        )
    }

    //data source for login form
    fun getLoginFormTextContent(): LoginFormTextContent {
        return LoginFormTextContent(
            emailLabelKey = "email_label",
            emailPlaceholderKey = "email_placeholder",
            passwordLabelKey = "password_label",
            passwordPlaceholderKey = "password_placeholder",
            rememberMeKey = "remember_me",
            forgotPasswordKey = "forget_password",
            leadingIconMailResId = Icons.Filled.Mail,
            leadingIconPassResId = Icons.Filled.Password,
        )
    }

    // data source function for login screen

    fun getLoginContent(): LoginContent {
        return LoginContent(
            backgroundImageResId = R.drawable.login_head_image,
            backgroundImageDescriptionKey = "login_screen_top_image",
            illustrationImageResId = R.drawable.create_account,
            illustrationImageDescriptionKey = "login_illustration_image",
            backButtonIcon = Icons.Default.ArrowBackIosNew,
            backButtonIconDescriptionKey = "navigation_back_button",
            titleKey = "login_screen_main_title",
            subtitleKey = "login_screen_subtitle",
            registerPromptKey = "create_Account",
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

    //data source for register login screen

    fun getRegisterContent(): RegisterContent {
        return RegisterContent(
            backgroundImageResId = R.drawable.login_head_image,
            backgroundImageDescriptionKey = "login_screen_top_image",
            backButtonIconDescriptionKey = "navigation_back_button",
            titleKey = "register_screen_title",
            subtitleKey = "register_screen_subtitle",
            exploreButtonLightResId =R.drawable.explore_light_btn,
            exploreButtonDarkResId = R.drawable.explore_dark_btn,
            exploreButtonDescriptionKey = "explore_button_description",
            alreadyHaveAccountKey = "already_have_account",
            loginHereKey = "login_here_text"
        )
    }
    
    // data source for register form ( texts )
    fun getRegisterFormTextContent(): RegisterFormTextContent {
        return RegisterFormTextContent(
            fullNameLabelKey = "full_name_label",
            fullNamePlaceholderKey = "full_name_placeholder",
            emailLabelKey = "email_label",
            emailPlaceholderKey = "email_placeholder",
            mobileLabelKey = "Mobile_number_new_label",
            mobilePlaceholderKey = "mobile_number_placeholder",
            passwordLabelKey = "create_password_label",
            passwordPlaceholderKey = "create_password_placeholder",
            confirmPasswordLabelKey = "confirm_password_label",
            confirmPasswordPlaceholderKey = "confirm_password_placeholder",
            nameLeadingIcon = Icons.Filled.AccountCircle,
            emailLeadingIcon = Icons.Filled.Mail,
            mobileLeadingIcon = Icons.Filled.MobileFriendly,
            passwordLeadingIcon = Icons.Filled.Pin,
            confirmPasswordLeadingIcon = Icons.Filled.Password,
        )
    }

    fun getTopBarContent(): TopBarContent {
        return TopBarContent(
            backgroundImageResId = R.drawable.search_bar_section,
            backgroundDesc = "search_bar_Section",
            notificationIcon = Icons.Filled.Notifications,
            notificationIconDescriptionKey = "notification_icon_button",
            messageIcon = Icons.Filled.Message,
            messageIconDescriptionKey = "message_icon_button"
        )
    }

    fun getSearchBarContent(): SearchBarContent {
        return SearchBarContent(
            placeholderKey = "search_bar_placeholder"
        )
    }


}