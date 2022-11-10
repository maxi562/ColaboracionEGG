/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosvideospoo.servicios;

import Entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class ServicioMascota {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Mascota crearMascota(){
        
        System.out.println("Indicar nombre");
        String nombre = leer.next();
        
        System.out.println("Indicar tipo");
        String tipo = leer.next();
        
        System.out.println("Indicar apodo");
        String apodo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
        
       
    }
    
}
