/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.entidades.Cafetera;
import ejercicio6.servicios.Servicio;

/**
 *
 * @author maxi1
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio sn = new Servicio();
        Cafetera c1 = sn.nuevaCafetera(1000);
        sn.servirTaza(c1, 250);
        sn.imprimirStatus(c1);
        sn.servirTaza(c1, 630);
        sn.imprimirStatus(c1);
        sn.agregarCafe(c1, 300);
        sn.imprimirStatus(c1);
    }
    
}
