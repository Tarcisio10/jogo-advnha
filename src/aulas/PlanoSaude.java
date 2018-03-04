package javaapplicationtopdomomento;

import java.util.Scanner;

public class PlanoSaude {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Informe idade:");
        int idade = leia.nextInt();
        
        if(idade < 10) {
            System.out.println("Paga 80 reais no plano de saúde");
        } else if(idade >= 10 && idade <=30 ) {
            System.out.println("Paga 50 reais no plano saúde");
        } else if(idade >= 31 && idade <= 60) {
            System.out.println("Paga 95 reais no plano de saúde");
        } else if(idade > 60) {
            System.out.println("Paga 130 reais no plano de saúde");
        } else {
            System.out.println("Idade inválida");
        }
    }
}
