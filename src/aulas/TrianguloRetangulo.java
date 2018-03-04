package aulas;

import java.util.Scanner;

public class TrianguloRetangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cateto1, cateto2;
        System.out.println("Informe o valor do primeiro cateto: ");
        cateto1 = input.nextDouble();
        System.out.println("Informe o valor do segundo cateto: ");
        cateto2 = input.nextDouble();
        double result = ((cateto1 * cateto1) + (cateto2 * cateto2));
        System.out.println("O valor da hipotenusa é igual á: " + result);

    }

}
