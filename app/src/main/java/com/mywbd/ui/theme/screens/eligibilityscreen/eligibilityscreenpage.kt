package com.mywbd.ui.theme.screens.eligibilityscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mywbd.R
import com.mywbd.navigation.ROUTE_DONATIONHISTORY
import com.mywbd.navigation.ROUTE_ELIGIBILITY
import com.mywbd.ui.theme.screens.donationhistoryscreen.donorhistory_screen

@Composable
fun eligibility_screen(navController: NavHostController) {
    var Firstname by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var age by remember { mutableStateOf(TextFieldValue("")) }
    var weight by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    )

    {
        Text(
            text = "ELIGIBILITY PAGE",
            color = Color.DarkGray,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp)

//        Spacer(modifier = Modifier.height(50.dp))
//        OutlinedTextField(
//            value = Firstname,
//            onValueChange = { Firstname = it },
//            label = { Text(text = "Enter First Name") },
//            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Person Icon") },
//            modifier = Modifier
//                .width(300.dp)
//                .padding(8.dp),
//            shape = RoundedCornerShape(size = 20.dp)
//        )
//
//
//        Spacer(modifier = Modifier.height(50.dp))
//        OutlinedTextField(
//            value =  email,
//            onValueChange = {email=it},
//            label = { Text(text = "Enter Email") },
//            leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email Icon") },
//            modifier = Modifier
//                .width(300.dp)
//                .padding(8.dp),
//            shape = RoundedCornerShape(size = 20.dp)
//        )
//
//
//        Spacer(modifier = Modifier.height(50.dp))
//        OutlinedTextField(
//            value = age,
//            onValueChange = { age = it },
//            label = { Text(text = "Enter Age") },
//            leadingIcon = { Icon(Icons.Default.Face, contentDescription = "Age Icon") },
//            modifier = Modifier
//                .width(300.dp)
//                .padding(8.dp),
//            shape = RoundedCornerShape(size = 20.dp)
//
//        )
//        Spacer(modifier = Modifier.height(50.dp))
//        OutlinedTextField(
//            value = weight,
//            onValueChange = {weight = it},
//            label = { Text(text = "Enter Weight") },
//            leadingIcon = { Icon(Icons.Default.Add, contentDescription = "Weight Icon") },
//            modifier = Modifier
//                .width(300.dp)
//                .padding(8.dp),
//            shape = RoundedCornerShape(size = 20.dp)
//
//        )
//
//        Spacer(modifier = Modifier.height(15.dp))
//        Text(text = "Have you donated blood before? Click here to provide more information",
//            fontFamily = FontFamily.Cursive,
//            color = Color.Black,
//            modifier = Modifier.clickable {navController.navigate(ROUTE_DONATIONHISTORY) })

        Spacer(modifier = Modifier.height(15.dp))
        Image(
            painter = painterResource(R.drawable.elig),
            contentDescription = "home",
            modifier = Modifier.size(400.dp)
        )
    }
}

@Preview
@Composable
private fun eligibility_preview() {
    eligibility_screen(rememberNavController())
}
