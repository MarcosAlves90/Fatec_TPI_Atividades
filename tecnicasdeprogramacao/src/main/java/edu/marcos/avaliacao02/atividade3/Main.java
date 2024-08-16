package edu.marcos.avaliacao02.atividade3;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String valorInserido = JOptionPane.showInputDialog("Digite o valor do produto: ");
        try {
            double valorProduto = Double.parseDouble(valorInserido);
            JOptionPane.showMessageDialog(null, "O valor da venda é: R$" +
                    (calcularValorVenda(valorProduto)), "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            invocarErro();
        }

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
    }

    public static double calcularValorVenda(double valor) {
        return valor < 20 ? valor * 1.45 : valor * 1.3;
    }

}
