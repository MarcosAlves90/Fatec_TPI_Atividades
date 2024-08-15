package edu.marcos.avaliacao02.atividade3;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));

        JOptionPane.showMessageDialog(null, "O valor da venda é: R$" + (valorProduto < 20 ? valorProduto * 1.45 : valorProduto * 1.3), "Resultado: ", JOptionPane.INFORMATION_MESSAGE);

    }

}
