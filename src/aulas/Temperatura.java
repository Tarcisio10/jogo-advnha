package aulas;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o valor de uma temperatura em °F para ser convertida : ");
        double tempF = input.nextDouble();
        double tempC = (tempF - 32)/1.8;
        System.out.println("A temperatura convertida para Celsius é de : " + tempC + "°C ");
        
        
    }
}
