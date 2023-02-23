package com.example.media;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class CalculadoraService {

    public int suma(OkHttpClient client, int sumaTemperaturaMedia, TemperaturaResponse temperaturaResponse, int temperaturaBucle)
            throws NumberFormatException, IOException {

        Request request = new Request.Builder()
                .url("http://localhost:4344/operaciones/suma?ope1=" + sumaTemperaturaMedia + "&ope2="
                        + temperaturaBucle)
                .get()
                .addHeader("cache-control", "no-cache")
                .build();

        Response response = null;

        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(response.body().string());
    }
    
    public int division(OkHttpClient client, int sumaTemperaturaMedia, int tamano)
    throws NumberFormatException, IOException {


        Request request = new Request.Builder()
                .url("http://localhost:4344/operaciones/divide?ope1=" + sumaTemperaturaMedia + "&ope2=" + tamano)
                .get()
                .addHeader("cache-control", "no-cache")
                .build();

        Response response = null;

        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Integer.parseInt(response.body().string());

    }

}
