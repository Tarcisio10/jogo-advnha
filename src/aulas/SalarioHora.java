package aulas;

import java.util.Scanner;

public class SalarioHora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe nome do funcionario: ");
        String nome = input.next();
        System.out.print("Informe valor da hora trabalhada: ");
        double valorHora = input.nextDouble();
        System.out.print("Informe quantidade de horas trabalhadas: ");
        double horasTrabalhadas = input.nextDouble();

        double salario = horasTrabalhadas * valorHora;
        
        System.out.println("O funcionario " + nome + " recebe R$" + salario + " por mes.");
    }
}
