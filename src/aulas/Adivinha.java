package javaapplicationtopdomomento;

import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Random numbRandom = new Random(10);
        
        System.out.println("Chute um numero de 1 a 10");
        int numbUser = leia.nextInt();
        
        int numb = numbRandom.nextInt();
        
        if(numb == numbUser) {
            System.out.println("Acertou!!");
        } else {
            System.out.println("Errou!");
        }
    }
}
