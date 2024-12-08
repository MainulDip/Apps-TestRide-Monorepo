package com.example.composedemodec2024

import android.annotation.SuppressLint
import android.os.Bundle
import android.transition.Scene
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemodec2024.ui.theme.ComposeDemoDec2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeDemoDec2024Theme {
                Scaffold { paddingValue ->
                    MyApp(Modifier.padding(paddingValue))
                }
            }
        }
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier, names: List<String> = listOf("Word", "Compose")) {
    Surface {
        Column(modifier = modifier) {
            for (name in names) {
                val paddingValue = if (name == names.last()) 0 else 1
                Greeting(
                    name = "$name Bismillah",
                    modifier = Modifier.padding(vertical = paddingValue.dp)
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth().background(MaterialTheme.colorScheme.primary).padding(24.dp)) {
        Text(
            text = "Hello",
//            modifier = modifier
        )
        Text(name)
    }

}

@Preview(showBackground = true, showSystemUi = true, device = "id:pixel_7_pro")
@Composable
fun GreetingPreview() {
    ComposeDemoDec2024Theme {
        Scaffold { paddingValue ->
            MyApp(Modifier.padding(paddingValue))
        }
//        Surface {
//            MyApp()
//        }

    }
}