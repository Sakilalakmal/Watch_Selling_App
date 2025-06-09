package com.example.watch_selling_app.presentation.screen.Register_Screen

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.watch_selling_app.domain.model.RegisterContent
import com.example.watch_selling_app.domain.model.RegisterFormData
import com.example.watch_selling_app.domain.model.RegisterFormTextContent
import com.example.watch_selling_app.presentation.components.AnimatedImageButton
import com.example.watch_selling_app.presentation.components.BackIconButton
import com.example.watch_selling_app.presentation.components.FormField
import com.example.watch_selling_app.presentation.screen.Login_Screen.getSafeString
import com.example.watch_selling_app.ui.theme.CustomColors
import com.example.watch_selling_app.ui.theme.Dimens
import com.example.watch_selling_app.ui.theme.LocalCustomColors

@Composable
fun RegisterScreenContent(
    modifier: Modifier = Modifier,
    content: RegisterContent,
    formText: RegisterFormTextContent,
    formData: RegisterFormData,
    onNameChanged: (String) -> Unit,
    onEmailChanged: (String) -> Unit,
    onPasswordChanged: (String) -> Unit,
    onConfirmPasswordChanged:(String) -> Unit,
    onMobileChanged: (String) -> Unit,
    onRegisterClick: () -> Unit,
    onExploreClick: () -> Unit,
    onBackClick: () -> Unit,
    onLoginHereClick: () -> Unit
)
{
    val scrollState = rememberScrollState()

    // create column and scale it around screen

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState)
        .background(color = MaterialTheme
            .colorScheme
            .background),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        // Top image + back button + Titles in side a box

        Box(modifier = Modifier
            .height(Dimens.TopImageSize)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {
            //Top image

            Image(painter = painterResource(content.backgroundImageResId),
                contentDescription = content.backgroundImageDescriptionKey,
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )

            // Back Button Icon
           BackIconButton(
               modifier = Modifier
                   .padding(end = Dimens.SpacingM)
                   .align(Alignment.TopEnd),
               descriptionKey = content.backButtonIconDescriptionKey,
               onClick = onBackClick
           )

            // keep title and subtitle inside a column
            Column(modifier = modifier
                .align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                // main title

                Text(text = getSafeString(content.titleKey),
                    style = MaterialTheme.typography.displayMedium,
                    color = MaterialTheme.colorScheme.onBackground
                )

                Spacer(modifier = Modifier.height(Dimens.SpacingM))

                ///sub title

                Text(text = getSafeString(content.subtitleKey),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onBackground
                )

            }


        }

        Spacer(modifier = modifier.height(Dimens.SpacingS))
        
        // creating name field
        FormField(
            value = formData.email,
            onValueChange = onNameChanged,
            label = getSafeString(formText.fullNameLabelKey),
            placeholder = getSafeString(formText.fullNamePlaceholderKey),
            keyboardType = KeyboardType.Text,
            leadingIcon = formText.nameLeadingIcon,

        )

        // email address field
        
        FormField(
            value = formData.email,
            onValueChange = onEmailChanged,
            label = getSafeString(formText.emailLabelKey),
            placeholder = getSafeString(formText.emailPlaceholderKey),
            keyboardType = KeyboardType.Email,
            leadingIcon = formText.emailLeadingIcon,
        )

        //mobile number field

        FormField(
            value = formData.mobile,
            onValueChange = onMobileChanged,
            label = getSafeString(formText.mobileLabelKey),
            placeholder = getSafeString(formText.mobilePlaceholderKey),
            keyboardType = KeyboardType.Number,
            leadingIcon = formText.mobileLeadingIcon,
        )
        
        // password field
        
        FormField(
            value = formData.password,
            onValueChange = onPasswordChanged,
            label = getSafeString(formText.passwordLabelKey),
            placeholder = getSafeString(formText.passwordPlaceholderKey),
            isPassword = true,
            keyboardType = KeyboardType.Password,
            leadingIcon = formText.passwordLeadingIcon,
        )

        // confirm password field

        FormField(
            value = formData.confirmPassword,
            onValueChange = onConfirmPasswordChanged,
            label = getSafeString(formText.confirmPasswordLabelKey),
            placeholder = getSafeString(formText.confirmPasswordPlaceholderKey),
            isPassword = true,
            keyboardType = KeyboardType.Password,
            leadingIcon = formText.confirmPasswordLeadingIcon,
        )

        Spacer(modifier = Modifier.height(Dimens.SpacingM))

        // explore button
        AnimatedImageButton(
            imageResLight = content.exploreButtonLightResId,
            imageResDark = content.exploreButtonDarkResId,
            contentDescription = content.exploreButtonDescriptionKey,
            onClick = {onExploreClick()}
        )

        Row(modifier = Modifier
            .padding(top = Dimens.SpacingM)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically)
        {
            Text(text = getSafeString(content.alreadyHaveAccountKey),
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onBackground
            )

            Spacer(modifier = Modifier.width(Dimens.SpacingXXS))

            Text(text = getSafeString(content.loginHereKey),
                style = MaterialTheme.typography.titleLarge,
                color = LocalCustomColors.current.luxuryGold,
                modifier = Modifier
                    .clickable{onLoginHereClick()}
            )

        }

    }

}

