/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.arismeticas;

/**
 *
 * @author DELL
 */
public class Numero6 {
    public static void main(String[] args){
        int nota1= 67, nota2=88;
        String nombre1 = "Pedro", nombre2 = "Lucas";
        
        if(nota1<70){
           System.out.println(nombre1 + " " + nota1 + " Reprobada");
        }else{
          System.out.println(nombre1 + " " + nota1 + " Aprobada");  
        }
        
        if(nota2<70){
           System.out.println(nombre2 + " " + nota2 + " Reprobada");
        }else{
          System.out.println(nombre2 + " " + nota2 + " Aprobada");  
        }
    }
    
    
}
