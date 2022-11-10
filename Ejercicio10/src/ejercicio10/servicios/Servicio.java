/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.servicios;

import java.util.Arrays;

/**
 *
 * @author maxi1
 */
public class Servicio {
    public void rellenarArrayAleatorio(double[] arrayUno){
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = Math.random() * 100 + 1;
        }
    }
    
    public void imprimirArray(double[] arrayUno){
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println("Posición ["+i+"] = "+arrayUno[i]);
        }
    }
    
    public void ordenarArray(double[] arrayA){
        Arrays.sort(arrayA);
    }
    
    public void rellenarArrayCopia(double[] arrayA, double[] arrayB){
        ordenarArray(arrayA);
        for (int i = 0; i < arrayB.length; i++) {
            if(i<=10){
                arrayB[i] = arrayA[i];
            }else{
                arrayB[i] = 0.5;
            }
        }
    }
}
