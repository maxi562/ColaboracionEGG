/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import ejercicio9.entidades.Matematica;
import ejercicio9.servicios.Servicio;

/**
 *
 * @author maxi1
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio sn = new Servicio();
        Matematica mate1 = sn.crearMateRandom();
        double retorno;
        
        System.out.println(""+mate1.getNum1());
        System.out.println(""+mate1.getNum2());
        
        retorno = sn.devolverMayor(mate1);
        System.out.println("El mayor de ambos numeros es: "+retorno);
        
        retorno = sn.calcularPotencia(mate1);
        System.out.println("La potencia da como resultado: "+(Math.round(retorno * 100) / 100d));
        
        retorno = sn.calcularRaiz(mate1);
        System.out.println("La raiz cuadrada da como resultado: "+(Math.round(retorno * 100) / 100d));

    }
    
    
            
    
}
