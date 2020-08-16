package com.a6.graficarvalores

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a6.graficarvalores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val meses = arrayOf<String> ("Enero", "Febrero", "Marzo", "Abril", "Mayo")
        val colores = arrayListOf<Int>(Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.RED)


        val intent = Intent( this, ActivityGraficarKotlin::class.java)
        startActivity(intent)

    }


}

