package edu.marcos.avaliacao03;
import javax.swing.JOptionPane;

public class programa03 {

//    Um programa capaz de imprimir todos os números primos em um intervalo de
//    números informado pelo usuário;

    public static void main(String[] args) {

        try {
            int inicioIntervalo = Integer.parseInt(JOptionPane.showInputDialog("Digite o início do intervalo: "));
            if (inicioIntervalo < 1) {
                throw new Exception("Valor_negativo");
            }
            int fimIntervalo = Integer.parseInt(JOptionPane.showInputDialog("Digite o fim do intervalo: "));
            if (fimIntervalo < 1) {
                throw new Exception("Valor_negativo");
            }
            if (inicioIntervalo == fimIntervalo) {
                throw new Exception("Valores_iguais");
            }
            StringBuilder numbersList = new StringBuilder();
            for (int i = inicioIntervalo; i <= fimIntervalo; i++) {
                if (verificarNumeroPrimo(i)) {
                    numbersList.append(" ").append(i);
                }
            }
            JOptionPane.showMessageDialog(null, numbersList, "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            invocarErro();
        }
    }

    public static boolean verificarNumeroPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
