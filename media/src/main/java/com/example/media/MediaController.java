package com.example.media;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/media")
public class MediaController {

    @Autowired
    TemperaturaService servicio = new TemperaturaService();
    @Autowired
    MediaService servicioMedia = new MediaService();

    @PostMapping
    @ResponseBody
    public ResponseEntity<MediaResponse> temperaturaEntity(@RequestBody MediaRequest mediaRequest)
            throws JsonMappingException, JsonProcessingException, IOException {

        List<TemperaturaResponse> listaTemperaturas = servicio.obtenerTemperaturaYNombres(mediaRequest);

        MediaResponse mediaRespuesta = servicioMedia.calcularTemperaturasMedias(listaTemperaturas);

        System.out.println(mediaRespuesta.toString());

        return ResponseEntity.ok(mediaRespuesta);

    }

}

@RestController
@RequestMapping("/")
class Actuator{

    @RequestMapping("/actuator/info")
    public ResponseEntity<String> actuator(){
        return ResponseEntity.ok("Todo Ok Jose Luis");
    }

}
