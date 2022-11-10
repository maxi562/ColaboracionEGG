/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosvideospoo;

import Entidades.Mascota;
import ejemplosvideospoo.servicios.ServicioMascota;

/**
 *
 * @author maxi1
 */
public class EjemplosVideosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString());
    }
    
}
