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
public class ciudadano {
    private String nombre; 
    
    private int edad;
    
    private int experiencia; 
    
    
    public void sedEdad(int edad){
   this.edad = edad; 
    }
    
    public int getEdad(){
        return edad; 
    }
    
    public void setNombre(String nombre){
       this.nombre = nombre; 
    }
    
    public String getNombre(){
     return nombre;    
    }
    
    public int getExperiencia (){
        return experiencia;
    }
    
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }
    
    public void imprimirExperiencia(){
     System.out.println(experiencia);   
    }

  void setEdad(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String getedad() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void setedad(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
