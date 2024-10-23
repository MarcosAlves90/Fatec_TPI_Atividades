package edu.marcos.avaliacao07.pessoa;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private char sexo;

    public Pessoa(String nome, int idade, double altura, char sexo) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro: Nome inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            JOptionPane.showMessageDialog(null, "Erro: Idade inválida. Deve ser maior ou igual a 0.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            JOptionPane.showMessageDialog(null, "Erro: Altura inválida. Deve ser maior que 0.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo != 'M' && sexo != 'F') {
            JOptionPane.showMessageDialog(null, "Erro: Sexo inválido. Deve ser 'M' ou 'F'.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.sexo = sexo;
    }
}