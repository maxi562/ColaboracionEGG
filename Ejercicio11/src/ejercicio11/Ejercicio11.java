/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, mes, anio, anioResta;
        System.out.println("Indique día");
        dia = leer.nextInt();
        System.out.println("Indique mes");
        mes = leer.nextInt();
        System.out.println("Indique año");
        anio = leer.nextInt();
        
        Date fechausuario = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        
        System.out.println("Año"+fechaActual.getYear());
        anioResta = (fechaActual.getYear()+1900)-fechausuario.getYear();
        
        System.out.println("La diferencia de años es: "+anioResta);
                
    }
    
}
