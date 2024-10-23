package com.example.modifierprojectedu

import android.content.Context
import android.os.Bundle
import android.widget.Space
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.modifierprojectedu.ui.theme.ModifierProjectEduTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModifierProjectEduTheme {
                Event(context = LocalContext.current)
            }
        }
    }
}

@Composable
fun Size(modifier: Modifier = Modifier){
    Box(
        modifier = modifier.background(Color.Blue).fillMaxSize()
    ){

    }
}

@Composable
fun Array(modifier: Modifier = Modifier){
    Box(
        modifier = modifier.fillMaxSize().padding(16.dp).background(Color.Yellow)
    ){
        Text(
            text = "가운데 정렬",
            fontSize = 30.sp,
            modifier = modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun Shape(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .size(500.dp)
            .background(Color.Green)
            .border(2.dp, Color.Red)
    ){

    }
}

@Composable
fun Shape2(modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .size(500.dp)
            .background(Color.Green)
            .clip(RoundedCornerShape(100.dp))
    ){

    }
}

@Composable
fun Event(context: Context, modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .size(500.dp)
            .background(Color.Cyan)
            .clickable {
                Toast.makeText(context, "클릭", Toast.LENGTH_SHORT).show()
            }
    ){

    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    ModifierProjectEduTheme {
        Event(context = LocalContext.current)
    }
}