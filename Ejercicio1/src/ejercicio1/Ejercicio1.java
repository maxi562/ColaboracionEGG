/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.Servicio.Servicio;
import ejercicio1.entidades.Libro;

/**
 *
 * @author maxi1
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ns = new Servicio();
        Libro l1 = ns.nuevoLibro();
        ns.imprimirLibro(l1);
    }
    
}
