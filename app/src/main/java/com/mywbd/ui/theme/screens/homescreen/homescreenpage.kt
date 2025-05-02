package com.mywbd.ui.theme.screens.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mywbd.navigation.ROUTE_DONOR
import com.mywbd.navigation.ROUTE_RECIPIENT
import com.mywbd.ui.theme.screens.splashscreen.splash_screen

@Composable
fun home_screen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)) {
        Text(text = "Participant Screen",
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { navController.navigate(ROUTE_DONOR)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(text = "Donor",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Blue)

        }

        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { navController.navigate(ROUTE_RECIPIENT)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(text = "Recipient",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Red)

        }
    }
}
@Preview
@Composable
private fun home_preview() {
    home_screen(rememberNavController())

}