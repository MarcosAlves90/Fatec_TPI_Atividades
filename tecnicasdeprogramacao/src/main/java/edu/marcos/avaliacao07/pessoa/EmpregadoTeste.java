package edu.marcos.avaliacao07.pessoa;

import javax.swing.JOptionPane;

public class EmpregadoTeste {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
            char sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):").charAt(0);
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));

            Empregado empregado = new Empregado(nome, idade, altura, sexo, salario);

            JOptionPane.showMessageDialog(null, "Nome: " + empregado.getNome() + "\nIdade: " + empregado.getIdade() + "\nAltura: " + empregado.getAltura() + "\nSexo: " + empregado.getSexo() + "\nLucros: " + empregado.obterLucros(), "Detalhes do Empregado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
