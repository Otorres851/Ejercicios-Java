/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

import java.util.Scanner;

/**
 *
 * @author oscar715
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
        int num;
          System.out.println("digita tu edad");
          num = entrada.nextInt();
          if (num >=18)
              System.out.println("eres mayor de edad tienes "+num+",años puedes votar en las proximas elecciones");
          else{
              System.out.println("eres menor de edad no puedes votar en las proximas elecciones");
               System.out.println("no eres mayor de edad");
          }
               
        // TODO code application logic here
    }
    
}  
    
        
        // TODO code application logic here
    
    

