package com.example.navigationapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.navigationapp.ui.theme.NavigationAppTheme

@Composable
fun SimpleSecondScreen(navController: NavController){
    NavigationAppTheme {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("This is the second screen")
            Button(onClick = {
                navController.navigate(Routes.chat)
            }) {
                Text("Go back to chat")
            }
        }
    }
}