package com.example.logindemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.logindemo.ui.theme.LoginDemoTheme
import com.example.logindemo.view.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   LoginScreen(btnLoginAction = { username,password-> btnLoginAction(username,password)})
                }
            }
        }
    }
}

fun btnLoginAction(username : String,password : String){
Log.i("isButtonClicked","yes it is ")
}