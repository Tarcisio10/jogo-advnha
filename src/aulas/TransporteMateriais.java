package aulas;

import java.util.Scanner;

public class TransporteMateriais {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual tipo de material será transportado? (A, B, C ou D)");
        String letra = input.next();
        System.out.println("Qual temperatura está no local de transporte? ");
        double temperatura = input.nextDouble();

        switch (letra) {
            case "A":
                if (temperatura >= 10 && temperatura <= 17) {
                    System.out.println("Transporte pode ser efetuado!");
                } else {
                    System.out.println("Transporte não pode ser efetuado!");
                }
                break;
            case "B":
                if (temperatura >= 11 && temperatura <= 16) {
                    System.out.println("Transporte pode ser efetuado!");
                } else {
                    System.out.println("Transporte não pode ser efetuado!");
                }
                break;
            case "C":
                if (temperatura >= 12 && temperatura <= 15) {
                    System.out.println("Transporte pode ser efetuado!");
                } else {
                    System.out.println("Transporte não pode ser efetuado!");
                }
                break;
            case "D":
                if (temperatura >= 13 && temperatura <= 14) {
                    System.out.println("Transporte pode ser efetuado!");
                } else {
                    System.out.println("Transporte não pode ser efetuado!");
                }
                break;
                
            default: System.out.println("Tipo de material desconhecido!");   
        } 
    }
}
