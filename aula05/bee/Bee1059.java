package bee;

import java.util.Scanner;

public class Bee1059 { //Main
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int i;
            for (i = 2; i <= 100; i = i + 2) {
                System.out.println(i);
            } 
            
            entrada.close();
        }
    }
}
   