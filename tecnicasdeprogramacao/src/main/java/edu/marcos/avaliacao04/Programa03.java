package edu.marcos.avaliacao04;
import javax.swing.JOptionPane;

public class Programa03 {

    public static void main(String[] args) {

        try {
            double valorX = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor X: "));
            double valorY = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor Y: "));
            double valorZ = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor Z: "));
            if (verificarTriangulo(valorX, valorY, valorZ)) {
                JOptionPane.showMessageDialog(null,
                        String.format("Triângulo %s", verificarTipoTriangulo(valorX, valorY, valorZ)),
                        "Resultado: ",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Não é um triângulo", "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            invocarErro();
        }

    }

    public static boolean verificarTriangulo(double x, double y, double z) {
        return (x < y + z) && (y < x + z) && (z < x + y);
    }

    public static String verificarTipoTriangulo(double x, double y, double z) {
        if (x == y && y == z) {
            return "Equilátero";
        } else if (x == y || x == z || y == z) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
