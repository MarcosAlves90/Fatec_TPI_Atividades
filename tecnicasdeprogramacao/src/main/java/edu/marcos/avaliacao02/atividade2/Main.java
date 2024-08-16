package edu.marcos.avaliacao02.atividade2;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double[] arrayDeValores = new double[3];
        for (int i = 0; i < 3; i++) {
            String valorInserido = JOptionPane.showInputDialog("Digite o valor " + (i+1) + ":");
            try {
                arrayDeValores[i] = Double.parseDouble(valorInserido);
            } catch (NumberFormatException e) {
                invocarErro();
                i--;
            }
        }
        Arrays.sort(arrayDeValores);
        JOptionPane.showMessageDialog(null, Arrays.toString(arrayDeValores), "Valores em ordem crescente: ", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
    }

}
