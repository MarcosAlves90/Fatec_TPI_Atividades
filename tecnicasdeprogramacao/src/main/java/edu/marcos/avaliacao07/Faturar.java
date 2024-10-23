package edu.marcos.avaliacao07;

import javax.swing.JOptionPane;

public class Faturar {
    private final int numeroItem;
    private final String descricao;
    private int quantidade;
    private double precoUnitario;

    public Faturar(int numeroItem, String descricao, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public int getNumeroItem() { return numeroItem; }
    public String getDescricao() { return descricao; }
    public int getQuantidade() { return quantidade; }
    public double getPrecoUnitario() { return precoUnitario; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade > 0 ? quantidade : 0; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0; }

    public double getFaturarTotal() { return quantidade * precoUnitario; }

    public static void main(String[] args) {
        int numeroItem, quantidade = 0;
        String descricao;
        double precoUnitario = 0.0;

        try {
            numeroItem = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do item:"));
            descricao = JOptionPane.showInputDialog("Digite a descrição do item:");
            if (descricao == null || descricao.trim().isEmpty()) throw new IllegalArgumentException();
            quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada:"));
            precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário:"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Deve ser um número inteiro ou válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: A descrição não pode ser vazia.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Faturar fatura = new Faturar(numeroItem, descricao, quantidade, precoUnitario);
        String resultado = String.format("Número do Item: %d\nDescrição: %s\nQuantidade: %d\nPreço Unitário: %.2f\nTotal da Fatura: %.2f",
                                          fatura.getNumeroItem(), fatura.getDescricao(), fatura.getQuantidade(), fatura.getPrecoUnitario(), fatura.getFaturarTotal());
        JOptionPane.showMessageDialog(null, resultado, "Detalhes da Fatura", JOptionPane.INFORMATION_MESSAGE);
    }
}
