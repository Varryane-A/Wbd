package com.mywbd.ui.theme.screens.donorscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
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
import com.mywbd.navigation.ROUTE_DONATIONHISTORY
import com.mywbd.navigation.ROUTE_ELIGIBILITY

@Composable
fun donor_screen(navController: NavHostController) {
    var Firstname by remember { mutableStateOf(TextFieldValue("")) }
    var Lastname by remember { mutableStateOf(TextFieldValue("")) }
    var gender by remember { mutableStateOf(TextFieldValue("")) }
    var age by remember { mutableStateOf(TextFieldValue("")) }
    var weight by remember { mutableStateOf("") }
    var bloodgroup by remember { mutableStateOf("") }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var phone by remember { mutableStateOf(TextFieldValue("")) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
    )

    {
        Text(
            text = "DONOR",
            color = Color.Blue,
            fontFamily = FontFamily.Cursive,
            fontSize = 35.sp)

        Spacer(modifier = Modifier.height(5.dp))
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


        Spacer(modifier = Modifier.height(5.dp))
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


        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = gender,
            onValueChange = { gender = it },
            label = { Text(text = "Enter Gender") },
            leadingIcon = { Icon(Icons.Default.Face, contentDescription = "Face Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)

        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = age,
            onValueChange = {age = it},
            label = { Text(text = "Enter Age") },
            leadingIcon = { Icon(Icons.Default.Add, contentDescription = "Age Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)

        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = weight,
            onValueChange = {weight = it},
            label = { Text(text = "Enter Weight") },
            leadingIcon = { Icon(Icons.Default.AccountCircle, contentDescription = " Weight Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = bloodgroup,
            onValueChange = {bloodgroup = it},
            label = { Text(text = "Enter Blood group") },
            leadingIcon = { Icon(Icons.Default.Favorite, contentDescription = " Bloodgroup Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text(text = "Enter Email") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = " Email Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = phone,
            onValueChange = {phone = it},
            label = { Text(text = "Enter Phone number") },
            leadingIcon = { Icon(Icons.Default.Call, contentDescription = " Phone Icon") },
            modifier = Modifier
                .width(300.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(size = 20.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.width(300.dp)) {
            Text(
                text = "Submit",
                fontSize = 20.sp,
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
            )
        }

        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Click here to check for donation eligibility",
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.clickable {navController.navigate(ROUTE_ELIGIBILITY) })


    }

}
@Preview
@Composable
private fun donor_preview() {
    donor_screen(rememberNavController())
}