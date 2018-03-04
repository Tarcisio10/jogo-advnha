package javaapplicationtopdomomento;

import java.util.Scanner;

public class Mes2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe um mês: ");
        int mes = leia.nextInt();
        
        switch(mes) {
            case 12:
            case 1:
            case 2:
            case 6:
            case 7:
                System.out.println("Alta temporada");
                break;
            case 3:
            case 4: 
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Baixa temporada");
            default: System.out.println("Mês inválido");
        }
    }
}
