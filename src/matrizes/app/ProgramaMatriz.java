package matrizes.app;

import javax.swing.JOptionPane;

import matrizes.service.MatrizService;

public class ProgramaMatriz {

    public static void main(String[] args) {

        MatrizService servico = new MatrizService();

        JOptionPane.showMessageDialog(null, "Vamos preencher a Matriz A (2x2).");
        int[][] matrizA = servico.lerMatriz("A");

        JOptionPane.showMessageDialog(null, "Agora vamos preencher a Matriz B (2x2).");
        int[][] matrizB = servico.lerMatriz("B");

        int[][] resultado = servico.somarMatrizes(matrizA, matrizB);

        String saida = "=== Resultado da Soma ===\n"
                + servico.formatarMatriz("Matriz A:", matrizA) + "\n"
                + servico.formatarMatriz("Matriz B:", matrizB) + "\n"
                + servico.formatarMatriz("Resultado (A + B):", resultado);

        JOptionPane.showMessageDialog(null, saida);
    }
}