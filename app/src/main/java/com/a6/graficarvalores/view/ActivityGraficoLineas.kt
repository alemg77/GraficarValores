package com.a6.graficarvalores.view

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a6.graficarvalores.presenter.GraficoLineas
import com.a6.graficarvalores.presenter.GraficosPresenter
import com.a6.graficarvalores.model.DAOgraficos
import com.a6.graficarvalores.databinding.ActivityGraficarKotlinBinding


class ActivityGraficoLineas : AppCompatActivity(),
    GraficoLineas.View {

    companion object{
        lateinit var binding : ActivityGraficarKotlinBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGraficarKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mostrarGrafico()
    }



    override fun mostrarGrafico() {
        val grafico = binding.grafigoLineKotlin
        grafico.data = DAOgraficos.prepararDatosGraficoLineal()
        grafico.invalidate()
        grafico.setBackgroundColor(Color.WHITE)
        grafico.setDrawGridBackground(true)
        grafico.setDrawBorders(true)
        val graficoPresenter : GraficosPresenter =
            GraficosPresenter()
        graficoPresenter.tunerGrafico(grafico)


    }
}

