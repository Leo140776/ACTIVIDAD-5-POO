
package com.mycompany.act4ej1;

import javax.swing.JOptionPane;

public class ACT4EJ5 {
    
     public static void main(String[] args) {
      
        String valorRadio = JOptionPane.showInputDialog(null, "Ingrese el radio del círculo:");
        double radio = Double.parseDouble(valorRadio);
        
      
        Circulo circulo = new Circulo(radio);
        
   
        double area = circulo.calcularArea();
        double longitud = circulo.calcularLongitud();
        
        JOptionPane.showMessageDialog(null, "Área del círculo: " + area);
        JOptionPane.showMessageDialog(null, "Longitud del círculo: " + longitud);
    }
}
