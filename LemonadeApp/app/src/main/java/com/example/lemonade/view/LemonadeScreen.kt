package com.example.lemonade.view


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.R

@Composable
fun LemonadeScree(){
    var image by remember { mutableStateOf(1)}
    var rand by remember { mutableStateOf((3..5).random())}
    var count by remember { mutableStateOf(1) }
    var imageResource = when(image){
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
    var stringResources = when(image){
        1 -> R.string.tree
        2 -> R.string.lemon
        3 -> R.string.lemonade
        else -> R.string.glass
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )    {
        Image(
            modifier = Modifier.clickable {
                if( image ==2 ){
                    if(count < rand){
                        count++
                    }else{
                        image = (image + 1) % 4
                        rand = (3..5).random()
                        count = 1
                    }
                }else{
                    image = (image + 1) % 4
                }
                 },
            painter = painterResource(imageResource),
            contentDescription = "tree")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = stringResource(stringResources))
    }
}
@Preview(showBackground = true)
@Composable
fun LemonadeScreenpreview(){
    LemonadeScree()
}