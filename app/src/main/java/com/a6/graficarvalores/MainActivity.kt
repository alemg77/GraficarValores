package com.a6.graficarvalores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.a6.graficarvalores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.botonVerGraficoLineas.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, ActivityGraficoLineas::class.java)
            startActivity(intent)
        })

        binding.botonVerGraficoBarras.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, ActivityGraficoBarras::class.java)
            startActivity(intent)
        })

    }

}

