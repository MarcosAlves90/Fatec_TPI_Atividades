package edu.marcos.avaliacao07;

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

// Colocamos Empregado2 porque já temos uma classe Empregado no pacote edu.marcos.avaliacao07.

class Empregado2 extends Pessoa {
    private double salario;

    public Empregado2(String nome, int idade, double altura, char sexo, double salario) {
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

class EmpregadoTeste {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura:"));
            char sexo = JOptionPane.showInputDialog("Digite o sexo (M/F):").charAt(0);
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));

            Empregado2 empregado = new Empregado2(nome, idade, altura, sexo, salario);

            JOptionPane.showMessageDialog(null, "Nome: " + empregado.getNome() + "\nIdade: " + empregado.getIdade() + "\nAltura: " + empregado.getAltura() + "\nSexo: " + empregado.getSexo() + "\nLucros: " + empregado.obterLucros(), "Detalhes do Empregado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, insira valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}