package com.example.media;

public class TemperaturaResponse {

    protected String nombreLocalidad;
    protected int temperaturaMaxima;
    protected int temperaturaMinima;

    public TemperaturaResponse() {
    }

    public TemperaturaResponse(String nombreLocalidad, int temperaturaMaxima, int temperaturaMinima) {
        this.nombreLocalidad = nombreLocalidad;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(int temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }


    
    
    
}
