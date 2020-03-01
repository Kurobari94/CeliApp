package com.example.celiapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.celiapp.video.WebViewActivity;

import java.util.ArrayList;

public class RecetasActivity extends AppCompatActivity implements DatosRecyclerViewAdapter.ItemSeleccionado{

    RecyclerView rvLista;
    //MyAdapter myAdapter;
    RecyclerView.Adapter adaptador;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Model> ldrv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        rvLista = findViewById(R.id.rvLista);
        rvLista.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvLista.setLayoutManager(layoutManager);

        //myAdapter = new MyAdapter(this, getMyList());
        //mRecyclerView.setAdapter(myAdapter);


        ldrv = new ArrayList<Model>();
        ldrv.add(new Model("Hamburguesas de lentejas, arroz y berenjena"," " +
                "    200 g de lenteja pardina \n" +
                "    150 g de arroz integral (remojado) \n" +
                "    3 cebolletas \n" +
                "    6 tomates deshidratados en aceite \n" +
                "    4 dientes de ajo \n" +
                "    1 berenjena \n" +
                "    1 cucharada de tomillo \n" +
                "    25 g de pasas \n" +
                "    125 g de harina de garbanzo \n" +
                "    aceite de oliva virgen extra \n" +
                "    sal \n" +
                "    perejil \n" +
                "Elaboración \n" +
                "Pon las lentejas en una cazuela y cúbrelas con agua. Corta los tallos de las cebolletas y pícalos en daditos. Sazona y cocina las lentejas durante 20 minutos aproximadamente. Escúrrelas bien y ponlas en un bol.\n" +
                "\n" +
                "Pon agua a calentar en la olla rápida. Agrega el arroz y cuatro partes de agua. Sazona. Coloca la tapa y cuécelo durante 8 minutos a partir de que comience a salir el vapor. Escurre y resérvalo en otro bol.\n" +
                "\n" +
                "Pela la cebolleta y 2 dientes de ajo, pícalos en daditos y ponlos a rehogar en una sartén con un chorrito de aceite. Pela la berenjena, córtala en daditos y añádelos a la sartén. Rehoga conjuntamente y sazona. Pica las pasas e incorpóralas. Agrega también el tomillo. Pasa las verduras a un bol grande.\n" +
                "\n" +
                "Añade el arroz, las lentejas y 100 gramos de harina de garbanzo (reserva el resto). Mezcla los ingredientes hasta conseguir una masa compacta. Tapa la masa con film de cocina (de manera que este en contacto con la masa) y déjala reposando en el frigorífico durante 1 hora.\n" +
                "\n" +
                "Pela y pica los otros 2 dientes de ajo y las otras 2 cebolletas. Pica un poco los tomates deshidratados y pon todo a rehogar en una cazuela con un chorrito de aceite. Cuando las verduras estén un poco rehogadas, añade un vaso de agua, sazona y cocina los ingredientes durante unos 10 minutos aproximadamente. Tritura los ingredientes hasta conseguir una salsa espesa.\n" +
                "\n" +
                "Forma las hamburguesas y colócalas en una fuente espolvoreada con el resto de la harina de garbanzos. Calienta una plancha, agrega un chorrito de aceite y cocina las hamburguesas a la plancha durante 3 minutos por cada lado.\n" +
                "\n" +
                "Sirve las hamburguesas, espolvoréalas con perejil picado y acompáñalas con la salsa. Adorna con unas hojas de perejil. "));
        ldrv.add(new Model("Receta 1","Gran descripción de la Receta 1!!!"));
        ldrv.add(new Model("Receta 1","Gran descripción de la Receta 1!!!"));
        ldrv.add(new Model("Pizza y galletas para celiacos","<iframe width=\"400\" height=\"300\" " +
                "src=\"https://www.youtube.com/embed/HktOrU68MBY\" " +
                "frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" " +
                "allowfullscreen></iframe>"));

        adaptador = new DatosRecyclerViewAdapter(this,ldrv);

        rvLista.setAdapter(adaptador);
    }



    @Override
    public void onItemSeleccionado(int index) {
        String contenido = "<h3>" + ldrv.get(index).getTitulo() + "</h3>"
                + "<p>" + ldrv.get(index).getDescripcion() + "</p>";

        Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
        intent.putExtra("contenido",contenido);
        startActivity(intent);
    }

}
