package Projeto;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Projeto {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int[] resposta = new int[25];
        int[] tempo = new int[25];
        int[] antes = new int[25];
        double[] segundos = new double[25];
        int[] timeSeconds = new int[25];
        String[] nome = new String[25];
        System.out.println();
        System.out.print("▒█▀▀█ ▒█▀▀▀ ▒█▀▀▀█ ▒█▀▀█ ▒█▀▀▀█ ▒█▄░▒█ ▒█▀▀▄ ░█▀▀█ \n"
                + "▒█▄▄▀ ▒█▀▀▀ ░▀▀▀▄▄ ▒█▄▄█ ▒█░░▒█ ▒█▒█▒█ ▒█░▒█ ▒█▄▄█ \n"
                + "▒█░▒█ ▒█▄▄▄ ▒█▄▄▄█ ▒█░░░ ▒█▄▄▄█ ▒█░░▀█ ▒█▄▄▀ ▒█░▒█ ");
        System.out.println("\n");
        System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
        System.out.println("                        JOGO DE PERGUNTAS E RESPOSTAS                        ");
        System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
        System.out.println("                                Deseja jogar?                                ");
        System.out.println("➊ - Sim                                        \n"
                + "➋ - Não                                        ");
        String desejaJogar = leia.nextLine();
        
        //switch (desejaJogar) {
           // case "1": 
          //      for int i = 0
        //}
        
        
        
        
        
        
        

        switch (desejaJogar) {
            case "2":
                
            case "1":

                for (int i = 0; i < resposta.length; i++) {
                    System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                    System.out.print("INFORME SEU NOME:   ");
                    nome[i] = leia.nextLine();
                    System.out.println();
                    System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                    System.out.println("                                Olá " + nome[i] + "");

                    int pontuacao1 = 0;
                    System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                    System.out.println("             SEGUE ABAIXO A ORDEM DE MATÉRIAS A SEREM RESPONDIDAS!             ");
                    System.out.println("           LEMBRE-SE, VOCÊ TEM 15 SEGUNDOS PARA RESPONDER AS PERGUNTAS");
                    System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                    System.out.println("► ➊º Matemática; \n"
                            + "► ➋º Entretenimento; \n"
                            + "► ➌º Esportes; \n"
                            + "► ➍º Inglês; \n"
                            + "► ➎º Ciências. \n");
                    System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                            + "                                VAMOS COMEÇAR?\n"
                            + "➊-Sim?\n"
                            + "➋-Não?\n");
                    int opcao = leia.nextInt();

                    if (opcao == 2) {
                        System.out.println("Ok, bye!");
                        break;

                    }

                    if (opcao == 1) {
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        System.out.println("                                 ➊º matéria:\n"
                                + "                                 Matemática!!                            ");
                        System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        System.out.println("                             Vamos a ➊º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                          Qual o resultado de 300X50?\n"
                                + "➊ - 1500\n"
                                + "➋ - 20000\n"
                                + "➌ - 30000\n"
                                + "➍ - 15000\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                    + "Certa Resposta!!\n");
                            pontuacao1 = pontuacao1 + 1;
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }

                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➋º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                            Quanto é 50X5?\n"
                                + "➊ - 125\n"
                                + "➋ - 225\n"
                                + "➌ - 250\n"
                                + "➍ - 325\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➌º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                            Quanto é 3X47?\n"
                                + "➊ - 131\n"
                                + "➋ - 141\n"
                                + "➌ - 151\n"
                                + "➍ - 161\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➍º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                            Quanto é 16X9?\n"
                                + "➊ - 124\n"
                                + "➋ - 134\n"
                                + "➌ - 144\n"
                                + "➍ - 154\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➎º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                           Quanto é 90X38?\n"
                                + "➊ - 2320\n"
                                + "➋ - 4240\n"
                                + "➌ - 3240\n"
                                + "➍ - 3420\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 2 && segundos[i] < 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 3 && segundos[i] < 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 4 && segundos[i] < 15) {
                            System.out.println("Certa Resposta!!");
                            pontuacao1 = pontuacao1 + 1;
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }

                        System.out.println("                                ➋º Matéria\n"
                                + "                              Entretenimento!!!\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        System.out.println("                               ➊º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        System.out.print("              Qual série tem Michael Scofield como protagonista?\n"
                                + "➊ - Breaking Bad\n"
                                + "➋ - The Walking Dead\n"
                                + "➌ - Prison Break\n"
                                + "➍ - Game of Thrones\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");

                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➋º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                    Slash foi o guitarrista da banda?\n"
                                + "➊ - Pearl Jam\n"
                                + "➋ - Iron Maiden\n"
                                + "➌ - Guns N' Roses\n"
                                + "➍ - AC/DC\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➌º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "          Qual música teve mais viewers no Youtube em 2017?\n"
                                + "➊ - Shape of you\n"
                                + "➋ - Despacito\n"
                                + "➌ - Mercy\n"
                                + "➍ - Closer\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➍º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "          Qual desses filmes ganhou o Óscar de melhor filme do ano?\n"
                                + "➊ - La La Land\n"
                                + "➋ - Lion Lion\n"
                                + "➌ - Moonlight\n"
                                + "➍ - Arrival\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➎º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "     Qual ator interpreta 'Capitão Nascimento' no filme Tropa de Elite?\n"
                                + "➊ - Lázaro Ramos\n"
                                + "➋ - Murilo Benicio\n"
                                + "➌ - Selton Mello\n"
                                + "➍ - Wagner Moura\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }

                        antes[i] = (int) System.currentTimeMillis();

                        System.out.println("                                ➌º Matéria\n"
                                + "                                Esportes!!!\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                             ➊º Pergunta:\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n" + "                         Quem é Lebron James?\n"
                                + "➊ - Jogador de Tênis\n"
                                + "➋ - Jogador de Futebol\n"
                                + "➌ - Jogador de Basquete\n"
                                + "➍ - Cantor\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }

                        System.out.printf("O programa executou em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➋º Pergunta:\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n" + "         Quantos prêmios de melhor jogador do mundo tem Neymar?\n"
                                + "➊ - Nenhum\n"
                                + "➋ - Dois\n"
                                + "➌ - Três\n"
                                + "➍ - Um\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("O programa executou em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➌º Pergunta:\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n" + "     Quantos campeonatos Mundiais tem a Seleção Brasileira de Futebol?\n"
                                + "➊ - Nenhum\n"
                                + "➋ - Quatro\n"
                                + "➌ - Cinco\n"
                                + "➍ - Seis\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!!");

                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➍º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n" + "              Quem é o melhor jogador do mundo de 2016?\n"
                                + "➊ - Lionel Messi\n"
                                + "➋ - Luis Suárez\n"
                                + "➌ - Neymar\n"
                                + "➍ - Cristiano Ronaldo\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➎º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n" + "                   Quantos Mundiais tem o Palmeiras?\n"
                                + "➊ - O Palmeiras não tem mundial\n"
                                + "➋ - Um\n"
                                + "➌ - Dois\n"
                                + "➍ - Três\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");

                        }

                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                          Vamos para Inglês!!!\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        System.out.println("                             ➊º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "               What's the meaning of the word 'mirror'?\n"
                                + "➊ - Vidro\n"
                                + "➋ - Espelho\n"
                                + "➌ - Cortina\n"
                                + "➍ - Buraco\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");

                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➋º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "               Qual o significado da palavra 'watermelon'?\n"
                                + "➊ - Melão\n"
                                + "➋ - Abacate\n"
                                + "➌ - Melancia\n"
                                + "➍ - Laranja\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➌º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "               Qual o significado da palavra 'cool'?\n"
                                + "➊ - Vaca\n"
                                + "➋ - Piscina\n"
                                + "➌ - Legal\n"
                                + "➍ - Lã\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➍º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "           Como se escreve 'carregador de celular' em inglês?\n"
                                + "➊ - Cell phone Charger\n"
                                + "➋ - Cell phone Carregator\n"
                                + "➌ - Cell phone Carregador\n"
                                + "➍ - Charge Cell phone \n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➎º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "              What's the meaning of the word 'Pretty'?\n"
                                + "➊ - Preto\n"
                                + "➋ - Fofo\n"
                                + "➌ - Legal\n"
                                + "➍ - Bonito\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                        Vamos para Ciências!!!\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        System.out.println("                             ➊º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        System.out.print("                      90% da produção de O2 vem:\n"
                                + "➊ - Das árvores\n"
                                + "➋ - Das algas\n"
                                + "➌ - Dos rios\n"
                                + "➍ - Dos mamíferos\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");

                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➋º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + " A cor vermelha se refere a que tipo de material a ser reciclado nos lixos?\n"
                                + "➊ - Metal\n"
                                + "➋ - Vidro\n"
                                + "➌ - Plástico\n"
                                + "➍ - Papel\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➌º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                 Qual é o primeiro nome de Darwin?\n"
                                + "➊ - Robert\n"
                                + "➋ - Albert\n"
                                + "➌ - Thomas\n"
                                + "➍ - Charles\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➍º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "                     A teoria da seleção natural é de:\n"
                                + "➊ - Einsten\n"
                                + "➋ - Lamarck\n"
                                + "➌ - Darwin\n"
                                + "➍ - Mendel\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }
                        antes[i] = (int) System.currentTimeMillis();
                        System.out.println("                             ➎º Pergunta\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒\n"
                                + "   Quantas moléculas de hidrogênio e oxigênio tem a água, respectivamente?\n"
                                + "➊ - 1 e 2\n"
                                + "➋ - 2 e 1\n"
                                + "➌ - 2 e 0\n"
                                + "➍ - 1 e 1\n");
                        resposta[i] = leia.nextInt();
                        tempo[i] = (int) (System.currentTimeMillis() - antes[i]);
                        timeSeconds[i] = (int) TimeUnit.SECONDS.toSeconds(tempo[i]);
                        segundos[i] = tempo[i] / 1000;
                        if (resposta[i] == 1 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 2 && segundos[i] <= 15) {
                            System.out.println("Certa Resposta!");
                            pontuacao1 = pontuacao1 + 1;
                        } else if (resposta[i] == 3 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        } else if (resposta[i] == 4 && segundos[i] <= 15) {
                            System.out.println("Resposta Errada!");
                        }
                        System.out.printf("Você respondeu em " + segundos[i] + " segundos \n");
                        System.out.println("Você tem " + pontuacao1 + " ponto(s)\n"
                                + "♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");

                        if (segundos[i] > 15) {
                            System.out.println("Tempo Expirado!!");
                        }

                        if (pontuacao1 >= 23) {
                            System.out.println("                                PONTUAÇÃO");
                            System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                            System.out.println("PARABÉNS " + nome[i] + " VOCÊ É MUITO INTELIGENTE, OBTEVE " + pontuacao1 + " PONTOS!");
                            System.out.println("");
                            System.out.println("OBRIGADO PELA PARTICIPAÇÃO!");
                        } else if (pontuacao1 >= 16 && pontuacao1 < 23) {
                            System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                            System.out.println(nome[i] + " VOCÊ ESTÁ NO NÍVEL INTERMEDIÁRIO, OBTEVE " + pontuacao1 + " PONTOS!");
                            System.out.println("");
                            System.out.println("OBRIGADO PELA PARTICIPAÇÃO!");
                        } else if (pontuacao1 < 16) {
                            System.out.println("♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒♒");
                            System.out.println(nome[i] + ", VOCÊ ESTÁ PRECISANDO ESTUDAR AMIGÃO, OBTEVE SOMENTE " + pontuacao1 + " PONTOS!");
                            System.out.println("MESMO ASSIM OBRIGADO PELA PARTICIPAÇÃO!");
                        }

                    }

                    break;
                }
                break;

            default:
                System.out.println("Entrada inválida.");
                break;
        }
       
    } 
    
   
      
    }
