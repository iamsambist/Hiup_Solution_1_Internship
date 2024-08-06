package com.example.counter.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.counter.ui.theme.CounterTheme




@Composable
fun CounterScreen(){
    var count by remember { mutableStateOf(0)}
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        contentAlignment = Alignment.Center){
        Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
        ){
            Icon(

                modifier = Modifier
                    .weight(1f)
                    .clickable {
                    count--
                },
                imageVector =Icons.Filled.KeyboardArrowDown ,
                contentDescription ="decrease Count"
                )

            Text(text = "Count = $count",
                modifier = Modifier
                    .size(40.dp)
                    .weight(3f),
                textAlign = TextAlign.Center

            )

            Icon(
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                    count++
                },
                imageVector =Icons.Filled.KeyboardArrowUp,
                contentDescription ="Increase Count" )
        }

    }

}



@Preview(showBackground = true)
@Composable
fun CounterScreenPreview(){
    CounterTheme{
        CounterScreen()
    }
}