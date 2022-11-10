/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import ejercicio10.servicios.Servicio;

/**
 *
 * @author maxi1
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double arrayUno [] = new double [50];
         double arrayDos [] = new double [20];
         Servicio sn = new Servicio();
         
         sn.rellenarArrayAleatorio(arrayUno);
         sn.imprimirArray(arrayUno);
         sn.rellenarArrayCopia(arrayUno, arrayDos);
         sn.imprimirArray(arrayUno);
         sn.imprimirArray(arrayDos);
    }
    
}
