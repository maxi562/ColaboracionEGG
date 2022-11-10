/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.entidades.Cuenta;
import ejercicio5.servicios.Servicio;

/**
 *
 * @author maxi1
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio sn = new Servicio();
       Cuenta c1 = sn.crearCuenta();
       sn.ingresarSaldo(c1,5000);
       sn.retirarSaldo(c1,-2500);
       sn.extraccionRapida(c1,1100);
       sn.consultarSaldo(c1);
       sn.consultarDatos(c1);
    }
    
}
