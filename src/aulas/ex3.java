package aulas;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe km rodados: ");
        double km = input.nextDouble();
        System.out.println("Informe quantos litros foram utilizados: ");
        double litros = input.nextDouble();
        double result = km / litros;
        System.out.println("Seu carro faz " + result + "km/l");

    }

}
