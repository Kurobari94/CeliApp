package com.example.celiapp.video;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.celiapp.R;


public class WebViewActivity extends AppCompatActivity {

    WebView wvContenido;
    String contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

       wvContenido = findViewById(R.id.wvContenido);

        wvContenido.getSettings().setJavaScriptEnabled(true);
        wvContenido.getSettings().setAppCacheEnabled(true);

        Intent intent = getIntent();
        contenido = intent.getStringExtra("contenido");
        wvContenido.loadDataWithBaseURL("",contenido,"text/html","utf-8","");
    }
}
