package com.example.apiaemet;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@RestController
@RequestMapping("/tiempo")
public class ApiaemetController {

    @Autowired
    ServicioHttp servicio = new ServicioHttp();

    @GetMapping(path = "/temperatura")
    public ResponseEntity<String> temperaturaEntity(@RequestParam String codigoMunicipio) throws IOException {

        return ResponseEntity.ok(servicio.requestCon(codigoMunicipio));

    }

}
