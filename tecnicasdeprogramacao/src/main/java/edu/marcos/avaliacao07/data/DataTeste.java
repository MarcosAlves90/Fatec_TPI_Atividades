package edu.marcos.avaliacao07.data;

import javax.swing.JOptionPane;

public class DataTeste {
    public static void main(String[] args) {
        try {
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês:"));
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));

            Data data = new Data(mes, dia, ano);
            data.displayData();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}