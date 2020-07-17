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
public class Numero5 {
    public static void main(String[] args) {
       
       String Datos [][] = new String[5][4];
       
       for(int i=0; i<5; i++){
               for(int j=0; j<4; j++){
              Datos[i][j]= "a";
            }
         }
       Datos[0][0]= " ESDRAS " ; Datos[0][1]= "  RAMOS    "; Datos[0][2]= "INGENIERIA EN COMPUTACION"; Datos[0][3]= "EEH      ";  
       Datos[1][0]= " CARLOS " ; Datos[1][1]= "  CRUZ     "; Datos[1][2]= " INGENIERIA EN PRODUCION "; Datos[1][3]= "ENP       ";
       Datos[2][0]= " CARLOS " ; Datos[2][1]= "  ERAZO    "; Datos[2][2]= "INGENIERIA EN ELECTRONICA"; Datos[2][3]= "ENEE      ";
       Datos[3][0]= " KAREN  " ; Datos[3][1]= " MENDOZA   "; Datos[3][2]= " INGENIERIA EN PRODUCION "; Datos[3][3]= "NO TRABAJA";
       Datos[4][0]= " JOSTIN " ; Datos[4][1]= " TROCHEZ   "; Datos[4][2]= " INGENIERIA EN PRODUCION "; Datos[4][3]= "HOSPITAL DE AREA";
       System.out.print(" NOMBRE" + "\t\t" + " APELLIDO" + "\t\t" + "CARRERA" + "\t\t\t" +" TRABAJO");
     

       
       for(int i=0; i<5; i++){
            System.out.println();
            System.out.println(" _______________________________________________________________________________");
          for(int j=0; j<4; j++){
                System.out.print(Datos[i][j]  + "\t" + "|");
           }
       }

   } 
    
}
