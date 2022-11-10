/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.servicios;

import ejercicio6.entidades.Cafetera;

/**
 *
 * @author maxi1
 */
public class Servicio {
    
    public Cafetera nuevaCafetera(int capaMax){
        Cafetera aux = new Cafetera();
        aux.setCapacidadMaxima(capaMax);
        llenarCafetera(aux);
        
        return aux;
    }
    
    public void llenarCafetera(Cafetera uno){
        uno.setCantidadActual(uno.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera uno, int tamanioTaza){
        if(tamanioTaza== uno.getCantidadActual()){
            System.out.println("Se logró llenar la taza por completo\nLa cafetera quedó vacía, deben recargar");
            vaciarCafetera(uno);            
        }else if(tamanioTaza>uno.getCantidadActual()){
            System.out.println("La cafetera no tiene café para llenar la taza, solo se sirvió "+uno.getCantidadActual()+" cm3");
            vaciarCafetera(uno);
        }else{
            uno.setCantidadActual(uno.getCantidadActual()-tamanioTaza);
            System.out.println("La taza quedó llena y sobraron "+uno.getCantidadActual()+" cm3");
        }
    }
    
    public void vaciarCafetera(Cafetera uno){
        uno.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera uno, int cafeAgregado){
        if(cafeAgregado > uno.getCapacidadMaxima()){
             System.out.println("No podemos agregar más café que "+uno.getCapacidadMaxima()+" cm3");
          } else if((cafeAgregado+uno.getCantidadActual()> uno.getCapacidadMaxima())){
              System.out.println("Solamente agregaremos "+(uno.getCapacidadMaxima()-uno.getCantidadActual())+" cm3");
              llenarCafetera(uno);
          }else{
              uno.setCantidadActual(cafeAgregado+uno.getCantidadActual());
              System.out.println("La acfetera quedó cargada con "+uno.getCantidadActual()+" cm3");
          }   
    }
    
    public void imprimirStatus(Cafetera uno){
        System.out.println("Restan "+uno.getCantidadActual()+" cm3 de café");
    }
}
