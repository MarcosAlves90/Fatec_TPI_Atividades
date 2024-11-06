package edu.marcos.avaliacao08_intellij;

import javax.swing.*;

public class Vendas {
    private JPanel mainPanel;
    private JLabel title1, title2, title3, title4;
    private JTextField textField1, textField2, textField3, textField4;
    private JButton calcularButton;
    private JButton limparButton;

    public Vendas() {
        title1.setText("Valor da Venda:");
        title2.setText("ICMS (18%):");
        title3.setText("IPI (5%):");
        title4.setText("Valor Total:");

        calcularButton.setText("Calcular");
        limparButton.setText("Limpar");

        limparButton.addActionListener(_ -> {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
        });

        calcularButton.addActionListener(_ -> {
            try {
                double valorVenda = Double.parseDouble(textField1.getText());
                double icms = valorVenda * 0.18;
                double ipi = valorVenda * 0.05;
                double valorTotal = valorVenda + icms + ipi;
                textField2.setText(String.format("%.2f", icms));
                textField3.setText(String.format("%.2f", ipi));
                textField4.setText(String.format("%.2f", valorTotal));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Valor da Venda inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vendas");
        frame.setContentPane(new Vendas().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
