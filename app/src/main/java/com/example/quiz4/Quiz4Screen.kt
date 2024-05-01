package com.example.quiz4

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quiz4.ui.MenikahScreen
import com.example.quiz4.ui.TaarufScreen
import com.example.quiz4.ui.FormScreen
import com.example.quiz4.ui.StartScreen

enum class Quiz4Screen() {
    Start(),
    Form(),
    Taaruf(),
    Menikah()
}

/**
 * Composable that displays the topBar and displays back button if back navigation is possible.
 */

@Composable
fun Quiz4App() {
    //Create NavController
    val navController = rememberNavController()

    Scaffold(
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = Quiz4Screen.Start.name,
        ) {
            composable(route = Quiz4Screen.Start.name) {
                StartScreen(
                    onStartButtonClicked = {
                        navController.navigate(Quiz4Screen.Form.name)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                )
            }

            composable(route = Quiz4Screen.Form.name) {
                FormScreen(
                    onNextButtonClicked = {
                        navController.navigate(Quiz4Screen.Taaruf.name)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(innerPadding)
                )
            }

            composable(route = Quiz4Screen.Taaruf.name) {
                TaarufScreen(
                    onNextButtonClicked = {
                        navController.navigate(Quiz4Screen.Menikah.name)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(innerPadding)
                )
            }

            composable(route = Quiz4Screen.Menikah.name) {
                MenikahScreen(
                    onNextButtonClicked = {
                        navController.navigate(Quiz4Screen.Start.name)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(innerPadding)
                )
            }

        }
    }
}
