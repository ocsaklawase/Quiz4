package com.example.quiz4.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz4.R
import com.example.quiz4.ui.theme.Quiz4Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(
    onStartButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painterResource(R.drawable.sakinah),
                    contentDescription = null
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End,
                    text = stringResource(R.string.v_2312_3101),
                    fontSize = 15.sp
                )
            }
        }
    )
    Column(
        modifier = modifier.padding(10.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 10.dp),
                text = stringResource(R.string.temukan_pasangan),
                fontSize = 30.sp
            )
            Row (
                modifier = Modifier.padding(start = 20.dp, bottom = 10.dp)
            ) {
                Text(
                    text = stringResource(R.string.melalui),
                    fontSize = 30.sp,
                    textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.padding(3.dp))
                Text(
                    text = stringResource(R.string.taaruf),
                    fontSize = 30.sp,
                    textAlign = TextAlign.Start,
                    color = Color.Red
                )
            }
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 10.dp),
                text = stringResource(R.string.membangun_rumah),
                fontSize = 30.sp
            )
            Row (
                modifier = Modifier.padding(start = 20.dp, bottom = 10.dp)
            ) {
                Text(
                    text = stringResource(R.string.tangga),
                    fontSize = 30.sp,
                    textAlign = TextAlign.Start
                )
                Spacer(modifier = Modifier.padding(3.dp))
                Text(
                    text = stringResource(R.string.sakinah),
                    fontSize = 30.sp,
                    textAlign = TextAlign.Start,
                    color = Color.Red
                )
            }
        Image(
            modifier = Modifier.padding(30.dp),
            painter = painterResource(R.drawable.wedding),
            contentDescription = null
        )
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            Button(
                onClick = onStartButtonClicked,
                Modifier
                    .widthIn(min = 250.dp)
                    .padding(top = 30.dp, bottom = 10.dp),

                ) {
                Text(stringResource(R.string.mulai))
            }
        }
    }
}

@Preview
@Composable
fun StartPreview(){
    Quiz4Theme(darkTheme = false) {
        StartScreen(
            onStartButtonClicked = {},
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_medium))
                .fillMaxSize()
        )
    }
}
