/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.entidades.Circunferencia;
import ejercicio2.servicio.Servicio;

/**
 *
 * @author maxi1
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio sn = new Servicio();
        Circunferencia c1 = sn.crearCircunferencia();
        System.out.println("El area es: "+sn.calcularArea(c1));
        System.out.println("El perimetro es: "+sn.calcularPerimetro(c1));
    }
    
}
