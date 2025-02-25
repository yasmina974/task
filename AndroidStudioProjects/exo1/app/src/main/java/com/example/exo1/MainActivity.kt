package com.example.exo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.exo1.ui.theme.Exo1Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Exo1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(

                    )

                }



                }
            }
        }
    }



@Composable
fun GreetingImage(modifier: Modifier = Modifier ) {
    val image = painterResource(R.drawable.bg_compose_background)

    Box {
        Image(
            painter = image,
            contentDescription = null,


            )
    }
}


@Composable
fun GreetingText(message: String,modifier: Modifier = Modifier) {
    Text(
        text = from,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)
            .align(alignment = Alignment.End)
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Exo1Theme {
        GreetingImage(
        )
        GreetingText(message = "Happy Birthday Sam!")
    }
    }


