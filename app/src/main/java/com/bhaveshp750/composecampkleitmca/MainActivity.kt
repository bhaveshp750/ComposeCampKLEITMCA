package com.bhaveshp750.composecampkleitmca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.bhaveshp750.composecampkleitmca.ui.theme.ComposeCampKLEITMCATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCampKLEITMCATheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayBackgroundImage()
                }
            }
        }
    }
}


@Composable
fun BirthdayGreetingWithText(message: String) {
    Column {
        Text(
            text = message,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(
                    Alignment.Center
                )
        )
        Text(
            text = "- from Bhavesh",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(
                    Alignment.Center
                )
        )
    }
}

@Composable
fun BirthdayBackgroundImage() {
    Box {
        Image(
            painter = painterResource(
                id = R.drawable.androidparty
            ),
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText("Happy Birthday")
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeCampKLEITMCATheme {
//        BirthdayGreetingWithText("Happy Birthday")
        BirthdayBackgroundImage()
    }
}