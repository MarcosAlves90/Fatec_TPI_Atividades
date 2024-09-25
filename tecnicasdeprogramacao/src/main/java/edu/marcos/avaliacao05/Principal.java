package edu.marcos.avaliacao05;

import java.util.Calendar;
import java.util.Date;

class Pessoa {
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private final String nome;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        ajustaDataDeNascimento(diaNascimento, mesNascimento, anoNascimento);
        this.idade = 0;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        int idade = anoAtual - this.anoNascimento;
        if (mesAtual < this.mesNascimento || (mesAtual == this.mesNascimento && diaAtual < this.diaNascimento)) {
            idade--;
        }
        this.idade = idade;
    }

    public int informaIdade() {
        return this.idade;
    }

    public String informaNome() {
        return this.nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }
}

public class Principal {
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        Calendar calendarioAtual = Calendar.getInstance();
        calendarioAtual.setTime(new Date());

        int diaAtual = calendarioAtual.get(Calendar.DAY_OF_MONTH);
        int mesAtual = calendarioAtual.get(Calendar.MONTH) + 1;
        int anoAtual = calendarioAtual.get(Calendar.YEAR);

        einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println(einstein.informaNome() + " teria " + einstein.informaIdade() + " anos se estivesse vivo.");
        System.out.println(newton.informaNome() + " teria " + newton.informaIdade() + " anos se estivesse vivo.");
    }
}