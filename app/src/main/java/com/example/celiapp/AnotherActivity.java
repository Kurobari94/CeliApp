package com.example.celiapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    TextView mTitleTv, mDescTv;
    ImageView mImageIv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);


        //boton retorno/retroceso
        ActionBar actionBar = getSupportActionBar();


        mTitleTv =  findViewById(R.id.title);
        mDescTv = findViewById(R.id.description);
        // mImageIv = findViewById(R.id.imageView); Tratamos de que no se vea el icono en la pagina de las recetas


        // ahora obtenemos nuestra informacion que habiamos pueto en el intent
        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        //ahora a decodificar la imagen, por que en la otra actividad lo convertimos en bytes
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0, mBytes.length);

        actionBar.setTitle(mTitle); // el titulo que obtenemos de la anterior actividad que va a ser puesta en nuestra actionbar

        // ahora seteamos nuesta informacion en la vista
        mTitleTv.setText(mTitle);
        mDescTv.setText(mDescription);
//        mImageIv.setImageBitmap(bitmap); Tratamos de no mostrar el icono en la pagina de las recetas

    }
}
