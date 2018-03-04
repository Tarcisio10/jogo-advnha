package aulas;

import java.util.Scanner;

public class bhaskara {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Valor de x1: ");
        double x1 = input.nextDouble();
        System.out.println("Valor de x2: ");
        double x2 = input.nextDouble();
        System.out.println("Valor de c: ");
        double c = input.nextDouble();

        double S = x1 + x2;
        double P = x1 * x2;
        double a = c / P;
        double b = -(S * a);

        System.out.println("A equação que tem raízes " + x1 + " e " + x2 + " é " + a + " x² + " + b + " x+ " + c);

    }
}
