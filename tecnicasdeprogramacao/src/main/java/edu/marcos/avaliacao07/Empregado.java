package edu.marcos.avaliacao07;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    public Empregado(String nomeString, String sobrenomeString, String salarioM) {
        setNome(nomeString);
        setSobrenome(sobrenomeString);
        setSalarioMensal(salarioM);
    }
    
    public void setSalarioMensal(String salarioM) { 
        try {
            double salarioMDouble = Double.parseDouble(salarioM);
            this.salarioMensal = Math.max(salarioMDouble, 0);
        } catch (NumberFormatException e) {
            invocarErro("O salário deve conter apenas números.");
        }
    }
    
    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    public void setNome(String nomeClone) {
        if (verifyNullString(nomeClone)) throw new IllegalArgumentException("Nome não pode estar vazio.");
        if (verifyStringWithNumbers(nomeClone)) throw new IllegalArgumentException("Nome não pode conter números.");
        this.nome = nomeClone;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setSobrenome(String sobrenomeClone) {
        if (verifyNullString(sobrenomeClone)) throw new IllegalArgumentException("Sobrenome não pode estar vazio.");
        if (verifyStringWithNumbers(sobrenomeClone)) throw new IllegalArgumentException("Sobrenome não pode conter números.");
        this.sobrenome = sobrenomeClone;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    static boolean verifyNullString(String string) {
        return (string == null || string.isEmpty());
    }
    
    static boolean verifyStringWithNumbers(String string) {
        return Pattern.compile("[0-9]").matcher(string).find();
    }
    
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }
    
    public void aumento(double porcentagem) {
        this.salarioMensal *= (1 + (porcentagem / 100));
    }
    
    public void invocarErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
        System.exit(1);
    }

    public static void main(String[] args) {
        Empregado lyntter = new Empregado("lyntter", "pavao", "1560.23");
        Empregado gaviota = new Empregado("gaviota", "junior", "2748.29");
        
        String detalhes = String.format("Nome: %s %s\nSalário Anual: %.2f", lyntter.getNome(), lyntter.getSobrenome(), lyntter.getSalarioAnual());
        JOptionPane.showMessageDialog(null, detalhes, "Detalhes do Empregado", JOptionPane.INFORMATION_MESSAGE);
        
        detalhes = String.format("Nome: %s %s\nSalário Anual: %.2f", gaviota.getNome(), gaviota.getSobrenome(), gaviota.getSalarioAnual());
        JOptionPane.showMessageDialog(null, detalhes, "Detalhes do Empregado", JOptionPane.INFORMATION_MESSAGE);
        
        lyntter.aumento(10);
        gaviota.aumento(10);
        
        detalhes = String.format("Nome: %s %s\nSalário Anual: %.2f", lyntter.getNome(), lyntter.getSobrenome(), lyntter.getSalarioAnual());
        JOptionPane.showMessageDialog(null, detalhes, "Detalhes do Empregado com Aumento", JOptionPane.INFORMATION_MESSAGE);
        
        detalhes = String.format("Nome: %s %s\nSalário Anual: %.2f", gaviota.getNome(), gaviota.getSobrenome(), gaviota.getSalarioAnual());
        JOptionPane.showMessageDialog(null, detalhes, "Detalhes do Empregado com Aumento", JOptionPane.INFORMATION_MESSAGE);
    }
}
