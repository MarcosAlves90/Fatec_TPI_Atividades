package edu.marcos.avaliacao04;
import javax.swing.JOptionPane;

public class Programa05 {

    public static void main(String[] args) {
        try {
            int anoCarro = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano do carro: "));
            if (anoCarro < 0) throw new Exception("Ano_Invalido");
            double precoCarro = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do carro: "));
            if (precoCarro < 0) throw new Exception("Preco_Invalido");
            double imposto = calcularImposto(anoCarro, precoCarro);
            JOptionPane.showMessageDialog(null, String.format("Preço total do carro: %.2f\nImposto a ser pago: %.2f", precoCarro + imposto, imposto), "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            invocarErro();
        }
    }

    public static double calcularImposto(int anoCarro, double precoCarro) {
        return (anoCarro < 1990) ? precoCarro * 0.01 : precoCarro * 0.015;
    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
