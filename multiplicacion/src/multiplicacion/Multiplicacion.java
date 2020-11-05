package multiplicacion;


import java.util.Scanner;
public class Multiplicacion {

    
    public static void main(String[] args) 
    {
       int tabla;
       Scanner leer=new Scanner (System.in);
       System.out.print("digite un numero");
       tabla=leer.nextInt();
       
       for (int var1=1;var1<11;var1++){
       System.out.println(+tabla+"X"+var1+"="+(var1*tabla));
       
       }
    }
    
}
