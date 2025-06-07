package com.example.watch_selling_app.presentation.screen.Account_Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.watch_selling_app.data.dataSource.AccountScreenContentDataSource
import com.example.watch_selling_app.data.dataSource.AccountSectionEntryDataSource
import com.example.watch_selling_app.domain.model.BottomNavItem
import com.example.watch_selling_app.presentation.components.Account.SectionCard
import com.example.watch_selling_app.presentation.components.AnimatedImageButton
import com.example.watch_selling_app.presentation.components.BackIconButton
import com.example.watch_selling_app.presentation.components.BottomNavigationBar
import com.example.watch_selling_app.presentation.screen.Login_Screen.getSafeString
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun AccountScreen(
    navItems: List<BottomNavItem>,
    selectedItem: BottomNavItem,
    onItemSelected: (BottomNavItem) -> Unit,
    onBackClick: () -> Unit
) {
    val isDark = isSystemInDarkTheme()

    val context = LocalContext.current
    val content = AccountScreenContentDataSource.getAccountScreenContent()
    val generalItems = AccountSectionEntryDataSource.generalItems
    val supportItems = AccountSectionEntryDataSource.supportItems

    val backgroundRes = if (isDark) content.backgroundResDarkModeId else content.backgroundResLightModeId
    val backgroundDesc = if (isDark) content.backgroundDesc else content.backgroundDesc
    val viewProfileImage = if (isDark) content.viewProfileButtonDark else content.viewProfileButtonLight

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = navItems,
                selectedItem = selectedItem,
                onItemSelected = onItemSelected
            )
        },
        contentWindowInsets = WindowInsets(0, 0, 0, 0)
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            // Background
            Image(
                painter = painterResource(id = backgroundRes),
                contentDescription = getSafeString(
                    name = context.resources.getResourceEntryName(backgroundDesc)
                ),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(RoundedCornerShape(bottomStart = Dimens.SpacingM, bottomEnd = Dimens.SpacingM))
                    .height(Dimens.TopImageSize)
                    .fillMaxWidth()
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(Dimens.SpacingM),
                verticalArrangement = Arrangement.spacedBy(Dimens.SpacingM)
            ) {
                // Back Button and Title Row
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = Dimens.SpacingL)
                ) {
                    BackIconButton(
                        descriptionKey = "account_screen_title", // or any key you want
                        onClick = onBackClick,
                        modifier = Modifier.align(Alignment.CenterStart)
                    )

                    Text(
                        text = getSafeString(
                            name = context.resources.getResourceEntryName(content.screenTitleResId)
                        ),
                        style = MaterialTheme.typography.headlineLarge,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }

                // Profile section
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(Dimens.SpacingM),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = content.profilePictureResId),
                        contentDescription = getSafeString(
                            name = context.resources.getResourceEntryName(content.profilePictureDescId)
                        ),
                        modifier = Modifier
                            .size(Dimens.profile_image_size)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Column {
                        Text(
                            text = getSafeString(
                                name = context.resources.getResourceEntryName(content.userNameResId)
                            ),
                            style = MaterialTheme.typography.titleLarge,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Text(
                            text = getSafeString(
                                name = context.resources.getResourceEntryName(content.userLocationResId)
                            ),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }

                // View Full Profile Button
                AnimatedImageButton(
                    imageResLight = content.viewProfileButtonLight,
                    imageResDark = content.viewProfileButtonDark,
                    contentDescription = getSafeString(
                        name = context.resources.getResourceEntryName(content.viewProfileButtonDescId)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(Dimens.ButtonHeight),
                    onClick = {
                        //navigate to profile
                    }
                )

                // General Section
                Text(
                    text = getSafeString(
                        name = context.resources.getResourceEntryName(content.generalSectionTitleResId)
                    ),
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(top = Dimens.SpacingL)
                )

                generalItems.forEach { item ->
                    SectionCard(
                        item = item,
                        onClick = {}
                    )
                }

                // Support Section
                Text(
                    text = getSafeString(
                        name = context.resources.getResourceEntryName(content.supportSectionTitleResId)
                    ),
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onBackground,
                    modifier = Modifier.padding(top = Dimens.SpacingL)
                )

                supportItems.forEach { item ->
                    SectionCard(
                        item = item,
                        onClick = {}
                    )
                }
            }
        }
    }
}
