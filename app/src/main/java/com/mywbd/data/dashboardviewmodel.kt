package com.mywbd.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.mutableStateOf
import com.mywbd.model.QuickAction
import com.mywbd.model.dashboardstat
import androidx.lifecycle.ViewModel

class dashboardviewmodel: ViewModel(){
    val stat= mutableStateOf(
        listOf(
            dashboardstat("Revenue","1200",Icons.Default.Person)
        )
    )
    val quickAction=mutableStateOf(
        listOf(
            QuickAction("Add new user",Icons.Default.Person),
            QuickAction("Generate report",Icons.Default.Create),
            QuickAction("Settings",Icons.Default.Settings)
        )
    )
}

