package com.mywbd.data

import android.R.attr.progress
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.mywbd.model.User
import com.mywbd.navigation.ROUTE_HOME
//import com.mywbd.navigation.ROUTE_LOGIN
//import com.mywbd.navigation.ROUTE_REGISTER
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.mywbd.navigation.ROUTE_DONOR
import com.mywbd.navigation.ROUTE_ELIGIBILITY
import com.mywbd.navigation.ROUTE_SPALSH

//class AuthViewModel (var navController: NavHostController, var context: Context){
//    var mAuth: FirebaseAuth
//    init {
//        mAuth= FirebaseAuth.getInstance()
//    }
//
//    fun signupdonor(email: String,pass: String){
//            mAuth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener {
//                if (it.isSuccessful){
//                    navController.navigate(ROUTE_HOME)
//                    val userData= User(email,pass,mAuth.currentUser!!.uid)
//                    val  regRef= FirebaseDatabase.getInstance().getReference()
//                        .child("Users/"+mAuth.currentUser!!.uid)
//                    regRef.setValue(userData).addOnCompleteListener {
//                        if (it.isSuccessful){
//                            Toast.makeText(context,"Logged in successfully",Toast.LENGTH_LONG).show()
//                            navController.navigate(ROUTE_HOME)
//                        }else{
//                            Toast.makeText(context,"${it.exception!!.message}", Toast.LENGTH_LONG).show()
//                            navController.navigate(ROUTE_SPALSH)
//                        }
//                    }
//
//                }
//            }
//        }}

class AuthViewModel(var navController: NavHostController, var context: Context) {

    var mAuth: FirebaseAuth


    init {
        mAuth = FirebaseAuth.getInstance()

    }

    fun signupdonor(email: String, pass: String, confpass: String) {
        if (email.isBlank() or pass.isBlank() or confpass.isBlank()) {
            Toast.makeText(
                context,
                "Email and Password are blank. Please Enter Details",
                Toast.LENGTH_LONG
            ).show()
            return
        } else if (pass != confpass) {
            Toast.makeText(context, "Password and Confirm Password are not same", Toast.LENGTH_LONG)
                .show()
            return

        } else {
            mAuth.createUserWithEmailAndPassword(email, pass)
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        val userdata = User.User(email, pass, mAuth.currentUser!!.uid)
                        val regRef = FirebaseDatabase.getInstance().getReference()
                            .child("Users/" + mAuth.currentUser!!.uid)
                        regRef.setValue(userdata).addOnCompleteListener {
                            if (it.isSuccessful) {
                                Toast.makeText(
                                    context,
                                    "${it.exception!!.message}",
                                    Toast.LENGTH_LONG
                                ).show()
                                navController.navigate(ROUTE_DONOR)
                            } else {
                                Toast.makeText(
                                    context,
                                    "${it.exception!!.message}",
                                    Toast.LENGTH_LONG
                                ).show()
                                navController.navigate(ROUTE_DONOR)
                            }
                        }
                    } else {
                        navController.navigate(ROUTE_DONOR)
                    }
                }
        }
    }}










