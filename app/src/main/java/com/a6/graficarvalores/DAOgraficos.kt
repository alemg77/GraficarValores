package com.a6.graficarvalores

import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.Entry
import java.util.ArrayList

class DAOgraficos {


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
}