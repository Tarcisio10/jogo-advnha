package aulas;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, altura, area;
        System.out.println("Informe valor da base: ");
        base = input.nextInt();
        System.out.println("Informe valor da altura: ");
        altura = input.nextInt();
        area = base * altura;
        System.out.println("O valor da area é " + area);

    }

}
