package com.example.raspi_droid_romance

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Text(
        text = "Oh. Raspi, is that you?",
        modifier = modifier
    )
}

@Composable
fun DroidResponse(love: Boolean? = false) {
    if (love == true)
        Text(text = "I knew you would love me <3 I've found my true Raspi!")
    if (love == false)
        Text(text = "Where's my Raspi?! I won't find love anymore. The world is full of misery and anguish" )
    else
        Text(text = "I dunno what the fuck is going on. I'm suffering" )
}

@Composable
fun ColumnPrint(love: Boolean? = false) {
    Column {
        Greeting()
        Spacer(modifier = Modifier.height(16.dp))
        DroidResponse(love)

    }
}