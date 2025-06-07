package com.example.watch_selling_app.data.dataSource

import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.AccountScreenContent

object AccountScreenContentDataSource {

    fun getAccountScreenContent(): AccountScreenContent {
        return AccountScreenContent(
            backgroundResLightModeId = R.drawable.login_head_image,
            backgroundResDarkModeId = R.drawable.login_head_image,
            screenTitleResId = R.string.account_screen_title,
            userNameResId = R.string.account_user_name,
            userLocationResId = R.string.account_user_location,
            profilePictureResId = R.drawable.profile_pic,
            profilePictureDescId = R.string.account_profile_picture_desc,
            viewProfileButtonDescId = R.string.account_view_full_profile_button,
            generalSectionTitleResId = R.string.account_general_section_title,
            supportSectionTitleResId = R.string.account_support_section_title,
            backgroundDesc = R.string.account_background_light_decsc,
            viewProfileButtonLight = R.drawable.view_profile_light,
            viewProfileButtonDark = R.drawable.view_profile_dark,
        )
    }
}