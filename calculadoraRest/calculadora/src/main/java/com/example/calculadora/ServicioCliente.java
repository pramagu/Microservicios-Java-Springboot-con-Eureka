package com.example.calculadora;

import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

import com.example.calculadora.ClienteCalculadora.org.tempuri.Calculator;
import com.example.calculadora.ClienteCalculadora.org.tempuri.CalculatorSoap;

@Service
public class ServicioCliente {

    public String url =  "http://www.dneonline.com/calculator.asmx?wsdl";
    private Calculator calculadora;
    private CalculatorSoap cliente;

    public CalculatorSoap getCliente(){
        try {
            if (calculadora == null) {
                calculadora = new Calculator(new URL(url));
                cliente = calculadora.getCalculatorSoap();

                
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return cliente;
    }


}
