package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                )
                {
                    GreetingImage("Jetpack Compose tutorial","Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.","In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
                }

            }
        }
    }
}

@Composable
fun GreetingImage(titre: String,paragraph1:String,paragraph2:String, modifier: Modifier = Modifier){
   val image = painterResource(R.drawable.bg_compose_background)
        Column(modifier=Modifier.fillMaxSize()){
            Image(
                painter = image,
                contentDescription = null,
                modifier = modifier.fillMaxWidth()

            )
            GreetingInfo(
                titre=titre,
                paragraph1=paragraph1,
                paragraph2=paragraph2,
                modifier=modifier.background(Color.White)

            )
        }
}

@Composable
fun GreetingInfo(titre: String,paragraph1:String,paragraph2:String, modifier: Modifier = Modifier) {

    Column {
        Text(
            text = titre,
            fontSize=24.sp,
            modifier = modifier.padding(16.dp),

            )
        Text(
            text=paragraph1,
            fontSize = 18.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(
                start = 16.dp,
                end=16.dp,
            )
        )

        Text(
            text=paragraph2,
            fontSize = 18.sp,
            textAlign= TextAlign.Justify,
            modifier= modifier.padding(16.dp)
        )

    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        GreetingImage("Jetpack Compose tutorial","Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.","In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}