package com.a6.graficarvalores.presenter

import android.graphics.Color
import com.a6.graficarvalores.MainActivity
import com.a6.graficarvalores.model.DAOgraficos
import com.a6.graficarvalores.view.ActivityGraficoLineas
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.LegendEntry
import com.github.mikephil.charting.formatter.ValueFormatter

class GraficosPresenter (var activityGrafico: GraficoLineas.View): GraficoLineas.Presenter {

    override fun gestionarGrafico() {
        activityGrafico.mostrarGrafico(DAOgraficos.prepararDatosGraficoLineal())
    }

}

