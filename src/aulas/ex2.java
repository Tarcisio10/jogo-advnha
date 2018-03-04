package aulas;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, resultado;
        System.out.print("Informe primeiro valor: ");
        x = input.nextInt();
        System.out.print("Informe segundo valor: ");
        y = input.nextInt();
        resultado = x * y;
        System.out.println("O valor da multiplicação é : " + resultado);
    }
}
