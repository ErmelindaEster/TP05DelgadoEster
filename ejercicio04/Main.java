package ejercicio04;
import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 1 y 9: ");
        int numero = scanner.nextInt(); 
        System.out.println(" Tabla de multiplicar del " + numero + ":"); 
             for (int i=1; i <=10; i++) {
             System.out.println( numero + " x " + i + " = " + (numero * i)); 

      }
      scanner. close(); 
      }
    
}
