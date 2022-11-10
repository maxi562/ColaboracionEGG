/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicio;

import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
    private Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        System.out.println("Indicar radio");
        
        Circunferencia cAux = new Circunferencia(leer.nextDouble());
                
        return cAux;
    }
    
    public double calcularArea(Circunferencia circulo){
        return Math.PI*(circulo.getRadio()*circulo.getRadio());
    }
    
    public double calcularPerimetro(Circunferencia circulo){
        return Math.PI*2*circulo.getRadio();
    }
}
