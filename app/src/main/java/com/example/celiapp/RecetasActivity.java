package com.example.celiapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;

public class RecetasActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);

    }

    private ArrayList<Model> getMyList(){

    ArrayList<Model> models = new ArrayList<>();

    Model m = new Model();
    m.setTitulo("Receta 01");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 02");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 03");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 04");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 05");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 06");
    m.setDescripcion("Descripcion de la receta");

    m = new Model();
    m.setTitulo("Receta 07");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 08");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 09");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 10");
    m.setDescripcion("Descripcion de la receta");

    m = new Model();
    m.setTitulo("Receta 11");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 12");
    m.setDescripcion("Descripcion de la receta");
    models.add(m);

    return models;
    }
}
