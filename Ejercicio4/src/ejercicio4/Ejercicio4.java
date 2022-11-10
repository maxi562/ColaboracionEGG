/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import ejercicio4.servicios.Servicio;

/**
 *
 * @author maxi1
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio sn = new Servicio();       
        Rectangulo rec = sn.crearRectangulo();
        System.out.println("Superficie: "+((double)Math.round(sn.calcularSuperficie(rec) * 100d) / 100d));
        System.out.println("Perimetro: "+((double)Math.round(sn.calcularPerimetro(rec) * 100d) / 100d));
        sn.dibujarRectangulo(rec);
        
    }
    
}
