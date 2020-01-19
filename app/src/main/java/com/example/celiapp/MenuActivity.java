package com.example.celiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v = findViewById(R.id.btn_recetas);
        v.setOnClickListener(this);

        View w = findViewById(R.id.btn_ubicacion);
        w.setOnClickListener(this);

        View x = findViewById(R.id.btn_adicional);
        x.setOnClickListener(this);

        View y = findViewById(R.id.btn_productos);
        y.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {

        if (arg0.getId() == R.id.btn_recetas){
            //definir el intento para la actividad(lo que se quiere hacer)
            Intent intent = new Intent(this,RecetasActivity.class);

            //comenzar la actividad
            this.startActivity(intent);
        }

        else if (arg0.getId() == R.id.btn_ubicacion){
            //definir el intento para la actividad(lo que se quiere hacer)
            Intent intent = new Intent(this,UbicacionActivity.class);

            //comenzar la actividad
            this.startActivity(intent);
        }

        else if (arg0.getId() == R.id.btn_adicional){
            //definir el intento para la actividad(lo que se quiere hacer)
            Intent intent = new Intent(this,AdicionalActivity.class);

            //comenzar la actividad
            this.startActivity(intent);
        }

        else if (arg0.getId() == R.id.btn_productos){
            //definir el intento para la actividad(lo que se quiere hacer)
            Intent intent = new Intent(this,ProductosActivity.class);

            //comenzar la actividad
            this.startActivity(intent);
        }
    }
}
