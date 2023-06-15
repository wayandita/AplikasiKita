package com.example.aplikasikita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity

class Produksemua : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produksemua)
        val namas:List<String> = listOf("alesha voal 140","pasmina cerut","bergo zara","zayana voal");
        val fotos:List<Int> = listOf(R.drawable.alesha,R.drawable.pasmina,R.drawable.bergo,R.drawable.zayana);

    }
}