package edu.marcos.avaliacao03;
import javax.swing.JOptionPane;

public class programa04 {

//    Um programa que calcule a média de uma aluno nos moldes da Fatec MAUÁ.

    public static void main(String[] args) {

        try {
            double p1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da p1: "));
            double p2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da p2: "));
            double p3 = -1;
            double trabalho = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do trabalho: "));
            if (p1 < 0 || p2 < 0 || trabalho < 0) {
                throw new Exception("Valores_negativos");
            } else if (p1 > 10 || p2 > 10 || trabalho > 10) {
                throw new Exception("Limite_ultrapassado");
            }
            double media = (p1 * 0.35) + (p2 * 0.35) + (trabalho * 0.30);
            JOptionPane.showMessageDialog(null, String.format("Média Ponderada: %.2f", media), "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
            if (media < 6) {
                try {
                    p3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota da p3: "));
                    if (p3 < 0) {
                        throw new Exception("Valores_negativos");
                    } else if (p3 > 10) {
                        throw new Exception("Limite_ultrapassado");
                    }
                } catch (Exception e) {
                    invocarErro();
                    System.exit(0);
                }
            } else {
                mostrarResultadoFinal(media);
            }
            if (p1 > p2) {
                media = (p1 * 0.35) + (p3 * 0.35) + (trabalho * 0.30);
            } else {
                media = (p3 * 0.35) + (p2 * 0.35) + (trabalho * 0.30);
            }
            JOptionPane.showMessageDialog(null, String.format("Média Ponderada: %.2f", media), "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
            mostrarResultadoFinal(media);
        } catch (Exception e) {
            invocarErro();
            System.exit(0);
        }

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valores inválidos", "Erro: ", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarResultadoFinal(double media) {
        JOptionPane.showMessageDialog(null, media >= 6 ? "Passou!" : "Recuperação!", "Resultado final: ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

}
