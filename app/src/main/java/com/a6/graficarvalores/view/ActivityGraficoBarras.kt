package com.a6.graficarvalores.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a6.graficarvalores.model.DAOgraficos
import com.a6.graficarvalores.databinding.ActivityGraficoBarrasBinding
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet

class ActivityGraficoBarras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGraficoBarrasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val barDataSet1 = BarDataSet(DAOgraficos.dataBarras1(), "datos1")

        barDataSet1.color = Color.BLUE

        val barData = BarData()
        barData.addDataSet(barDataSet1)

        binding.GraficoBarras.data = barData
        binding.GraficoBarras.invalidate()


    }
}