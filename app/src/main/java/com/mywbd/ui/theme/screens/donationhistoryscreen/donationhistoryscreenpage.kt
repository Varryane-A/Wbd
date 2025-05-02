package com.mywbd.ui.theme.screens.donationhistoryscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mywbd.ui.theme.screens.donorscreen.donor_screen

@Composable
fun donorhistory_screen(navController: NavHostController) {
    var Firstname by remember { mutableStateOf(TextFieldValue("")) }
    var Lastname by remember { mutableStateOf(TextFieldValue("")) }
    var donationdate by remember { mutableStateOf(TextFieldValue("")) }
    var amountdonated by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    )

    {
        Text(
            text = "DONATION HISTORY",
            color = Color.DarkGray,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp)

        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = Firstname,
            onValueChange = { Firstname = it },
            label = { Text(text = "Enter First Name") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Person Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)
        )


        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value =  Lastname,
            onValueChange = {Lastname=it},
            label = { Text(text = "Enter Last Name") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Person Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)
        )


        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = donationdate,
            onValueChange = { donationdate = it },
            label = { Text(text = "Enter Last Donation Date") },
            leadingIcon = { Icon(Icons.Default.DateRange, contentDescription = "Donation date Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)

        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = amountdonated,
            onValueChange = {amountdonated = it},
            label = { Text(text = "Enter Amount of Blood Donated") },
            leadingIcon = { Icon(Icons.Default.AddCircle, contentDescription = "Amount donated Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)

        )
    }
}

@Preview
@Composable
private fun donorhistory_preview() {
    donorhistory_screen(rememberNavController())
}
