package com.a6.graficarvalores;

import androidx.appcompat.app.AppCompatActivity;

import android.media.audiofx.AudioEffect;
import android.os.Bundle;

import com.a6.graficarvalores.databinding.ActivityMostarGraficosJavaBinding;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class ActivityGraficarJava extends AppCompatActivity {

    private ActivityMostarGraficosJavaBinding binding;

    private ArrayList<Entry> dataValues1() {
        ArrayList<Entry> dataVals = new ArrayList<>();
        dataVals.add(new Entry(0, 20));
        dataVals.add(new Entry(1, 24));
        dataVals.add(new Entry(2, 2));
        dataVals.add(new Entry(3, 10));
        return dataVals;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMostarGraficosJavaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        LineDataSet lineDataSet1 = new LineDataSet(dataValues1(), "Data Set1");
        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet1);

        LineData data = new LineData(dataSets);
        binding.graficoLineas.setData(data);

        Description description = new Description();
        description.setText("zoom");



    }
}