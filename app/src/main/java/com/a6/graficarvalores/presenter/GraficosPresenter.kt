package com.a6.graficarvalores.presenter

import com.a6.graficarvalores.Interfases.GraficoLineas
import com.a6.graficarvalores.model.DAOgraficos

class GraficosPresenter (var activityGrafico: GraficoLineas.View): GraficoLineas.Presenter {

    private val algo: GraficoLineas.Model = DAOgraficos()

    override fun gestionarGrafico() {
        activityGrafico.mostrarGrafico(algo.prepararDatosGraficoLineal())
    }

}

