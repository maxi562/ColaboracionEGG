/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.servicios;

import ejercicio8.entidades.Cadena;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearFrase(){
        Cadena auxiliar = new Cadena();
        
        System.out.println("Indique una frase");
        auxiliar.setFrase(leer.nextLine());
        auxiliar.setLongitud(auxiliar.getFrase().length());
        return auxiliar;
    }
    
    public int contarVocales(Cadena frase){
        int retorno=0;
        String auxiliar = frase.getFrase();
        for (int i = 0; i < frase.getLongitud(); i++) {
            if(auxiliar.charAt(i)=='a'||auxiliar.charAt(i)=='A'||auxiliar.charAt(i)=='e'||auxiliar.charAt(i)=='E'||auxiliar.charAt(i)=='i'||auxiliar.charAt(i)=='I'
                    || auxiliar.charAt(i)=='u'||auxiliar.charAt(i)=='U'||auxiliar.charAt(i)=='o'||auxiliar.charAt(i)=='O'){
                retorno++;
            }
        }        
        return retorno;
    }
    
    public String invertirFrase(Cadena frase){
        String auxiliar = frase.getFrase();
        char retorno[] = new char[auxiliar.length()];
        
        int contador = (auxiliar.length()-1);
        for (int i = 0; i < auxiliar.length(); i++) {
            
            retorno[contador] = auxiliar.charAt(i);
            contador--;            
        }
        auxiliar = String.valueOf(retorno);
        return auxiliar;
    }
    
    public int vecesRepetido(Cadena frase, char buscar){
        String auxiliar = frase.getFrase();
        int retorno = 0;
        
        
        for (int i = 0; i < auxiliar.length(); i++) {
            
            if(auxiliar.charAt(i)==buscar){
                retorno++;
            }
        }
        
        return retorno;
    }
    
    public void compararFrase(Cadena frase){
        Cadena auxiliar = new Cadena();
        
        System.out.println("Ingrese una frase comparativa");
        leer.nextLine();
        auxiliar.setFrase(leer.nextLine());
        auxiliar.setLongitud(auxiliar.getFrase().length());
        if(frase.getLongitud()==auxiliar.getLongitud()){
            System.out.println("las frases tienen la misma longitud de "+auxiliar.getLongitud()+" caracteres");
        } else if (frase.getLongitud()>auxiliar.getLongitud()){
            System.out.println("La frase inicial tiene mayor longitud que la ingresada");
        } else {
            System.out.println("La frase inicial tiene menor longitud a la ingresada");
        }
        
        
    }
    
    public void unirFrase(Cadena frase){
        Cadena auxiliar = new Cadena();
        
        System.out.println("Ingrese una frase para encadenar");
        leer.nextLine();
        auxiliar.setFrase(leer.nextLine());
        
        
        auxiliar.setFrase(frase.getFrase().concat(auxiliar.getFrase()));
        
        System.out.println("El resultado es: "+auxiliar.getFrase());
                
    }
    
    public void reemplazarA(Cadena frase){
        String auxiliar = frase.getFrase();
        char usuario;
        
        System.out.println("¿por cual letra reemplazamos las a?");
        usuario = leer.next().charAt(0);
        
        auxiliar = auxiliar.replace('a',usuario);
        
        System.out.println("El resultado es: "+auxiliar);
        }        
        
        public void contieneLetra(Cadena frase){
            String auxiliar = frase.getFrase();
            char usuario;
            
            System.out.println("Indique el caracter a buscar");
            usuario = leer.next().charAt(0);
            if(auxiliar.contains(Character.toString(usuario))){
                System.out.println("la frase no contiene el caracter "+usuario);
            }else{
                System.out.println("La frase contiene el caracter "+ usuario);
            }
        }
    }
    
    

