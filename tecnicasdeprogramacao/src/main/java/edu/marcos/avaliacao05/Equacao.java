package edu.marcos.avaliacao05;

import javax.swing.JOptionPane;

// TPI-5 Segundo Programa

public class Equacao {
    private final int a;
    private final int b;
    private final int c;
    
    public Equacao(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Equacao lerValores() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B:"));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor C:"));
            return new Equacao(a, b, c);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor deve ser numérico.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public Double[] calcularRaizes() {
        Double[] resultados = new Double[2];
        double delta = Math.pow(b, 2) - 4 * a * c;
        double raizDelta = Math.sqrt(delta);
        if (delta < 0) return resultados;
        double r1 = (-b + (raizDelta)) / (2 * a);
        resultados[0] = r1;
        if (delta == 0) return resultados;
        double r2 = (-b - (raizDelta)) / (2 * a);
        resultados[1] = r2;
        return resultados;
    }

    public static void main(String[] args) {
        Equacao equacao = Equacao.lerValores();
        assert equacao != null;
        Double[] resultados = equacao.calcularRaizes();
        String mensagem = (resultados[0] == null) ? "Não existem raízes reais!" : 
                (resultados[1] == null) ? String.format("As raízes R1 e R2 são: %f", resultados[0]) : 
                String.format("Raíz R1: %.2f%nRaíz R2: %f", resultados[0], resultados[1]);
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
