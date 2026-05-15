package matrizes.service;

import javax.swing.JOptionPane;

public class MatrizService {

    public int[][] lerMatriz(String nomeMatriz) {
        int[][] matriz = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                boolean entradaValida = false;
                while (!entradaValida) {
                    String entrada = JOptionPane.showInputDialog(null,
                            "Matriz " + nomeMatriz + " - linha " + (i + 1) + ", coluna " + (j + 1) + ":");

                    if (entrada == null) {
                        JOptionPane.showMessageDialog(null, "Programa encerrado.");
                        System.exit(0);
                    }

                    try {
                        matriz[i][j] = Integer.parseInt(entrada.trim());
                        entradaValida = true;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                                "Valor inválido! Digite apenas números inteiros.",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        return matriz;
    }

    public int[][] somarMatrizes(int[][] matrizA, int[][] matrizB) {
        int[][] resultado = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    public String formatarMatriz(String titulo, int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo).append("\n");
        for (int i = 0; i < 2; i++) {
            sb.append("[ ");
            for (int j = 0; j < 2; j++) {
                sb.append(matriz[i][j]);
                if (j < 1) sb.append("  ");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }
}