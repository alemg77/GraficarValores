package com.a6.graficarvalores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import com.a6.graficarvalores.databinding.ActivityMainBinding
import com.a6.graficarvalores.view.ActivityGraficoBarras
import com.a6.graficarvalores.view.ActivityGraficoLineas
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    companion object{
        var anchoPantallaEnPixel by Delegates.notNull<Int>()
        var altoPantallaEnPixel by Delegates.notNull<Int>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ds = DisplayMetrics()
        val defaultDisplay = this.windowManager.defaultDisplay
        defaultDisplay.getMetrics(ds)
        anchoPantallaEnPixel = ds.widthPixels
        altoPantallaEnPixel = ds.heightPixels


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

