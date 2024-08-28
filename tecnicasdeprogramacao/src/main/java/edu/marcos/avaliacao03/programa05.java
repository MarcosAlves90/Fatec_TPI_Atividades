package edu.marcos.avaliacao03;
import javax.swing.JOptionPane;

public class programa05 {

//    Criar um programa que leia um número que será o limite superior de um intervalo e
//    o incremento. Exibir todos os números naturais no intervalo de 0 até esse número.
//    Suponha que os dois números lidos são maiores que zero

    public static void main(String[] args) {
        try {
            int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog("Digite o limite superior do intervalo: "));
            if (limiteSuperior < 1) {
                throw new Exception("Valor_negativo");
            }
            int incremento = Integer.parseInt(JOptionPane.showInputDialog("Digite o incremento: "));
            if (incremento < 1) {
                throw new Exception("Valor_negativo");
            }
            StringBuilder numbersList = new StringBuilder();
            for (int i = 0; i <= limiteSuperior; i += incremento) {
                numbersList.append(" ").append(i);
            }
            JOptionPane.showMessageDialog(null, numbersList, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            invocarErro();
        }
    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
