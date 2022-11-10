/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.servicios;

import ejercicio9.entidades.Matematica;

/**
 *
 * @author maxi1
 */
public class Servicio {
    
    public Matematica crearMateRandom(){
        Matematica aux = new Matematica();
        
        aux.setNum1(Math.random()*100+1);
        aux.setNum2(Math.random()*100+1);
        aux.setNum1(Math.round(aux.getNum1() * 100) / 100d);
        aux.setNum2(Math.round(aux.getNum2() * 100) / 100d);
        return aux;
    }
    
    public double devolverMayor(Matematica mate){
        double retorno;
        if(mate.getNum1()>mate.getNum2()){
            retorno = mate.getNum1();
        }else{
            retorno = mate.getNum2();
        }
        
        return retorno;
    }
    
    public double calcularPotencia(Matematica mate){
        double retorno;
        if(mate.getNum1()>mate.getNum2()){
            retorno = Math.pow(mate.getNum1(), mate.getNum2());
        }else{
            retorno = Math.pow(mate.getNum2(), mate.getNum1());
                    
        }
        
        
        return retorno;
    }
    
    public double calcularRaiz(Matematica mate){
        double retorno;
        
        if(mate.getNum1()>mate.getNum2()){
            retorno = mate.getNum2();
        }else{
            retorno = mate.getNum1();
        }
        
        retorno = Math.abs(retorno);
        retorno = Math.sqrt(retorno);
        
        return retorno;
    }
}
