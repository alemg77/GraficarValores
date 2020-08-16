package com.a6.graficarvalores

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a6.graficarvalores.databinding.ActivityGraficarKotlinBinding
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import java.util.*

class ActivityGraficarKotlin : AppCompatActivity() {


    private fun dataValues1(): ArrayList<Entry>? {
        val dataVals = ArrayList<Entry>()
        dataVals.add(Entry(0F, 20F))
        dataVals.add(Entry(1F, 24F))
        dataVals.add(Entry(2F, 18F))
        dataVals.add(Entry(3F, 16F))
        return dataVals
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityGraficarKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val lineDataSet1 = LineDataSet(dataValues1(), "Data Set1")
        val dataSets = ArrayList<ILineDataSet>()
        dataSets.add(lineDataSet1)

        val data = LineData(dataSets)
        binding.grafigoLineKotlin.data = data

    }
}