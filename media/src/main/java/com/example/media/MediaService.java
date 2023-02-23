package com.example.media;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class MediaService {

    public MediaResponse calcularTemperaturasMedias(List<TemperaturaResponse> listaTemperatura)
            throws NumberFormatException, IOException {

        MediaResponse respuestaMedia = new MediaResponse();
        CalculadoraService servicioCalculadora = new CalculadoraService();

        int sumaTemperaturaMaxima = 0;
        int sumaTemperaturaMinima = 0;
        int tamano = listaTemperatura.size();
        String[] municipios = new String[tamano];
        int counter = 0;
        OkHttpClient client = new OkHttpClient();

        for (TemperaturaResponse temperaturaResponse : listaTemperatura) {

           

            sumaTemperaturaMaxima = servicioCalculadora.suma(client, sumaTemperaturaMaxima, temperaturaResponse, temperaturaResponse.getTemperaturaMaxima()) ;

            sumaTemperaturaMinima = servicioCalculadora.suma(client, sumaTemperaturaMinima, temperaturaResponse, temperaturaResponse.getTemperaturaMinima());

            municipios[counter] = temperaturaResponse.getNombreLocalidad();

            counter++;

        }

        respuestaMedia.setTmaxMedia(servicioCalculadora.division(client, sumaTemperaturaMaxima, tamano));

        respuestaMedia.setTminMedia(servicioCalculadora.division(client, sumaTemperaturaMinima, tamano));

        respuestaMedia.setNombres(municipios);

        return respuestaMedia;
    }

}
