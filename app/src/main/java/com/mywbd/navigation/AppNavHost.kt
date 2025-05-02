package com.mywbd.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mywbd.ui.theme.screens.donationhistoryscreen.donorhistory_screen
import com.mywbd.ui.theme.screens.donorscreen.donor_screen
import com.mywbd.ui.theme.screens.eligibilityscreen.eligibility_screen
import com.mywbd.ui.theme.screens.homescreen.home_screen
import com.mywbd.ui.theme.screens.recipientscreen.recipient_screen
import com.mywbd.ui.theme.screens.splashscreen.splash_screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String=ROUTE_SPALSH) {
    NavHost(navController = navController, modifier = Modifier,
        startDestination = startDestination){
        composable (ROUTE_SPALSH){
            splash_screen(navController)
        }
        composable (ROUTE_HOME){
            home_screen(navController)
        }
        composable (ROUTE_DONOR){
            donor_screen(navController)
        }
        composable (ROUTE_RECIPIENT){
           recipient_screen(navController)
        }
        composable (ROUTE_ELIGIBILITY){
            eligibility_screen(navController)
        }
        composable (ROUTE_DONATIONHISTORY){
            donorhistory_screen(navController)
        }
        composable (ROUTE_MATCH){
//            match_history(navController)
        }
    }
}