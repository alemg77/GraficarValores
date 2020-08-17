package com.a6.graficarvalores.view

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a6.graficarvalores.Interfases.GraficoLineas
import com.a6.graficarvalores.presenter.GraficosPresenter
import com.a6.graficarvalores.databinding.ActivityGraficarKotlinBinding
import com.github.mikephil.charting.data.LineData

class ActivityGraficoLineas : AppCompatActivity(), GraficoLineas.View {

    companion object{
        lateinit var binding : ActivityGraficarKotlinBinding
    }

    private val algo : GraficoLineas.Presenter = GraficosPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGraficarKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        algo.gestionarGrafico()
    }

    override fun mostrarGrafico (datos : LineData) {

        // Muestro los datos que me llegaron
        binding.grafigoLineKotlin.data = datos
        binding.grafigoLineKotlin.invalidate()
        binding.grafigoLineKotlin.setBackgroundColor(Color.WHITE)
        binding.grafigoLineKotlin.setDrawGridBackground(true)
        binding.grafigoLineKotlin.setDrawBorders(true)

        // Maquilla la imagen.
        GraphicMakeup.tunerGraficoTemperatura(binding.grafigoLineKotlin)
    }
}

