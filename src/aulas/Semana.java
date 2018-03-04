package javaapplicationtopdomomento;

import java.util.Scanner;

public class Semana {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Informe um dia da semana com número (1 a 7): ");
        int dia = leia.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Fim de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Fim de semana");
                break;
            default: System.out.println("Dia inválido.");
        }
    }
}
