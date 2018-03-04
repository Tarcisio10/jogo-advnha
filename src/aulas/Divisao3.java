package javaapplicationtopdomomento;

import java.util.Scanner;

public class Divisao3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe número: ");
        int numero = 
                leia.nextInt();
        int valor = numero % 3;
        
        switch(valor) {
            case 0:
                System.out.println("Certo");
                break;
            default: {
                System.out.println("Errado");
            }
        }

    }
}
