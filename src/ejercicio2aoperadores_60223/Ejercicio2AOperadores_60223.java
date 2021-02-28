/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2aoperadores_60223;

/**
 *
 * @author Jairo
 */
public class Ejercicio2AOperadores_60223 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] det = new int [3] [3];
        
        det [0][0] = 25;
        det [0][1] = 11;
        det [0][2] = 31; 
        
        det [1][0] = 16;
        det [1][1] = 15;
        det [1][2] = 12; 
        
        det [2][0] = 11;
        det [2][1] = 17;  
        det [2][2] = 25; 
        
        int determinante = (det [0][0] * det[1][1] * det[2][2]) - (det[0][2] * det[1][1] * det [2][0] );
                
       System.out.println("El determinante es: " + determinante);
    }
             
            
    
    
}
