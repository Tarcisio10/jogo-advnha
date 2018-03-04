package aulas;

import javax.swing.JOptionPane;

public class SalarioPlanodeCarreira {

    public static void main(String[] args) {
        String funcionario;
        double nivel;
        double tempoT;
        double calculo;
        double mes;
        funcionario = JOptionPane.showInputDialog("Escreva o nome(a) do funcionario(a)");
        tempoT = Double.parseDouble(JOptionPane.showInputDialog("Escreva a quantidade de horas trabalhadas"));
        nivel = Double.parseDouble(JOptionPane.showInputDialog("O nivel dentro do plano de carreira"));
        switch (nivel) {
            case 1:
                calculo = nivel * tempoT * 15.00 * 30;
                System.out.println("O(a) funcionario(a) " + funcionario + " trabalhou " + tempoT + " horas por R$ 15.00 Nivel " + " (" + nivel + ")" + "e deve receber R$" + calculo);
                break;
            case 2:
                calculo = nivel * tempoT * 18.00 * 30;
                System.out.println("O(a) funcionario(a) " + funcionario + " trabalhou " + tempoT + " horas por R$ 18.00 Nivel " + " (" + nivel + ")" + "e deve receber R$" + calculo);
                break;
            case 3:
                calculo = nivel * tempoT * 22.00 * 30;
                System.out.println("O(a) funcionario(a) " + funcionario + " trabalhou " + tempoT + " horas por R$ 22.00 Nivel " + " (" + nivel + ")" + "e deve receber R$" + calculo);
                break;
            case 4:
                calculo = nivel * tempoT * 27.00 * 30;
                System.out.println("O(a) funcionario(a) " + funcionario + "trabalhou" + tempoT + " horas por R$ 27.00 Nivel " + " (" + nivel + ")" + "e deve receber R$" + calculo);
                break;
            case 5:
                calculo = nivel * tempoT * 33.00 * 30;
                System.out.println("O(a) funcionario(a) " + funcionario + " trabalhou " + tempoT + " horas por R$ 30.00 Nivel " + " (" + nivel + ")" + "e deve receber R$" + calculo);
                break;
            default:
                break;
        }
    }
}


