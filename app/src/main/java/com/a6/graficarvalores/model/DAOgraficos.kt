package com.a6.graficarvalores.model

import android.graphics.Color
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import java.util.ArrayList

object DAOgraficos {

    fun dataBarras1(): ArrayList<BarEntry>? {
        val dataVals = ArrayList<BarEntry>()
        dataVals.add(BarEntry(0F, 3F))
        dataVals.add(BarEntry(1F, 4F))
        dataVals.add(BarEntry(2F, 2F))
        dataVals.add(BarEntry(3F, 7F))
        return dataVals
    }

    fun dataBarras2(): ArrayList<BarEntry>? {
        val dataVals = ArrayList<BarEntry>()
        dataVals.add(BarEntry(0F, 1F))
        dataVals.add(BarEntry(1F, 7F))
        dataVals.add(BarEntry(2F, 2F))
        dataVals.add(BarEntry(3F, 3F))
        return dataVals
    }

    fun dataValues1(): ArrayList<Entry>? {
        val dataVals = ArrayList<Entry>()
        dataVals.add(Entry(0F, 25F))
        dataVals.add(Entry(1F, 26F))
        dataVals.add(Entry(2F, 24F))
        dataVals.add(Entry(3F, 28F))
        return dataVals
    }

    fun dataValues2(): ArrayList<Entry>? {
        val dataVals = ArrayList<Entry>()
        dataVals.add(Entry(0F, 30F))
        dataVals.add(Entry(1F, 34F))
        dataVals.add(Entry(2F, 28F))
        dataVals.add(Entry(3F, 36F))
        return dataVals
    }

    fun prepararDatosGraficoLineal(): LineData {
        val lineDataSet1 = LineDataSet(dataValues1(), "Valores 1")
        val lineDataSet2 = LineDataSet(dataValues2(), "Valores 2")
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

        return LineData(dataSets)
    }




}