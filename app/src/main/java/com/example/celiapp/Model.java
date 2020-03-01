package com.example.celiapp;


public class Model {
    private String titulo, descripcion;

    public Model(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}



/*
public class Model {

    private String titulo, descripcion;
    private int img;

    String getTitulo() {
        return titulo;
    }

    void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    String getDescripcion() {
        return descripcion;
    }

    void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
*/
