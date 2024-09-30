package edu.marcos.avaliacao06;

import javax.swing.*;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public void deposita(String valorString) {
        try {
            double valorDouble = Double.parseDouble(valorString);
            if (valorDouble <= 0) throw new IllegalArgumentException("Valor deve ser positivo.");
            saldo += valorDouble;
        } catch (NumberFormatException e) {
            invocarErro("O valor deve ser numérico.");
        } catch (IllegalArgumentException e) {
            invocarErro(e.getMessage());
        }
    }

    public void saca(String valorString) {
        try {
            double valorDouble = Double.parseDouble(valorString);
            if (valorDouble <= 0) throw new IllegalArgumentException("Valor deve ser positivo.");
            if (valorDouble > saldo) throw new IllegalArgumentException("Saldo insuficiente.");
            saldo -= valorDouble;
        } catch (NumberFormatException e) {
            invocarErro("O valor deve ser numérico.");
        } catch (IllegalArgumentException e) {
            invocarErro(e.getMessage());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double retornarValorComTaxa(String percentualString) {
        try {
            double percentualDouble = Double.parseDouble(percentualString);
            if (percentualDouble < 0) throw new IllegalArgumentException("Percentual deve ser positivo.");
            double taxa = percentualDouble / 100;
            return saldo - (saldo * taxa);
        }  catch (NumberFormatException e) {
            invocarErro("O valor deve ser numérico.");
        } catch (IllegalArgumentException e) {
            invocarErro(e.getMessage());
        }
        return 0;
    }

    public void invocarErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro:", JOptionPane.ERROR_MESSAGE);
        System.exit(1);
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(JOptionPane.showInputDialog("Digite o valor do depósito:"));
        conta.saca(JOptionPane.showInputDialog("Digite o valor do saque:"));
        double valorComTaxa = conta.retornarValorComTaxa(JOptionPane.showInputDialog("Digite a taxa percentual:"));
        JOptionPane.showMessageDialog(null, conta.getSaldo(), "Saldo na conta:", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, valorComTaxa, "Saldo com taxa:", JOptionPane.INFORMATION_MESSAGE);
    }

}
