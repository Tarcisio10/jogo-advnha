package aulas;

import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorAssinatura = 23.32;
        System.out.println("Quantos minutos foram gastos em ligações locais: ");
        double min = input.nextDouble();
        double ligacoesLocais = (0.09 * min);
        System.out.println("Quantos minutos foram gastos em ligações interurbanas: ");
        double min1 = input.nextDouble();
        double ligacoesInterurb = (0.26 * min);
        System.out.println("Quantos minutos foram gastos em ligaçoes internacionais: ");
        double min2 = input.nextDouble();
        double ligacoesInternac = (0.86 * min);

        System.out.printf("O valor total de ligações locais é R$%.2f%n", ligacoesLocais);
        System.out.printf("O valor total de ligações interurbanas é R$%.2f%n", ligacoesInterurb);
        System.out.printf("O valor total de ligações internacionais é R$%.2f%n", ligacoesInternac);
        System.out.println("O valor total é R$" + (valorAssinatura + ligacoesInternac + ligacoesInterurb + ligacoesLocais) + "(junto à assinatura)");
    }
}
