package aulas;

import java.util.Scanner;

public class Mes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um mês de 1 a 12: ");
        int mes = input.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro possui 31 dias");
                break;
            case 2:
                System.out.println("Fevereiro tem 28 ou 29 dias");
                break;
            case 3:
                System.out.println("Março possui 31 dias");
                break;
            case 4:
                System.out.println("Abril possui 30 dias");
                break;
            case 5:
                System.out.println("Maio possui 31 dias");
                break;
            case 6:
                System.out.println("Junho possui 30 dias");
                break;
            case 7:
                System.out.println("Julho possui 31 dias");
                break;
            case 8:
                System.out.println("Agosto possui 31 dias");
                break;
            case 9:
                System.out.println("Setembro possui 30 dias");
                break;
            case 10:
                System.out.println("Outubro possui 31 dias");
                break;
            case 11:
                System.out.println("Novembro possui 30 dias");
                break;
            case 12:
                System.out.println("Dezembro possui 31 dias");
                break;
            default:
                System.out.println("Mês inválido");
                break;

        }
    }
}
