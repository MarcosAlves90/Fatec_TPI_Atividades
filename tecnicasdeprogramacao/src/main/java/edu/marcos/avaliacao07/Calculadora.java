package edu.marcos.avaliacao07;

import javax.swing.JOptionPane;

public class Calculadora {
    private final double numero1;
    private final double numero2;
    private final char operacao;

    public Calculadora(double numero1, double numero2, char operacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
    }

    public double calcular() {
        return switch (operacao) {
            case '+' -> numero1 + numero2;
            case '-' -> numero1 - numero2;
            case '*' -> numero1 * numero2;
            case '/' -> {
                if (numero2 == 0) {
                    throw new ArithmeticException("Erro: Divisão por zero.");
                }
                yield numero1 / numero2;
            }
            default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
        };
    }

    public void imprimirResultado() {
        try {
            double resultado = calcular();
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } catch (ArithmeticException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        try {
            double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            char operacao = JOptionPane.showInputDialog("Digite a operação (+, -, *, /):").charAt(0);
            Calculadora calc = new Calculadora(numero1, numero2, operacao);
            calc.imprimirResultado();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}