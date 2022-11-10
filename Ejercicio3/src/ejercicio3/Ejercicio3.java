/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.entidades.Operacion;
import ejercicio3.servicios.Servicio;

/**
 *
 * @author maxi1
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio sn = new Servicio();
        Operacion op = sn.crearOperacion();
        
        System.out.println("Suma: "+sn.sumar(op));
        System.out.println("Resta: "+sn.restar(op));
        System.out.println("Multiplicación: "+sn.multiplicar(op));
        System.out.println("Dividisión"+sn.dividir(op));
    }
    
}
