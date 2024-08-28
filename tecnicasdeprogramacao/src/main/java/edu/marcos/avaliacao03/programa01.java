package edu.marcos.avaliacao03;
import javax.swing.JOptionPane;

public class programa01 {

//    Um programa capaz de imprimir todos os números pares em um intervalo de
//    números informados pelo usuário;

    public static void main(String[] args) {
        int valorInicial = 0, valorFinal = 0;
        StringBuilder numbersList = new StringBuilder();
        try {
            String valorInicialString = JOptionPane.showInputDialog("Digite o valor inicial: ");
            valorInicial = Integer.parseInt(valorInicialString);
            String valorFinalString = JOptionPane.showInputDialog("Digite o valor final: ");
            valorFinal= Integer.parseInt(valorFinalString);

            if (valorInicial == valorFinal) {
                throw new Exception("Valores_iguais");
            }

        } catch (Exception e) {
            invocarErro();
        }

        int add = valorInicial < valorFinal ? 2 : -2;
        for (int i = valorInicial; (valorInicial < valorFinal) ? (i <= valorFinal) : (i >= valorFinal); i += add) {
            if (i % 2 != 0) {
                i += valorInicial < valorFinal ? 1 : -1;
            }
            numbersList.append(" ").append(i);
        }
        JOptionPane.showMessageDialog(null,numbersList, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
