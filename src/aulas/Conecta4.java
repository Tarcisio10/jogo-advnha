package aulas;

public class Conecta4 {

    import javax.swing.JOptionPane ;

    public static void main(String[] args) {
        int botão = 0;
        int resultado = 0;
        int quadradosAbertos = 1;
        int linha0 = 5, linha1 = 5, linha2 = 5, linha3 = 5, linha4 = 5, linha5 = 5, linha6 = 5;
        int coluna = 0;
        boolean jogadavalida = false;
        boolean certo = false;
        String jogada;
        String[][] tabuleiro = new String[8][7];
        String[] printtabuleiro = new String[20];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }
        String JogadaUser1 = "", JogadaUser2 = "", QuemJoga = "";
        String Jogador1;
        Jogador1 = JOptionPane.showInputDialog("Digite o Nome do Jogador 1");
        String Jogador2;
        Jogador2 = JOptionPane.showInputDialog("Digite o Nome do Jogador 2");
        if (Jogador1.equals("") || Jogador1.equals(" ") || Jogador1.equals("   ")) {
            JOptionPane.showMessageDialog(null, "Nome do Jogador 1 inválido");
            Jogador1 = JOptionPane.showInputDialog("Digite o Nome o Jogador 1");
        }
        if (Jogador2.equals("") || Jogador2.equals(" ") || Jogador2.equals("   ")) {
            JOptionPane.showMessageDialog(null, "Nome do Jogador 2 inválido");
            Jogador2 = JOptionPane.showInputDialog("Digite o Nome o Jogador 2");
        }
        String[] JogadaSelecionada = {"X", "O"};
        String JogadaUser = (String) JOptionPane.showInputDialog(null, "Choose your destiny...", "Qual o simbolo do Jogador 1", JOptionPane.QUESTION_MESSAGE, null, JogadaSelecionada, JogadaSelecionada[0]);
        if (JogadaUser.equals("X")) {
            JogadaUser1 = "X";
            JogadaUser2 = "O";
        } else if (JogadaUser.equals("O")) {
            JogadaUser1 = "O";
            JogadaUser2 = "X";
        }
        boolean vez = true;
        boolean vezSimbolo = true;
        boolean ganhadorX = true;
        boolean ganhadorO = true;
        String[] printEx = new String[20];
        printEx[0] = "Cada quadrado representa um número.";
        printEx[1] = "Ao conseguir 4 iguais você ganha:";
        printEx[2] = "   1    |   2   |   3  |   4  |   5  |   6  ";
        printEx[3] = "--------|-------|------|------|------|-----";
        printEx[4] = "   7    |   8   |   9  |   10 |   11 |   12   ";
        printEx[5] = "--------|-------|------|------|------|-----";
        printEx[6] = "   13   |   14  |  15  |   16 |   17 |   18 ";
        printEx[7] = "--------|-------|------|------|------|-----";
        printEx[8] = "   19   |   20  |   21 |   22 |   23 |   24   ";
        printEx[9] = "--------|-------|------|------|------|-----";
        printEx[10] = "   25   |   26  |   27 |   28 |   29 |   30   ";
        printEx[11] = "--------|-------|------|------|------|-----";
        printEx[12] = "   31   |   32  |   33 |   34 |   35 |   36   ";
        printEx[13] = "--------|-------|------|------|------|-----";
        printEx[14] = "   37   |   38  |   39 |   40 |   41 |   42   ";
        printEx[15] = "--------|-------|------|------|------|-----";
        JOptionPane.showMessageDialog(null, printEx);
        do {
            while (quadradosAbertos <= 42) {
                if (vez) {
                    QuemJoga = Jogador1;
                } else {
                    QuemJoga = Jogador2;
                }
                if (vezSimbolo) {
                    jogada = JogadaUser1;
                } else {
                    jogada = JogadaUser2;
                }
                do {
                    try {
                        coluna = Integer.parseInt(JOptionPane.showInputDialog(QuemJoga + " Digite a coluna de 1 a 7")) - 1;
                        jogadavalida = true;
                    } catch (NumberFormatException erro) {
                        JOptionPane.showMessageDialog(null, "Coluna " + (coluna + 1) + " Inválida");
                    }
                } while (!jogadavalida);
                if (coluna == 0 && linha0 >= 0) {
                    tabuleiro[linha0][coluna] = jogada;
                    jogadavalida = true;
                    linha0 = linha0 - 1;
                    vez = !vez;
                    vezSimbolo = !vezSimbolo;
                    quadradosAbertos = quadradosAbertos + 1;
                } else if (coluna == 1 && linha1 >= 0) {
                    tabuleiro[linha1][coluna] = jogada;
                    linha1 = linha1 - 1;
                    vez = !vez;
                    vezSimbolo = !vezSimbolo;
                    quadradosAbertos = quadradosAbertos + 1;
                } else if (coluna == 2 && linha2 >= 0) {
                    tabuleiro[linha2][coluna] = jogada;
                    linha2 = linha2 - 1;
                    vez = !vez;
                    vezSimbolo = !vezSimbolo;
                    quadradosAbertos = quadradosAbertos + 1;
                } else if (coluna == 3 && linha3 >= 0) {
                    tabuleiro[linha3][coluna] = jogada;
                    linha3 = linha3 - 1;
                    vez = !vez;
                    vezSimbolo = !vezSimbolo;
                    quadradosAbertos = quadradosAbertos + 1;
                } else if (coluna == 4 && linha4 >= 0) {
                    tabuleiro[linha4][coluna] = jogada;
                    linha4 = linha4 - 1;
                    vez = !vez;
                    vezSimbolo = !vezSimbolo;
                } else if (coluna == 5 && linha5 >= 0) {
                    tabuleiro[linha5][coluna] = jogada;
                    linha5 = linha5 - 1;
                    vez = !vez;
                    vezSimbolo = !vezSimbolo;
                    quadradosAbertos = quadradosAbertos + 1;
                } else if (coluna == 6 && linha6 >= 0) {
                    tabuleiro[linha6][coluna] = jogada;
                    linha6 = linha6 - 1;
                    vez = !vez;
                    vezSimbolo = !vezSimbolo;
                    quadradosAbertos = quadradosAbertos + 1;
                } else {
                    JOptionPane.showMessageDialog(null, "Coluna " + (coluna + 1) + " Invalida. Insira de 1 a 7");
                }
                String pos1 = tabuleiro[0][0], pos7 = tabuleiro[0][1], pos13 = tabuleiro[0][2], pos19 = tabuleiro[0][3], pos25 = tabuleiro[0][4], pos31 = tabuleiro[0][5], pos37 = tabuleiro[0][6], pos2 = tabuleiro[1][0], pos8 = tabuleiro[1][1], pos14 = tabuleiro[1][2], pos20 = tabuleiro[1][3], pos26 = tabuleiro[1][4], pos32 = tabuleiro[1][5], pos38 = tabuleiro[1][6], pos3 = tabuleiro[2][0], pos9 = tabuleiro[2][1], pos15 = tabuleiro[2][2], pos21 = tabuleiro[2][3], pos27 = tabuleiro[2][4], pos33 = tabuleiro[2][5], pos39 = tabuleiro[2][6], pos4 = tabuleiro[3][0], pos10 = tabuleiro[3][1], pos16 = tabuleiro[3][2], pos22 = tabuleiro[3][3], pos28 = tabuleiro[3][4], pos34 = tabuleiro[3][5], pos40 = tabuleiro[3][6], pos5 = tabuleiro[4][0], pos11 = tabuleiro[4][1], pos17 = tabuleiro[4][2], pos23 = tabuleiro[4][3], pos29 = tabuleiro[4][4], pos35 = tabuleiro[4][5], pos41 = tabuleiro[4][6], pos6 = tabuleiro[5][0], pos12 = tabuleiro[5][1], pos18 = tabuleiro[5][2], pos24 = tabuleiro[5][3], pos30 = tabuleiro[5][4], pos36 = tabuleiro[5][5], pos42 = tabuleiro[5][6];
                printtabuleiro[0] = "    1    |   2    |   3   |   4   |   5   |   6   |   7  ";
                printtabuleiro[1] = "|   " + pos1 + "   |   " + pos7 + "   |   " + pos13 + "   |   " + pos19 + "   |   " + pos25 + "   |   " + pos31 + "   |   " + pos37 + "   ";
                printtabuleiro[2] = "--------|-------|-------|-------|-------|-------|-------";
                printtabuleiro[3] = "|   " + pos2 + "   |   " + pos8 + "   |   " + pos14 + "   |   " + pos20 + "   |   " + pos26 + "   |   " + pos32 + "   |   " + pos38 + "   ";
                printtabuleiro[4] = "--------|-------|-------|-------|-------|-------|-------";
                printtabuleiro[5] = "|   " + pos3 + "   |   " + pos9 + "   |   " + pos15 + "   |   " + pos21 + "   |   " + pos27 + "   |   " + pos33 + "   |   " + pos39 + "   ";
                printtabuleiro[6] = "--------|-------|-------|-------|-------|-------|-------";
                printtabuleiro[7] = "|   " + pos4 + "   |   " + pos10 + "   |   " + pos16 + "   |   " + pos22 + "   |   " + pos28 + "   |   " + pos34 + "   |   " + pos40 + "   ";
                printtabuleiro[8] = "--------|-------|-------|-------|-------|-------|-------";
                printtabuleiro[9] = "|   " + pos5 + "   |   " + pos11 + "   |   " + pos17 + "   |   " + pos23 + "   |   " + pos29 + "   |   " + pos35 + "   |   " + pos41 + "   ";
                printtabuleiro[10] = "--------|-------|-------|-------|-------|-------|-------";
                printtabuleiro[11] = "|   " + pos6 + "   |   " + pos12 + "   |   " + pos18 + "   |   " + pos24 + "   |   " + pos30 + "   |   " + pos36 + "   |   " + pos42 + "   ";
                printtabuleiro[12] = "--------|-------|-------|-------|-------|-------|-------";
                JOptionPane.showMessageDialog(null, printtabuleiro);
                ganhadorX = (pos1.equals("X") && pos2.equals("X") && pos3.equals("X") && pos4.equals("X") || pos5.equals("X") && pos6.equals("X") || pos7.equals("X") && pos8.equals("X") && pos9.equals("X") || pos1.equals("X") && pos5.equals("X") && pos9.equals("X") || pos3.equals("X") && pos5.equals("X") && pos7.equals("X") || pos1.equals("X") && pos4.equals("X") && pos7.equals("X") || pos2.equals("X") && pos5.equals("X") && pos8.equals("X") || pos3.equals("X") && pos6.equals("X") && pos9.equals("X"));
                ganhadorO = (pos1.equals("O") && pos2.equals("O") && pos3.equals("O") || pos4.equals("O") && pos5.equals("O") && pos6.equals("O") || pos7.equals("O") && pos8.equals("O") && pos9.equals("O") || pos1.equals("O") && pos5.equals("O") && pos9.equals("O") || pos3.equals("O") && pos5.equals("O") && pos7.equals("O") || pos1.equals("O") && pos4.equals("O") && pos7.equals("O") || pos2.equals("O") && pos5.equals("O") && pos8.equals("O") || pos3.equals("O") && pos6.equals("O") && pos9.equals("O"));
                if (ganhadorX) {
                    JOptionPane.showMessageDialog(null, QuemJoga + " Ganhou!! ");
                    break;
                } else if (ganhadorO) {
                    JOptionPane.showMessageDialog(null, QuemJoga + " Ganhou!! ");
                    break;
                }
            }
            if (quadradosAbertos == 43 && !ganhadorO && !ganhadorX) {
                JOptionPane.showMessageDialog(null, "Empate");
            }
            resultado = JOptionPane.showConfirmDialog(null, "Jogar novamente?", QuemJoga + " Ganhou!", botão);
            if (resultado == 0) {
                for (int i = 0; i < tabuleiro.length; i++) {
                    for (int j = 0; j < tabuleiro[i].length; j++) {
                        tabuleiro[i][j] = " ";
                    }
                }
                vez = !vez;
                vezSimbolo = !vezSimbolo;
                linha0 = 5;
                linha1 = 5;
                linha2 = 5;
                linha3 = 5;
                linha4 = 5;
                linha5 = 5;
                linha6 = 5;
            } else {
                JOptionPane.showMessageDialog(null, "Desistência!");
            }
        } while (resultado == 0);
    }
}

}
