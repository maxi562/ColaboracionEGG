/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidades;

/**
 *
 * @author maxi1
 */
public class Cuenta {
    private int numeroCuenta;
    private String DNI;
    private double saldoActual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, String DNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
