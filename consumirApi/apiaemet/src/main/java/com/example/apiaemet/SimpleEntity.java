package com.example.apiaemet;

public class SimpleEntity {
    protected String descripcion;

    protected int estado;

    protected String datos;

    protected String metadatos;

    public SimpleEntity(String descripcion, int estado, String datos, String metadatos) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.datos = datos;
        this.metadatos = metadatos;
    }

    public SimpleEntity(){

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getMetadatos() {
        return metadatos;
    }

    public void setMetadatos(String metadatos) {
        this.metadatos = metadatos;
    }
}
