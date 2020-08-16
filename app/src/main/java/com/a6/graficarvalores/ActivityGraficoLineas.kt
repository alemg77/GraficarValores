package com.a6.graficarvalores

import android.graphics.Color
import android.os.Bundle
import android.util.DisplayMetrics
import androidx.appcompat.app.AppCompatActivity
import com.a6.graficarvalores.databinding.ActivityGraficarKotlinBinding
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.LegendEntry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.ValueFormatter
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import java.util.*


class ActivityGraficoLineas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityGraficarKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Crea los datos
        val dao = DAOgraficos()
        val lineDataSet1 = LineDataSet(dao.dataValues1(), "Valores 1")
        val lineDataSet2 = LineDataSet(dao.dataValues2(), "Valores 2")

        // Ajusta la forma que muestra cada linea de datos
        lineDataSet1.lineWidth = 3F
        lineDataSet1.color = Color.GREEN
        lineDataSet1.setDrawCircles(false)
        lineDataSet1.setDrawValues(false)

        lineDataSet2.lineWidth = 2F
        lineDataSet2.color = Color.RED
        lineDataSet2.valueTextSize = 15F

        // Carga los datos en la imagen
        val dataSets = ArrayList<ILineDataSet>()
        dataSets.add(lineDataSet1)
        dataSets.add(lineDataSet2)

        // Ajusta el formato del grafico
        val data = LineData(dataSets)
        val grafico = binding.grafigoLineKotlin
        grafico.data = data
        grafico.invalidate()
        grafico.setBackgroundColor(Color.WHITE)
        grafico.setDrawGridBackground(true)
        grafico.setDrawBorders(true)

        val ds = DisplayMetrics()
        this.windowManager.defaultDisplay.getMetrics(ds)
        val width = ds.widthPixels
        val height = ds.heightPixels

        // Muetra un descriptor del grafico de la imagen
        val description = Description()
        description.text = "Temperaturas"
        description.textColor = Color.BLUE
        description.textSize = 20F
        description.setPosition((width/2).toFloat(), (height*0.1).toFloat())
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
        xAxis.valueFormatter = MyValueFormatterMeses()

    }

    private class MyValueFormatterMeses :
        ValueFormatter() {
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