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

public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

        Context c;
        ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, int i) {

        myHolder.mTitle.setText(models.get(i).getTitulo());
//        myHolder.mDes.setText(models.get(i).getDescripcion());  intento de dejar que no muestre la descripcion en el row
        myHolder.mImageView.setImageResource(models.get(i).getImg());



        // este metodo es para usar con 1 sola actividad

        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {

                String gTitle = models.get(position).getTitulo();
                String gDesc = models.get(position).getDescripcion();
                BitmapDrawable bitmapDrawable = (BitmapDrawable)myHolder.mImageView.getDrawable();


                Bitmap bitmap = bitmapDrawable.getBitmap();

                ByteArrayOutputStream stream = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.PNG,100, stream);

                byte[] bytes = stream.toByteArray();
                Intent intent = new Intent(c, AnotherActivity.class);
                intent.putExtra("iTitle", gTitle);
                intent.putExtra("iDesc", gDesc);
                intent.putExtra("iImage",bytes);
                c.startActivity(intent);


            }
        });



        // si queremos usar varias actividades, usar esta
      /*  myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                if (models.get(position).getTitulo().equals("Receta 01")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 02")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 03")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 04")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 05")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 06")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 07")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 08")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 09")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 10")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 11")){
                    //
                }

                if (models.get(position).getTitulo().equals("Receta 12")){
                    //
                }
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
