package edu.marcos.avaliacao08;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Teclado {
    private JButton limparButton;
    private JButton button0, button9, button8, button7, button6,
            button5, button4, button3, button2, button1, buttonAst, buttonHash;
    private JTextField textField1;
    private JPanel mainPanel;

    public Teclado() {

        limparButton.setText("Limpar");
        button0.setText("0");
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        button4.setText("4");
        button5.setText("5");
        button6.setText("6");
        button7.setText("7");
        button8.setText("8");
        button9.setText("9");
        buttonAst.setText("*");
        buttonHash.setText("#");

        ActionListener buttonListener = e -> {
            JButton source = (JButton) e.getSource();
            textField1.setText(textField1.getText() + source.getText());
        };

        for (JButton button : new JButton[]{button0, button1, button2, button3, button4,
                button5, button6, button7, button8, button9, buttonAst, buttonHash}) {
            button.addActionListener(buttonListener);
        }

        limparButton.addActionListener(_ -> textField1.setText(""));

        for (JButton button : new JButton[]{button0, button1, button2, button3, button4,
                button5, button6, button7, button8, button9, limparButton}) {
            button.setMnemonic(button.getText().charAt(0));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Teclado");
        frame.setContentPane(new Teclado().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}