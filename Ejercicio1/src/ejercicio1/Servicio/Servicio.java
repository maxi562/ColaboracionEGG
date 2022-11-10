/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.Servicio;

import ejercicio1.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Libro nuevoLibro(){
        Libro lAux = new Libro();
        System.out.println("Indicar ISBN");
        lAux.setISBN(leer.nextInt());
        leer.nextLine();
        System.out.println("Indicar titulo");
        lAux.setTitulo(leer.nextLine());
        System.out.println("Indicar Autor");
        lAux.setAutor(leer.nextLine());
        System.out.println("Indicar cantidad de páginas");
        lAux.setNumPaginas(leer.nextInt());        
        
        return lAux;
    }
    
    public void imprimirLibro(Libro ejemplo){
        System.out.println("El libro ingresado es "+ejemplo.getTitulo());
        System.out.println("El autor del libo es "+ejemplo.getAutor());
        System.out.println("La cantidad de páginas es "+ejemplo.getNumPaginas());
        System.out.println("El numero de ISBN es "+ejemplo.getISBN());
    }
}
