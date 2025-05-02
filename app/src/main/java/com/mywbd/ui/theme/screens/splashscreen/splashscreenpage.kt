package com.mywbd.ui.theme.screens.splashscreen

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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mywbd.navigation.ROUTE_HOME

@Composable
fun splash_screen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)) {
        Text(text = "Welcome to My WBD",
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.White
        )

    Spacer(modifier = Modifier.height(50.dp))
    Button(onClick = { navController.navigate(ROUTE_HOME)},
        modifier = Modifier.width(300.dp),
        colors = ButtonDefaults.buttonColors(Color.White)) {
        Text(text = "Continue",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black)

    }}

}
@Preview
@Composable
private fun splash_preview() {
    splash_screen(rememberNavController())

}