
package ejercicio3.servicios;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author maxi1
 */
public class Servicio {
     public Operacion crearOperacion(){
         Operacion opAux = new Operacion();
         Scanner leer = new Scanner(System.in);
         System.out.println("Indique el primer numero");
         opAux.setNumero1(leer.nextInt());
         System.out.println("Indique el segundo numero");
         opAux.setNumero2(leer.nextInt());
         
         return opAux;
}
     public int sumar(Operacion uno){
         return (uno.getNumero1()+ uno.getNumero2());
     }
     
     public int restar(Operacion uno){
         return (uno.getNumero1()- uno.getNumero2());
     }
     
     public int multiplicar(Operacion uno){
         int retorno = 0;
         
         if(uno.getNumero1()==0 || uno.getNumero2()==0){
             System.out.println("No debemos multiplicar por cero (0)");
         }else{
             retorno = (uno.getNumero1()*uno.getNumero2());
         }
         return retorno;
     }
     
     public int dividir(Operacion uno){
         int retorno = 0;
         
         if(uno.getNumero1()==0 || uno.getNumero2()==0){
             System.out.println("No debemos dividir por cero (0)");
         }else{
             retorno = (uno.getNumero1()/uno.getNumero2());
         }
         return retorno;
     }
}
