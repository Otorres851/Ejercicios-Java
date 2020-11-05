/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscador;

import java.util.Scanner;
/**
 *
 * @author oscar715
 */
public class Buscador {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
         String entrada,buscador;
         System.out.println("digite una frase: ");
         entrada= teclado.nextLine();
         System.out.println("digite una palabra: ");
         buscador= teclado.nextLine();
        
         boolean encontro=entrada.contains(buscador);
         if(encontro== true){
         System.out.println("si se encontro la palabra "+buscador+", en la frase ");
         }
         else {
         System.out.println("no se encontro la palabra "+buscador+", en la frase ");
         }
    }
    
}

