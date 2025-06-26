package com.mywbd.ui.theme.screens.after

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mywbd.R
import com.mywbd.ui.theme.screens.homescreen.home_screen

@Composable
fun after_screen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)) {
        Text(
            text = "After",
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Red
        )

        Image(
            painter = painterResource(R.drawable.after),
            contentDescription = "home",
            modifier = Modifier.size(350.dp)
        )
    }
}
@Preview
@Composable
private fun after_preview() {
    after_screen(rememberNavController())

}