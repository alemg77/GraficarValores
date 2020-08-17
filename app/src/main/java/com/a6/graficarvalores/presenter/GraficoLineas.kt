package com.a6.graficarvalores.presenter

import com.github.mikephil.charting.data.LineData

interface GraficoLineas {

    interface View {
        fun mostrarGrafico(datos : LineData)
    }

    interface Presenter {
        fun prepararGrafico()
    }

    interface Model {
        fun datosGraficos()
    }
}