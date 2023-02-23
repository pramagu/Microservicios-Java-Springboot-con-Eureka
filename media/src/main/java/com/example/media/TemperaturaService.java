package com.example.media;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Service
public class TemperaturaService {

    public List<TemperaturaResponse> obtenerTemperaturaYNombres(MediaRequest mediaRequest) throws JsonMappingException, JsonProcessingException, IOException {

        ArrayList<TemperaturaResponse> listaTemperaturas = new ArrayList();
        ArrayList<String> localidades = new ArrayList<>();
        
        for (String codigo : mediaRequest.getCodigos()) {
            
            localidades.add(codigo);
            
        }

        for (String listaArray : localidades) {
            


        ObjectMapper objectMapper = new ObjectMapper();

        OkHttpClient client = new OkHttpClient();

        
        
            Request request = new Request.Builder()
                    .url("http://localhost:8080/tiempo/temperatura?codigoMunicipio="+ Integer.parseInt(listaArray))
                    .get()
                    .addHeader("cache-control", "no-cache")
                    .build();

            Response response = null;

            try {
                response = client.newCall(request).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }

            TemperaturaResponse entity = objectMapper.readValue(response.body().string(), TemperaturaResponse.class);

            listaTemperaturas.add(entity);

        }

        return listaTemperaturas;

    }

}
