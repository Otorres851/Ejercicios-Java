
package raiz.cuadrada;

import java.util.Scanner;

public class RaizCuadrada {
    
   
    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in);
      
      double num,raiz;
      
      System.out.println("Digite un Número");
      num = sc.nextDouble();
      
      raiz = Math.sqrt(num);
      
      System.out.println("La raiz cuadrada de "+num+" = "+ raiz);  
    
    }
    
}
