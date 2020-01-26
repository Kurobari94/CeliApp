package com.example.celiapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private Context c;
    private ArrayList<Model> models;


    MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext() ).inflate(R.layout.row, null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {

        myHolder.mTitle.setText(models.get(i).getTitulo());
        myHolder.mDes.setText(models.get(i).getDescripcion());
        myHolder.mImageView.setImageResource(models.get(i).getImg());



        // este metodo es cuando queremos  usar una actividad
        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                String gTitle = models.get(position).getTitulo();
                String gDesc = models.get(position).getDescripcion(); // este objeto obtiene nuestra informaicion desde otra actividad
                BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable(); // esto obtiene la imagen desde Drawable

                Bitmap bitmap = bitmapDrawable.getBitmap();


                ByteArrayOutputStream stream = new ByteArrayOutputStream(); // la imagen tendra stream y bytes

                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream); // esto comprime la imagen

                byte[] bytes = stream.toByteArray();

                // ahora obtendremos nuestra informacion con intent
                Intent intent = new Intent(c, AnotherActivity.class);
                intent.putExtra("iTitle", gTitle);
                intent.putExtra("iDesc", gDesc); // obtiene la informacion y lo pone en intent
                intent.putExtra("iImage", bytes);

                c.startActivity(intent);


            }
        });

        // este metodo es cuando queremos usar en varias actividades

        /*
        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                if (models.get(position).getTitulo().equals("Receta 01")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 02")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 03")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 04")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 05")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 06")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 07")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 08")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 09")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 10")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 11")){
                    // entonces podemos mover otra acticidad
                }
                if (models.get(position).getTitulo().equals("Receta 12")){
                    // entonces podemos mover otra acticidad
                }

            }
        });

         */



    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
