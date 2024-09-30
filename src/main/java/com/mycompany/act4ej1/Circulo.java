
package com.mycompany.act4ej1;


public class Circulo {
 
    public static final double PI = 3.14;

    private double radio;  
 
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea() {
        return PI * radio * radio;
    }
    
    public double calcularLongitud() {
        return 2 * PI * radio;
    }
} 
    