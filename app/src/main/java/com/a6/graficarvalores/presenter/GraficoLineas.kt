package com.a6.graficarvalores.presenter

interface GraficoLineas {

    interface View {
        fun mostrarGrafico()
    }

    interface Presenter {
        fun prepararGrafico()
    }

    interface Model {
        fun datosGraficos()
    }
}