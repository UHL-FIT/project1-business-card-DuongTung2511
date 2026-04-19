package com.example.danhthiep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.danhthiep.ui.theme.DanhthiepTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DanhthiepTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    HienthiDanhthiep()
                }
            }
        }
    }
}

@Composable
fun HienthiDanhthiep(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD8EDD8))
    ) {
        Column(
            modifier = Modifier
                .weight(0.70f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Anhdaidien()
            Spacer(modifier = Modifier.height(20.dp))
            TenChucdanh()
        }

        Column(
            modifier = Modifier
                .weight(0.30f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Lienhe()
        }
    }
}
@Composable
fun Anhdaidien(){
    Image(
        painter= painterResource(id=R.drawable.android_logo),
        contentDescription ="Ảnh đại diện",
        modifier= Modifier
            .size(120.dp)
            .background(Color.DarkGray)
    )
}
@Composable
fun TenChucdanh(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Jennifer Doe",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color=Color(0xFF333333)
            )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 18.sp,
            color = Color(0xFF3DDC84)
        )
    }
}
@Composable
fun Lienhe(){
    Box (modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Column(
            verticalArrangement = Arrangement.spacedBy(18.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Donglienhe(
                icon = Icons.Default.Phone,
                text = "+84 123 456 789",
                mota = "Số điện thoại",
            )
            Donglienhe(
                icon = Icons.Default.Share,
                text = "@Androiddev",
                mota = "github"
            )
            Donglienhe(
                icon = Icons.Default.Email,
                text = "jonhdoe@android.com",
                mota = "email"
            )
        }
    }
}
@Composable
fun Donglienhe(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    text: String,
    mota: String
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = mota,
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text=text,
            fontSize = 16.sp,
            color = Color.DarkGray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DanhthiepTheme {
        HienthiDanhthiep()
    }
}