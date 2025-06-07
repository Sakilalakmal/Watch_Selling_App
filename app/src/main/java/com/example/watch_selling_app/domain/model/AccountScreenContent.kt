package com.example.watch_selling_app.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class AccountScreenContent(
    @DrawableRes val backgroundResLightModeId: Int,
    @DrawableRes val backgroundResDarkModeId: Int,
    @StringRes val backgroundDesc : Int,
    @StringRes val screenTitleResId: Int,
    @StringRes val userNameResId: Int,
    @StringRes val userLocationResId: Int,
    @DrawableRes val profilePictureResId: Int,
    @StringRes val profilePictureDescId: Int,
    @StringRes val viewProfileButtonDescId: Int,
    @StringRes val generalSectionTitleResId: Int,
    @StringRes val supportSectionTitleResId: Int,
    @DrawableRes val viewProfileButtonLight : Int,
    @DrawableRes val viewProfileButtonDark : Int,
)
