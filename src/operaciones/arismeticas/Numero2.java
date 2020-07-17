/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.arismeticas;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Numero2 {
       public static void main(String[] args) {
           
       Scanner Leer = new Scanner(System.in);
        int  Num1, Num2;
        System.out.println("Ingrese Primer valor");
        Num1 = Leer.nextInt();
        System.out.println("Ingrese Segundo Valor");
        Num2= Leer.nextInt();
        
        System.out.println("La suma  es: " + (Num1+Num2));
        System.out.println("La Resta es: " + (Num1-Num2));
        System.out.println("La Multiplicacion es: " + (Num1*Num2));
        System.out.println("La Division es: " + (Num1/Num2));
        System.out.println("El Residuo es: " + (Num1&Num2)); 
    }
}
