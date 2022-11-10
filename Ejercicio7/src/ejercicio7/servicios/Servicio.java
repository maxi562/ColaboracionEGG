/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.servicios;

import ejercicio7.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Persona aux = new Persona();
        System.out.println("Indique el nombre");
        aux.setNombre(leer.nextLine());
        System.out.println("¿Cual es la edad?");
        aux.setEdad(leer.nextInt());
        aux.setSexo(validarSexo());
        System.out.println("Indique el peso de la persona");
        aux.setPeso(leer.nextDouble());
        System.out.println("Indique la altura de la persona");
        aux.setAltura(leer.nextDouble());
        leer.nextLine();
        return aux;
    }
    
    private String validarSexo(){
        String retorno;
        
        System.out.println("Indique el sexo de la persona H / M / O");
        leer.nextLine();
        retorno=leer.nextLine();
        if(!(retorno.equalsIgnoreCase("h")||retorno.equalsIgnoreCase("m")||retorno.equalsIgnoreCase("o"))){
            do {
                System.out.println("El sexo de la persona debe ser H(Hombre) M(Mujer) O(Otro)");
                retorno = leer.nextLine();
            } while (retorno.equalsIgnoreCase("h")||retorno.equalsIgnoreCase("m")||retorno.equalsIgnoreCase("o"));
            
        }
        return retorno;
    }
    
    public int calcularIMC(Persona uno){
        int retorno = 0;
        if(uno.getPeso()/(uno.getAltura()*uno.getAltura())<20){
            retorno = -1;
        }else if(uno.getPeso()/(uno.getAltura()*uno.getAltura())>25){
            retorno = 1;
        }        
        return retorno;
    }
    
    public boolean esMayor(Persona uno){
        boolean retorno = true;
        if(uno.getEdad()<18){
            retorno = false;
        }        
        return retorno;
    }
    
    
}
