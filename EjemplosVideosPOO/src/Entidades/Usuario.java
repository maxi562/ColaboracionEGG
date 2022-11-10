/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author maxi1
 */
public class Usuario {
    
    public String nombre;
    public String apellido;
    public String pais;
    public int dni;
    public Date nacimiento;

    //Constructor
    public Usuario() {
    }
    
    //Constructor con Parametros

    public Usuario(String nombre, String apellido, String pais, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.dni = dni;
    }
    
    
    
}
