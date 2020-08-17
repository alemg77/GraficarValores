package com.a6.graficarvalores.Interfases

import com.github.mikephil.charting.data.LineData

interface GraficoLineas {

    interface View {
        fun mostrarGrafico(datos : LineData)
    }

    interface Presenter {
        fun gestionarGrafico()
    }

    interface Model {
        fun prepararDatosGraficoLineal(): LineData
    }
}