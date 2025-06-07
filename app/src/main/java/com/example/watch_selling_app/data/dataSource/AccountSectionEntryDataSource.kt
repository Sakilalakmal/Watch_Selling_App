package com.example.watch_selling_app.data.dataSource

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Message
import androidx.compose.material3.Icon
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.AccountSectionEntry

object AccountSectionEntryDataSource {

    val generalItems = listOf(
        AccountSectionEntry(
            titleResId = R.string.account_my_picks,
            iconLightResId = Icons.Filled.Bookmark,
            descriptionResId = R.string.check_this_account_screen
        ),
        AccountSectionEntry(
            titleResId = R.string.account_my_messages,
            iconLightResId = Icons.Default.Message,
            descriptionResId = R.string.check_this_account_screen
        ),
        AccountSectionEntry(
            titleResId = R.string.account_my_history,
            iconLightResId = Icons.Default.History,
            descriptionResId = R.string.check_this_account_screen
        )
    )

    val supportItems = listOf(
        AccountSectionEntry(
            titleResId = R.string.account_help_center,
            iconLightResId = Icons.Default.Help,
            descriptionResId = R.string.check_this_account_screen
        ),
        AccountSectionEntry(
            titleResId = R.string.log_out,
            iconLightResId = Icons.Default.Logout,
            descriptionResId = R.string.check_this_account_screen
        )
    )


}