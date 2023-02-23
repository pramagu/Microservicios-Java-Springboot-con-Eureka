package com.example.apiaemet;

import java.util.ArrayList;
import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */
 class CotaNieveProv{
    public String value;
    public String periodo;
}

 class Dato{
    public int value;
    public int hora;
}

 class Dium{
    public ArrayList<ProbPrecipitacion> probPrecipitacion;
    public ArrayList<CotaNieveProv> cotaNieveProv;
    public ArrayList<EstadoCielo> estadoCielo;
    public ArrayList<Viento> viento;
    public ArrayList<RachaMax> rachaMax;
    public Temperatura temperatura;
    public SensTermica sensTermica;
    public HumedadRelativa humedadRelativa;
    public int uvMax;
    public Date fecha;

    

    public Dium() {
    }

    public Dium(ArrayList<ProbPrecipitacion> probPrecipitacion, ArrayList<CotaNieveProv> cotaNieveProv,
            ArrayList<EstadoCielo> estadoCielo, ArrayList<Viento> viento, ArrayList<RachaMax> rachaMax,
            Temperatura temperatura, SensTermica sensTermica, HumedadRelativa humedadRelativa, int uvMax, Date fecha) {
        this.probPrecipitacion = probPrecipitacion;
        this.cotaNieveProv = cotaNieveProv;
        this.estadoCielo = estadoCielo;
        this.viento = viento;
        this.rachaMax = rachaMax;
        this.temperatura = temperatura;
        this.sensTermica = sensTermica;
        this.humedadRelativa = humedadRelativa;
        this.uvMax = uvMax;
        this.fecha = fecha;
    }
    
    public ArrayList<ProbPrecipitacion> getProbPrecipitacion() {
        return probPrecipitacion;
    }
    public void setProbPrecipitacion(ArrayList<ProbPrecipitacion> probPrecipitacion) {
        this.probPrecipitacion = probPrecipitacion;
    }
    public ArrayList<CotaNieveProv> getCotaNieveProv() {
        return cotaNieveProv;
    }
    public void setCotaNieveProv(ArrayList<CotaNieveProv> cotaNieveProv) {
        this.cotaNieveProv = cotaNieveProv;
    }
    public ArrayList<EstadoCielo> getEstadoCielo() {
        return estadoCielo;
    }
    public void setEstadoCielo(ArrayList<EstadoCielo> estadoCielo) {
        this.estadoCielo = estadoCielo;
    }
    public ArrayList<Viento> getViento() {
        return viento;
    }
    public void setViento(ArrayList<Viento> viento) {
        this.viento = viento;
    }
    public ArrayList<RachaMax> getRachaMax() {
        return rachaMax;
    }
    public void setRachaMax(ArrayList<RachaMax> rachaMax) {
        this.rachaMax = rachaMax;
    }
    public Temperatura getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }
    public SensTermica getSensTermica() {
        return sensTermica;
    }
    public void setSensTermica(SensTermica sensTermica) {
        this.sensTermica = sensTermica;
    }
    public HumedadRelativa getHumedadRelativa() {
        return humedadRelativa;
    }
    public void setHumedadRelativa(HumedadRelativa humedadRelativa) {
        this.humedadRelativa = humedadRelativa;
    }
    public int getUvMax() {
        return uvMax;
    }
    public void setUvMax(int uvMax) {
        this.uvMax = uvMax;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    

}

 class EstadoCielo{
    public String value;
    public String periodo;
    public String descripcion;
}

 class HumedadRelativa{
    public int maxima;
    public int minima;
    public ArrayList<Dato> dato;
}

 class Origen{
    public String productor;
    public String web;
    public String enlace;
    public String language;
    public String copyright;
    public String notaLegal;
}

 class Prediccion{
    public ArrayList<Dium> dia;

    

    public Prediccion() {
    }

    

    public Prediccion(ArrayList<Dium> dia) {
        this.dia = dia;
    }



    public ArrayList<Dium> getDia() {
        return dia;
    }

    public void setDia(ArrayList<Dium> dia) {
        this.dia = dia;
    }

}

 class ProbPrecipitacion{
    public int value;
    public String periodo;
}

 class RachaMax{
    public String value;
    public String periodo;
}

public class Root{

    public Origen origen;
    public Date elaborado;
    public String nombre;
    public String provincia;
    public Prediccion prediccion;
    public int id;
    public double version;

    

    public Root() {
    }


    

    public Root(Origen origen, Date elaborado, String nombre, String provincia, Prediccion prediccion, int id,
            double version) {
        this.origen = origen;
        this.elaborado = elaborado;
        this.nombre = nombre;
        this.provincia = provincia;
        this.prediccion = prediccion;
        this.id = id;
        this.version = version;
    }




    public Origen getOrigen() {
        return origen;
    }
    public void setOrigen(Origen origen) {
        this.origen = origen;
    }
    public Date getElaborado() {
        return elaborado;
    }
    public void setElaborado(Date elaborado) {
        this.elaborado = elaborado;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public Prediccion getPrediccion() {
        return prediccion;
    }
    public void setPrediccion(Prediccion prediccion) {
        this.prediccion = prediccion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getVersion() {
        return version;
    }
    public void setVersion(double version) {
        this.version = version;
    }
    
}

 class SensTermica{
    public int maxima;
    public int minima;
    public ArrayList<Dato> dato;
}

 class Temperatura{
    public int maxima;
    public int minima;
    public ArrayList<Dato> dato;

    

    public Temperatura() {
    }

    

    public Temperatura(int maxima, int minima, ArrayList<Dato> dato) {
        this.maxima = maxima;
        this.minima = minima;
        this.dato = dato;
    }



    public int getMaxima() {
        return maxima;
    }
    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }
    public int getMinima() {
        return minima;
    }
    public void setMinima(int minima) {
        this.minima = minima;
    }
    public ArrayList<Dato> getDato() {
        return dato;
    }
    public void setDato(ArrayList<Dato> dato) {
        this.dato = dato;
    }

    

}

 class Viento{
    public String direccion;
    public int velocidad;
    public String periodo;
}


