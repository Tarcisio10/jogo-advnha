package aulas;

import java.util.Scanner;

public class CalculadoraSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe num1: ");
        double num1 = input.nextDouble();
        System.out.println("Informe uma operação: (+, -, / ou *)");
        String operacao = input.next();
        System.out.println("Informe num 2: ");
        double num2 = input.nextDouble();

        switch (operacao) {
            case "+":
                System.out.println("Resultado = " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado = " + (num1 - num2));
                break;
            case "/":
                System.out.println("Resultado = " + (num1 / num2));
                break;
            case "*":
                System.out.println("Resultado = " + (num1 * num2));
                break;
            default:
                System.out.println("Erro");
        }

    }
}
