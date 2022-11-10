/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.servicios;

import ejercicio12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        Persona aux = new Persona();
        String nombreAux;
        Date fechaAux = new Date();
        
        nombreAux = pedirNombre();
        fechaAux = pedirFechaNac();
        
        aux.setNombre(nombreAux);
        aux.setFechaNac(fechaAux);
        
        return aux;
    }
    
    public String pedirNombre(){
        String nombreAux;
        System.out.println("Indique el nombre de la persona");
        nombreAux = leer.nextLine();
        
        return nombreAux;
    }
    public Date pedirFechaNac(){
        
        Date fechaAux = new Date();
        int diaAux, mesAux, anioAux;
        
        System.out.println("Indique el dia de nacimiento");
        diaAux = leer.nextInt();
        System.out.println("indique el mes de nacimiento");
        mesAux = leer.nextInt();
        System.out.println("Indique el año de nacimiento");
        anioAux = leer.nextInt();
        
        fechaAux.setDate(diaAux);
        fechaAux.setMonth(mesAux);
        fechaAux.setYear(anioAux);
        
        return fechaAux;
    }
    
    public int calcularEdad(Persona uno){
        int retorno;
        Date fechaAux = new Date();
        
        retorno = uno.getFechaNac().getYear()-(fechaAux.getYear()+1900);
        
        return retorno;
    }
    
    public void mostrarPersona(Persona uno){
        System.out.println("Nombre: "+uno.getNombre());
        System.out.println("Fecha de Nacimiento: "+uno.getFechaNac());
    }
}
