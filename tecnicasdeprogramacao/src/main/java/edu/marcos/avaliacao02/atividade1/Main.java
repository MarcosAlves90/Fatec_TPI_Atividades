package edu.marcos.avaliacao02.atividade1;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
        final double VALORMOD3 = valor % 3;
        String mensagem = ("O valor " + (VALORMOD3 == 0 ? "é" : "não é") + " múltiplo de três");
        JOptionPane.showMessageDialog(null, mensagem, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);

    }

}
