package edu.marcos.avaliacao02.atividade4;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
        final String MENSAGEM = idade <= 16 ? "Não-eleitor" : idade >= 18 && idade <= 65 ? "Eleitor obrigatório" : "Eleitor facultativo";
        JOptionPane.showMessageDialog(null, MENSAGEM, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);

    }

}
