/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par.o.impar;

import java.util.Scanner;

/**
 *
 * @author oscar715
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner leer = new Scanner(System.in);
        int N;
        System.out.print("Introduzca Número entero: ");
        N = leer.nextInt(); 
        if(N%2==0)
           System.out.println("El Número es Par");    
        else
            System.out.println("El Número es Impar");  
    }
}
 