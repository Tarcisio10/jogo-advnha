package javaapplicationtopdomomento;

import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
                
        System.out.println("Informe grausF: ");
        double grausF = leia.nextDouble();
        
        double grausC = 5/9 * (grausF - 32);
        
        System.out.println("GrausC: " + grausC);
    }
}
