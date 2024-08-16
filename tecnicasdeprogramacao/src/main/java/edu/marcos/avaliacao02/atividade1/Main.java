package edu.marcos.avaliacao02.atividade1;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String valorString = JOptionPane.showInputDialog("Digite o valor: ");
        try {
            double valor = Double.parseDouble(valorString);
            final double VALORMOD3 = valor % 3;
            String mensagem = ("O valor " + (VALORMOD3 == 0 ? "é" : "não é") + " múltiplo de três");
            JOptionPane.showMessageDialog(null, mensagem, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            invocarErro();
        }

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
    }

}
