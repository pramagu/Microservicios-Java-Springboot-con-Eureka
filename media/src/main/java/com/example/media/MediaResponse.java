package com.example.media;

import java.util.Arrays;

public class MediaResponse {

    protected String[] nombres;

    protected int tmaxMedia;

    protected int tminMedia;

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public int getTmaxMedia() {
        return tmaxMedia;
    }

    public void setTmaxMedia(int tmaxMedia) {
        this.tmaxMedia = tmaxMedia;
    }

    public int getTminMedia() {
        return tminMedia;
    }

    public void setTminMedia(int tminMedia) {
        this.tminMedia = tminMedia;
    }

    @Override
    public String toString() {
        return "MediaResponse [nombres=" + Arrays.toString(nombres) + ", tmaxMedia=" + tmaxMedia + ", tminMedia="
                + tminMedia + "]";
    }

    
    
    
}
