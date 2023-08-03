package com.company0ne.blogapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.company0ne.blogapp.ui.theme.BlogAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            App()

        }
    }
}

@Composable
fun App() {
    var theme = remember { mutableStateOf(false) }
    BlogAppTheme(theme.value) {
        Column(Modifier.background(MaterialTheme.colors.background)){
            Text(
                text = "BlogApp",
                style = MaterialTheme.typography.h1
            )
            Button(onClick = {
                theme.value = !theme.value
            }) {
                Text(text = "Change Theme")
            }
        }
    }
}

//@Composable
//fun Greeting(name: String){
//    Text(text = "Hello $name!")
//}
//@Preview
//@Composable
//fun DefaultPreview(){
//    BlogAppTheme {
//        Greeting(name = "Android")
//
//    }
//}