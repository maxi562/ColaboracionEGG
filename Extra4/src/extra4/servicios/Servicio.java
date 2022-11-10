/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra4.servicios;

import extra4.entidades.NIF;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    private char  arrayNif []= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
     
    public NIF crearNif(){
        NIF retorno = new NIF();
        int dniAux;
        char letraAux;
        
        System.out.println("Indique el DNI");
        dniAux = leer.nextInt();
        letraAux = calcularNIF(dniAux, arrayNif);
        
        retorno.setDni(dniAux);
        retorno.setLetra(letraAux);
        
        return retorno;
    }
    
    private char calcularNIF(int dni, char[] arrayNif){
        char retorno;
        int auxiliar;
        
        auxiliar = dni % 23;
        retorno = Array.getChar(arrayNif, auxiliar);
        
        return retorno;
    }
    
    public void mostrarNif(NIF uno){
        System.out.println(uno.getDni()+"-"+uno.getLetra());
    }
}
