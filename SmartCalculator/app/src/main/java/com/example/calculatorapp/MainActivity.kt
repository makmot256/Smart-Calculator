package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.example.calculatorapp.ui.theme.CalculatorAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val calculatorViewModel = ViewModelProvider(this)[CalculatorViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            CalculatorAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Calculator(modifier = Modifier.padding(innerPadding), calculatorViewModel)
                }
            }
        }
    }
}

