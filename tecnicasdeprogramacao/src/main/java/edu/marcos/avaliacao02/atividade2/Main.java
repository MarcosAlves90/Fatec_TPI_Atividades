package edu.marcos.avaliacao02.atividade2;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double[] arrayDeValores = new double[3];
        for (int i = 0; i < 3; i++) {
            arrayDeValores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor " + (i+1) + ":"));
        }
        Arrays.sort(arrayDeValores);
        JOptionPane.showMessageDialog(null, Arrays.toString(arrayDeValores), "Valores em ordem crescente: ", JOptionPane.INFORMATION_MESSAGE);
    }

}
