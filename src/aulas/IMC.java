package aulas;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Qual o seu nome: ");
        String nome = input.next();
        System.out.println("Qual a sua altura: ");
        double altura = input.nextDouble();
        System.out.println("Informe o seu peso: ");
        double peso = input.nextDouble();
        
        double imc = peso / (altura*altura);
        if(imc < 18.5) {
            System.out.println(nome + " voce esta abaixo do peso");
        } else if (imc >= 18.5 && imc > 25) {
            System.out.println(nome + " voce esta com o peso normal");
        } else if (imc >= 25 && imc > 30) {
            System.out.println(nome + " voce esta acima do peso");
        } else if (imc >= 30) {
            System.out.println(nome + " voce esta obeso");
        } 
    }
}
