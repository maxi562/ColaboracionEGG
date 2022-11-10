/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.servicios;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        Cuenta retorno = new Cuenta();
        System.out.println("Indicar numero de cuenta");
        retorno.setNumeroCuenta(leer.nextInt());
        leer.nextLine();
        System.out.println("Indicar DNI");
        retorno.setDNI(leer.nextLine());
        System.out.println("Indicar Saldo actual");
        retorno.setSaldoActual(leer.nextDouble());
        leer.nextLine();
        
        return retorno;
    }
    
    public void ingresarSaldo(Cuenta uno, double saldo){
        if(saldo > 0){
            uno.setSaldoActual((uno.getSaldoActual()+saldo));
        } else {
            System.out.println("No podemos ingresar saldo nulo o negativo");
        }
    }
    
    public void retirarSaldo(Cuenta uno, double saldo){
        if(saldo < 0 && uno.getSaldoActual()>=saldo){
            uno.setSaldoActual((uno.getSaldoActual()+saldo));
        } else if(saldo < 0 && uno.getSaldoActual()< saldo){
            System.out.println("Usted no tiene saldo suficiente");
        } else{
            System.out.println("No podemos retirar nulo o positivo");
        }
    }
    
    public void extraccionRapida(Cuenta uno, double saldo){
        if(saldo > (uno.getSaldoActual()*0.2)){
            System.out.println("Por extracción rápida puede retirar hasta: "+((double)uno.getSaldoActual()*0.2 * 100d) / 100d);
        } else {
            uno.setSaldoActual(uno.getSaldoActual()-(uno.getSaldoActual()*0.2));
        }
    }
    
    public void consultarSaldo(Cuenta uno){
        System.out.println("Su saldo actual es: "+((double)uno.getSaldoActual()* 100d) / 100d);
    }
    
    public void consultarDatos(Cuenta uno){
        System.out.println("El numero de cuenta es: "+uno.getNumeroCuenta());
        System.out.println("El DNI es: "+uno.getDNI());
        System.out.println("El saldo actual es: "+((double)uno.getSaldoActual()* 100d) / 100d);
    }
}
