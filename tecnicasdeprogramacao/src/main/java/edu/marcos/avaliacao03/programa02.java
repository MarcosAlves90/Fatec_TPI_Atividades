package edu.marcos.avaliacao03;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class programa02 {

//    Um programa que imprima até o “n” termo a sequência de Fibonacci. Série:
//            1,1,2,3,5,8,13,21.......
//    Por exemplo, imprimir até o 6º termo: 1, 1, 2, 3, 5, 8

    public static void main(String[] args) {
        try {
            int numeroTermos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de termos: "));
            int[] arrayDeValores = new int[numeroTermos];
            arrayDeValores[0] = arrayDeValores[1] = 1;
            for (int i = 2; i < numeroTermos; i++) {
                arrayDeValores[i] = arrayDeValores[i-1] + arrayDeValores[i-2];
            }
            JOptionPane.showMessageDialog(null, Arrays.toString(arrayDeValores), "Resultado: ", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NegativeArraySizeException e) {
            invocarErro();
        }

    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
