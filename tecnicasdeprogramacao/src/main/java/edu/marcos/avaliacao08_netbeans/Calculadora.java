package edu.marcos.avaliacao08_netbeans;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora {
    private JFrame janela;
    private JPanel painelPrincipal;
    private JLabel label1, lblr, lbl3;
    private JTextField t1, t2;

    public static void main(String[] args) {
        new Calculadora().montaTela();
    }

    private void montaTela() {
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotoes();
        preparaBotaoSair();
        mostraJanela();
    }

    private void preparaJanela() {
        janela = new JFrame("Calculadora");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void mostraJanela() {
        janela.pack();
        janela.setSize(400, 300);
        janela.setVisible(true);
    }

    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridBagLayout());
        janela.add(painelPrincipal);
    }

    private void preparaLabel() {
        label1 = new JLabel("Calculando a Soma de 2 números:");
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 0, 10, 0);
        painelPrincipal.add(label1, gbc);
    }

    private void preparaText() {
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        lblr = new JLabel("Resultado:");
        lbl3 = new JLabel(" ");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 1;
        painelPrincipal.add(t1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        painelPrincipal.add(t2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        painelPrincipal.add(lblr, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        painelPrincipal.add(lbl3, gbc);
    }

    private void mostrarResultado(double resultado) {
        String r = Double.toString(resultado);
        lbl3.setText(r);
    }

    private void preparaBotoes() {
        JButton botaoSoma = new JButton("Soma");
        botaoSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int soma = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                mostrarResultado(soma);
            }
        });

        JButton botaoDivisao = new JButton("Divisão");
        botaoDivisao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int divisao = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
                mostrarResultado(divisao);
            }
        });

        JButton botaoMultiplicacao = new JButton("Multiplicação");
        botaoMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicacao = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
                mostrarResultado(multiplicacao);
            }
        });

        JButton botaoSubtracao = new JButton("Subtração");
        botaoSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int subtracao = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                mostrarResultado(subtracao);
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 3;
        painelPrincipal.add(botaoSoma, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        painelPrincipal.add(botaoDivisao, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        painelPrincipal.add(botaoMultiplicacao, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        painelPrincipal.add(botaoSubtracao, gbc);
    }

    private void preparaBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(10, 0, 0, 0);
        painelPrincipal.add(botaoSair, gbc);
    }
}