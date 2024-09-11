package edu.marcos.avaliacao04;
import javax.swing.JOptionPane;

public class Programa04 {

    public static void main(String[] args) {

        try {
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura:\n(Exemplo: 1.75) "));
            int sexo = JOptionPane.showOptionDialog(
                    null,
                    "Selecione seu sexo:",
                    "Sexo",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    new String[]{"Masculino", "Feminino"},
                    "Masculino"
            );
            calcularPesoIdeal(altura, sexo);
        } catch (Exception e) {
            invocarErro();
        }

    }

    public static void calcularPesoIdeal(double altura, int sexo) {
        double pesoIdeal = (sexo == 0) ? (72.7 * altura) - 58 : (62.1 * altura) - 44.7;
        JOptionPane.showMessageDialog(null, String.format("Peso ideal: %.2f", pesoIdeal), "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}