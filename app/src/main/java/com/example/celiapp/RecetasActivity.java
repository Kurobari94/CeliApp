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
    m.setTitulo("Sopa de Verduras Y Trigo Sarraceno");
    m.setDescripcion("    2 cebolletas\n" +
            "    2 zanahorias\n" +
            "    2 puerros\n" +
            "    100 gr de champiñones\n" +
            "    100 gr de trigo sarraceno\n" +
            "    30 gr de lentejas rojas\n" +
            "    aceite de oliva virgen extra\n" +
            "    sal\n" +
            "    6-8 hojas de menta\n" +
            "    perejil\n" +
            "\n" +
            "Elaboración:\n" +
            "Para hacer el caldo, pon a cocer en una cazuela con agua las partes verdes de las cebolletas, de las zanahorias y de los puerros (bien limpios). Sazona, añade unas ramas de perejil y cuécelos durante 15 minutos. Cuela y reserva el caldo.\n" +
            "Pela y pica las cebolletas, los puerros y las zanahoria finamente. Pon a pochar en una cazuela con un chorrito de aceite. Lava los champiñones, córtalos en cuartos y láminalos. Añade y rehógalos. Agrega las lentejas rojas, enjuaga el trigo sarraceno y añádelo.\n" +
            "Cubre con el caldo y cuece todo durante unos 20 minutos a fuego suave. Pon a punto de sal. Desgrasa con ayuda de un cacillo.\n" +
            "Sirve la sopa de verduras y trigo sarraceno. Pica las hojas de menta y salpica la sopa. ");
    m.setImg(R.drawable.recipe);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 02");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.player);
    models.add(m);

    m = new Model();
    m.setTitulo("Hamburguesas de verduras con salsa de tomate");
    m.setDescripcion("    1/2 coliflor\n" +
            "    1/2 calabacín\n" +
            "    1 cebolla\n" +
            "    2 zanahorias\n" +
            "    8 ajos frescos\n" +
            "    1 patata\n" +
            "    50 g de copos de avena (finos)\n" +
            "    50 g de harina de garbanzo\n" +
            "    1 cucharada de orégano\n" +
            "    250 ml de salsa de tomate\n" +
            "    aceite de oliva virgen extra\n" +
            "    sal\n" +
            "    perejil\n" +
            "\n" +
            "Elaboración:\n" +
            "Cuece la patata en una cazuela con agua durante 30 minutos. Pela y pásala por el pasapurés. Reserva.\n" +
            "Pela la cebolla, córtala en daditos y ponla a pochar en una sartén con un poco de aceite. Pica los ajos frescos en cilindros y añádelos. Sazona y rehoga bien.\n" +
            "Limpia la coliflor, rállala y añádela a la sartén. Pica el calabacín en daditos muy pequeños y agrégalos. Pela las zanahorias, ralla e incorpóralas. Pocha el conjunto durante 30-35 minutos a fuego suave.\n" +
            "Coloca todo en un bol y añade el puré de patata. Añade los copos de avena, la harina de garbanzo y el orégano. Pon a punto de sal, mezcla y deja reposar durante 5 minutos.\n" +
            "Divide la masa en 8 porciones y dales forma de hamburguesa.\n" +
            "Pon la plancha a calentar con un chorrito de aceite de aceite. Agrega las hamburguesas y cocínalas a la plancha durante 3 minutos por cada lado.\n" +
            "Sirve y acompáñalas con la salsa de tomate caliente. Decora con una ramita de perejil.\n" +
            "\n" +
            "Consejo:\n" +
            "También se pueden picar las verduras con un procesador de alimentos.");
    m.setImg(R.drawable.recipe);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 04");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.player);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 05");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.recipe);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 06");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.player);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 07");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.recipe);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 08");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.player);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 09");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.recipe);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 10");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.player);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 11");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.recipe);
    models.add(m);

    m = new Model();
    m.setTitulo("Receta 12");
    m.setDescripcion("Descripcion de la receta");
    m.setImg(R.drawable.player);
    models.add(m);

    return models;

    }
}
