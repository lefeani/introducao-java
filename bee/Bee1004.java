package bee;

import java.util.Scanner;

public class Bee1004 { // Main
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int a = teclado.nextInt();
            int b = teclado.nextInt();

            System.out.println("PROD = "+ (a * b));
        }
        
    }
   
}
  
