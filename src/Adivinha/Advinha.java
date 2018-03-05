package Adivinha;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Advinha {
    static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) {
        
        String[] perguntas = {
            "Sua pergunta?",
            "Sua pergunta2 ",
            "que ano nos estamos ?"
            
        };
        String[] alternativas = {
            "0;Robson","0;Wilson",
            "1;Fred","1;Welerson","1;Beto",
            "2;2002", "2;2018", "2;2014","2;1992"
        };
        
        int[] corretas = {0,2,1};
        
        for ( int i = 0 ; i < perguntas.length; i++){
           ArrayList<String> _alternativas = new ArrayList<String>();
           
           for (int j = 0; j < alternativas.length;j++) {
                if ( Integer.parseInt(alternativas[j].split(";")[0])== i){
                    _alternativas.add(alternativas[j].split(";")[1]);
                }
            }
           
            pergunta (perguntas [i] , _alternativas , corretas[i]);
        }
    }
        
    
    private static void pergunta(String titulo , ArrayList<String> perguntas,int correta) {
        System.out.println("                             Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "             " + titulo + "\n");
        
        for (int i = 0 ; i <perguntas.size();i++){
            System.out.println( i + ". " + perguntas.get(i) +  ".");
        }
        System.out.println(" Digite o numero da alternativa : ");
        if (verificaresposta(correta)){
            System.out.print("voce acertou!");
        }else{
            System.out.println("Voce errou!");
        }
        
        
    }private static boolean verificaresposta(int correto) {
        int resposta = leia.nextInt();
                  
        return resposta == correto  ;
        
    }
    
}
