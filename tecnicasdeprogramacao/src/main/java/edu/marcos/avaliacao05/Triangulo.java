package edu.marcos.avaliacao05;

import javax.swing.JOptionPane;

public class Triangulo {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public static Triangulo lerTriangulo() {
        try {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo:"));
            if (base <= 0) throw new IllegalArgumentException("Base e altura devem ser valores positivos.");
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo:"));
            if (altura <= 0) throw new IllegalArgumentException("Base e altura devem ser valores positivos.");
            return new Triangulo(base, altura);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor deve ser numérico.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Os valores devem ser positivos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        Triangulo triangulo = Triangulo.lerTriangulo();
        if (triangulo != null) {
            double area = triangulo.calcularArea();
            JOptionPane.showMessageDialog(null, String.format("A área do triângulo é: %.2f", area), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}