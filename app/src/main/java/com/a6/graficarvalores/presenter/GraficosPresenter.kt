package com.a6.graficarvalores.presenter

import android.graphics.Color
import com.a6.graficarvalores.view.MainActivity
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.LegendEntry
import com.github.mikephil.charting.formatter.ValueFormatter

class GraficosPresenter {


    fun tunerGrafico ( grafico: LineChart){
        val widhtScreen = MainActivity.altoPantallaEnPixel.toFloat()
        val heightScreen = MainActivity.altoPantallaEnPixel.toFloat()

        val description = Description()
        description.text = "Temperaturas"
        description.textColor = Color.BLUE
        description.textSize = 20F
        description.setPosition((widhtScreen*0.3).toFloat(), (heightScreen*0.1).toFloat())
        grafico.description = description

        // Ajusta las leyenda de los datos en la parte inferior de los datos
        val legend = grafico.legend
        legend.isEnabled = true
        legend.textColor = Color.BLACK
        legend.textSize = 15F
        legend.form = Legend.LegendForm.CIRCLE
        legend.xEntrySpace = 20F // Separacion entre las leyendas de cada muestra de datos.

        val legendEntries = arrayOfNulls<LegendEntry>(2)
        val legendEntry = LegendEntry()
        legendEntry.formColor = Color.RED
        legendEntry.label = "Exterior"
        legendEntries[0] = legendEntry

        val legendEntry2 = LegendEntry()
        legendEntry2.formColor = Color.GREEN
        legendEntry2.label = "Interior"
        legendEntries[1] = legendEntry2
        legend.setCustom(legendEntries)

        // Ajuste de los ejes
        val xAxis = grafico.xAxis
        val yAxisLeft = grafico.axisLeft
        val yAxisRight = grafico.axisRight
        xAxis.valueFormatter =
            MyValueFormatterMeses()
    }

    private class MyValueFormatterMeses : ValueFormatter() {
        override fun getFormattedValue(value: Float): String {
            when (value.toString()) {
                "0.0" -> return "Enero"
                "1.0" -> return "Febrero"
                "2.0" -> return "Marzo"
                "3.0" -> return "Abril"
            }
            return " "
        }
    }
}

