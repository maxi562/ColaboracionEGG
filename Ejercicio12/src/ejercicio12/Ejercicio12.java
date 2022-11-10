/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import ejercicio12.entidades.Persona;
import ejercicio12.servicios.Servicio;

/**
 *
 * @author maxi1
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio sn = new Servicio();
        Persona nuevaP = sn.crearPersona();
        int edad;
        
        edad = sn.calcularEdad(nuevaP);
        System.out.println(nuevaP.getNombre()+" tiene "+edad+" años");
        
        sn.mostrarPersona(nuevaP);
    }
    
}
