package edu.marcos.avaliacao07.data;

import javax.swing.JOptionPane;

public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        setMes(mes);
        setDia(dia);
        setAno(ano);
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            JOptionPane.showMessageDialog(null, "Erro: Mês inválido. Deve ser entre 1 e 12.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            JOptionPane.showMessageDialog(null, "Erro: Dia inválido. Deve ser entre 1 e 31.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1) {
            JOptionPane.showMessageDialog(null, "Erro: Ano inválido. Deve ser maior que 0.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.ano = ano;
    }

    public void displayData() {
        JOptionPane.showMessageDialog(null, getDia() + "/" + getMes() + "/" + getAno(), "Data", JOptionPane.INFORMATION_MESSAGE);
    }
}