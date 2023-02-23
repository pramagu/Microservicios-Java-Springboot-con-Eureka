package com.example.media;

public class MediaRequest {

    protected String[] codigos;

    public MediaRequest() {
    }

    public MediaRequest(String[] codigos) {
        this.codigos = codigos;
    }

    public String[] getCodigos() {
        return codigos;
    }

    public void setCodigos(String[] codigos) {
        this.codigos = codigos;
    }

    
    
}
