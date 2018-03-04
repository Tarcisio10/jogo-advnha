package aulas;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe lado A do triângulo: ");
        double ladoA = input.nextDouble();
        System.out.println("Informe lado B do triângulo: ");
        double ladoB = input.nextDouble();
        System.out.println("Informe lado C do triângulo: ");
        double ladoC = input.nextDouble();
        
        if(ladoA == ladoB && ladoB == ladoC) {
            System.out.println("Triângulo equilátero");
        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }
}
