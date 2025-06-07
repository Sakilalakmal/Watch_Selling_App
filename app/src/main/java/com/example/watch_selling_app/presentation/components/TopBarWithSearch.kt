package com.example.watch_selling_app.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.watch_selling_app.R
import com.example.watch_selling_app.domain.model.SearchBarContent
import com.example.watch_selling_app.domain.model.TopBarContent
import com.example.watch_selling_app.ui.theme.Dimens

@Composable
fun TopBarWithSearch(
    topBarContent: TopBarContent,
    searchBarContent: SearchBarContent,
    onMessageClick: () -> Unit = {},
    onNotificationClick: () -> Unit = {}

)
{
    // create Box
    Box (modifier = Modifier
        .height(Dimens.TopBarHeight)
        .fillMaxWidth(),
        contentAlignment = Alignment.Center)
    {
        //background Image

        Image(painter = painterResource(topBarContent
            .backgroundImageResId) ,
            contentDescription = topBarContent
                .backgroundDesc,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(bottomEnd = Dimens.RadiusMedium , bottomStart = Dimens.RadiusMedium))
                .fillMaxSize()
        )

        // create a ROW

        Row (modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center)
        {
            // serach bar
           SearchBar(
               content = searchBarContent ,
               modifier = Modifier
                   .width(Dimens.search_bar_top_width)
                   .height(Dimens.search_bar_top_Height)
           )

            Spacer(modifier = Modifier.width(Dimens.SpacingS))

            // message icon

            IconCircleButton(
                icon = topBarContent.messageIcon,
                contentDescKey = topBarContent.messageIconDescriptionKey,
                onClick = onMessageClick,

            )

            Spacer(modifier = Modifier.width(Dimens.SpacingS))

            //notification icon

            IconCircleButton(
                icon = topBarContent.notificationIcon,
                contentDescKey = topBarContent.notificationIconDescriptionKey,
                onClick = onNotificationClick,
            )

        }

    }

}


