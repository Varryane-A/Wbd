package com.mywbd.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import com.mywbd.navigation.ROUTE_ABOUT
import com.mywbd.navigation.ROUTE_AFTER
import com.mywbd.navigation.ROUTE_BEFORE
import com.mywbd.navigation.ROUTE_DONOR
import com.mywbd.navigation.ROUTE_DURING
import com.mywbd.navigation.ROUTE_ELIGIBILITY
import com.mywbd.ui.theme.screens.donorscreen.donor_screen

@Composable
fun about_screen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)) {
        Text(text = "About",
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Cyan
        )


        Image(
            painter = painterResource(R.drawable.reason),
            contentDescription = "about",
            modifier = Modifier.size(450.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Image(
            painter = painterResource(R.drawable.blood5),
            contentDescription = "about",
            modifier = Modifier.size(50.dp)
        )


        Spacer(modifier = Modifier.height(35.dp))
        Text(text = "Click here to check for more information on pre-donation care",
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
            modifier = Modifier.clickable {navController.navigate(ROUTE_BEFORE) })


        Spacer(modifier = Modifier.height(35.dp))
        Text(text = "Click here to check for more information on the donation process",
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
            modifier = Modifier.clickable {navController.navigate(ROUTE_DURING) })


        Spacer(modifier = Modifier.height(35.dp))
        Text(text = "Click here to check for more information on post-donation care",
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
            modifier = Modifier.clickable {navController.navigate(ROUTE_AFTER) })


        Spacer(modifier = Modifier.height(45.dp))
        Text(text = "CONTINUE",
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
            modifier = Modifier.clickable {navController.navigate(ROUTE_DONOR) })




//        Image(
//            painter = painterResource(R.drawable.before),
//            contentDescription = "about",
//            modifier = Modifier.size(350.dp)
//        )
//
//       Image(
//            painter = painterResource(R.drawable.during),
//            contentDescription = "about",
//            modifier = Modifier.size(350.dp)
//        )
//
//        Image(
//            painter = painterResource(R.drawable.after),
//            contentDescription = "about",
//            modifier = Modifier.size(350.dp)
//        )


    }
}
@Preview
@Composable
private fun about_preview() {
    about_screen(rememberNavController())
}