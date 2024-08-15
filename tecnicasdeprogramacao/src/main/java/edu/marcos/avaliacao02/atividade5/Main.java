package edu.marcos.avaliacao02.atividade5;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        final double VALOR = idade <= 10 ? 30 : idade <= 29 ? 60 : idade <= 45 ? 120 : idade <= 59 ? 150 : idade <= 65 ? 250 : 400;
        String mensagem = ("O valor do plano de saúde para " + nome + " é R$" + VALOR);
        JOptionPane.showMessageDialog(null, mensagem, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);

    }

}
