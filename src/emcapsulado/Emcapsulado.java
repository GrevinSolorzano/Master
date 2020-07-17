/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emcapsulado;

/**
 *
 * @author DELL
 */
public class Emcapsulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ciudadano clase1;
        clase1 = new ciudadano();
        
        clase1.setNombre("Juan");
        System.out.println("el nombre del ciudadano es: "+clase1.getNombre());
       
         
        clase1.setExperiencia(25);
         System.out.println("Su experiencia laboral es de: "+clase1.getExperiencia ());
      
         clase1.setEdad(40);
         System.out.println("la edad es: "+clase1.getEdad());
    }
    
}
