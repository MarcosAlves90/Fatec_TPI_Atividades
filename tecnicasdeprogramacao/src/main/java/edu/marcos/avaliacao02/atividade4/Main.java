package edu.marcos.avaliacao02.atividade4;
import javax.swing.JOptionPane;
import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args) {

        String valorInserido = JOptionPane.showInputDialog("Digite a idade: ");
        try {
            int idade = Integer.parseInt(valorInserido);
            if (verificarIdadeInvalida(idade)) {
                throw new Error("A idade não pode ser negativa.");
            }
            final String MENSAGEM = idade <= 16 ? "Não-eleitor" : idade >= 18 && idade <= 65 ? "Eleitor obrigatório" : "Eleitor facultativo";
            JOptionPane.showMessageDialog(null, MENSAGEM, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException | Error e) {
            invocarErro();
        }

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
    }

    public static boolean verificarIdadeInvalida(int idade) {
        return (idade != abs(idade));
    }

}
