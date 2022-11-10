/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicios.Servicio;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio sn = new Servicio();
        Persona []p = new Persona[4];
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < p.length; i++) {
            p[i]=sn.crearPersona();            
        }
        
        
    }
    
}
