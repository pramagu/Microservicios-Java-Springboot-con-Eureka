package com.example.apiaemet;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Service
public class ServicioHttp {

    public String requestCon(String codigoLocalidad) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://opendata.aemet.es/opendata/api/prediccion/especifica/municipio/diaria/"+Integer.parseInt(codigoLocalidad)+"?api_key=eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJwYWJsb3JhbW9zYWd1aWxhcjExQGhvdG1haWwuY29tIiwianRpIjoiMjdjYTI5ZDItN2JkMS00YjcwLWE5MzItOWJjNzQ1MDY1MmQ0IiwiaXNzIjoiQUVNRVQiLCJpYXQiOjE2NzY4OTk0NjYsInVzZXJJZCI6IjI3Y2EyOWQyLTdiZDEtNGI3MC1hOTMyLTliYzc0NTA2NTJkNCIsInJvbGUiOiIifQ.IqULozG3uZzLp2NliarVbwGnwB_op2BpAUpb9uQBfm4")
                .get()
                .addHeader("cache-control", "no-cache")
                .build();

        Response response = null;

        try {
            response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();

        SimpleEntity entity = objectMapper.readValue(response.body().string(), SimpleEntity.class);

        Request request2 = new Request.Builder()
        .url(entity.getDatos())
        .get()
        .addHeader("cache-control", "no-cache")
        .build();

        Response response2 = null;

        try {
            response2 = client.newCall(request2).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonArray = response2.body().string();

        JSONArray primerJsonArray = new JSONArray(jsonArray);

        JSONObject inputJSONObject = primerJsonArray.getJSONObject(0);

        String aguadulce = inputJSONObject.getString("nombre");

        JSONObject prediccion = inputJSONObject.getJSONObject("prediccion");

        JSONArray dia = prediccion.getJSONArray("dia");

        JSONObject segundoJsonArray = dia.getJSONObject(0);

        JSONObject temperatura = segundoJsonArray.getJSONObject("temperatura");

        int maxima = temperatura.getInt("maxima");

        int minima = temperatura.getInt("minima");

        String jsonObject = "{\"nombreLocalidad\":\"" +aguadulce+ "\",\"temperaturaMaxima\":" + maxima + ",\"temperaturaMinima\":"+minima+"}";

        System.out.print(jsonObject);


        return jsonObject;

    }

}
