package com.example.celiapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * esta clase permite controlar una lista de tipo string, que se v
 */

public class DatosRecyclerViewAdapter extends RecyclerView.Adapter<DatosRecyclerViewAdapter.ViewHolder> {

    private ArrayList<Model> ldrv;

    ItemSeleccionado actividad;

    public interface ItemSeleccionado{
        void onItemSeleccionado(int index);
    }

    public DatosRecyclerViewAdapter(Context context, ArrayList<Model> lista){
        ldrv = lista;
        actividad = (ItemSeleccionado) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivIcono;
        TextView tvTitulo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivIcono = itemView.findViewById(R.id.imageIv);
            tvTitulo = itemView.findViewById(R.id.titleTv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    actividad.onItemSeleccionado(ldrv.indexOf((Model) v.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public DatosRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull DatosRecyclerViewAdapter.ViewHolder holder, int position) {

        holder.itemView.setTag(ldrv.get(position));
        holder.tvTitulo.setText(ldrv.get(position).getTitulo());

    }

    @Override
    public int getItemCount() {
        return ldrv.size();
    }
}
