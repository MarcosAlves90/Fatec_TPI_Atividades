package edu.marcos.avaliacao04;
import javax.swing.JOptionPane;

public class Programa06 {

    public static void main(String[] args) {
        try {
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor: "));
            double somaTabuada = 0;
            for (int i = 1; i <= 10; i++) {
                somaTabuada += valor * i;
            }
            JOptionPane.showMessageDialog(null, String.format("Soma da tabuada: %.2f", somaTabuada), "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception E) {
            invocarErro();
        }

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
