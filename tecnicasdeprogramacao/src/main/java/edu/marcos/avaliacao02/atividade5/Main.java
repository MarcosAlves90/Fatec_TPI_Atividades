package edu.marcos.avaliacao02.atividade5;
import javax.swing.JOptionPane;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String idadeInserida = JOptionPane.showInputDialog("Digite a idade: ");
        try {
            int idade = Integer.parseInt(idadeInserida);
            if (verificarIdadeInvalida(idade)) {
                throw new Error("A idade não pode ser negativa.");
            }
            final double VALOR = idade <= 10 ? 30 : idade <= 29 ? 60 : idade <= 45 ? 120 : idade <= 59 ? 150 : idade <= 65 ? 250 : 400;
            String mensagem = ("O valor do plano de saúde para " + nome + " é R$" + VALOR);
            JOptionPane.showMessageDialog(null, mensagem, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException | Error e) {
            invocarErro();
        }

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
    }

    public static boolean verificarIdadeInvalida(int idade) {
        return ((idade / abs(idade) != 1));
    }

}
