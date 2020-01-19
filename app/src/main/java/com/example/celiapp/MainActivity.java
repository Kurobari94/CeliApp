package com.example.celiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v = findViewById(R.id.btn_recetas);
        v.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {

        if (arg0.getId() == R.id.btn_recetas){
            //definir el intento para la actividad(lo que se quiere hacer)
            Intent intent = new Intent(this,RecetasActivity.class);

            //comenzar la actividad
            this.startActivity(intent);
        }
    }
}
