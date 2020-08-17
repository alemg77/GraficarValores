package com.a6.graficarvalores.view

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a6.graficarvalores.MainActivity
import com.a6.graficarvalores.presenter.GraficoLineas
import com.a6.graficarvalores.presenter.GraficosPresenter
import com.a6.graficarvalores.databinding.ActivityGraficarKotlinBinding
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.LegendEntry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.formatter.ValueFormatter


class ActivityGraficoLineas : AppCompatActivity(), GraficoLineas.View {

    companion object{
        lateinit var binding : ActivityGraficarKotlinBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGraficarKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val graficoPresenter = GraficosPresenter(this)
        graficoPresenter.encargate()
    }

    override fun mostrarGrafico (datos : LineData) {
        binding.grafigoLineKotlin.data = datos
        binding.grafigoLineKotlin.invalidate()
        binding.grafigoLineKotlin.setBackgroundColor(Color.WHITE)
        binding.grafigoLineKotlin.setDrawGridBackground(true)
        binding.grafigoLineKotlin.setDrawBorders(true)
        GraphicMakeup.tunerGraficoTemperatura(binding.grafigoLineKotlin)
    }
}

