/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    Delimitar decimales a 2
    System.out.printf("Valor: %.2f", number );
 */
package ejercicio4.servicios;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        Rectangulo aux = new Rectangulo();
        System.out.println("Indique la base");
        aux.setBase(leer.nextDouble());
        System.out.println("Indique la altura");
        aux.setAltura(leer.nextDouble());
        
        return aux;        
    }
    
    public double calcularSuperficie(Rectangulo uno){
        return(uno.getAltura()*uno.getBase());
    }
    
    public double calcularPerimetro(Rectangulo uno){
        return ((uno.getBase()+uno.getAltura())*2);
    }
    
    public void dibujarRectangulo(Rectangulo uno){
        for (int i = 0; i < uno.getBase(); i++) {
            for (int j = 0; j < uno.getAltura(); j++) {
                if(i==0 || i==uno.getBase()-1){
                    System.out.print("*");                        
                }else{
                    if(j==0 || j==uno.getBase()-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
           
            }
                System.out.println("");   
        }
    }
}
