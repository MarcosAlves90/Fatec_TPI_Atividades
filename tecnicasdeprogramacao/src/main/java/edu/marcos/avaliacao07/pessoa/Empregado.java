package edu.marcos.avaliacao07.pessoa;

import javax.swing.JOptionPane;

public class Empregado extends Pessoa {
    private double salario;

    public Empregado(String nome, int idade, double altura, char sexo, double salario) {
        super(nome, idade, altura, sexo);
        setSalario(salario);
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            JOptionPane.showMessageDialog(null, "Erro: Salário inválido. Deve ser maior ou igual a 0.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.salario = salario;
    }

    public double obterLucros() {
        return salario;
    }
}