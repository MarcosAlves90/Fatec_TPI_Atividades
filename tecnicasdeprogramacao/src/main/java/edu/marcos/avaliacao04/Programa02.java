package edu.marcos.avaliacao04;
import javax.swing.JOptionPane;

public class Programa02 {

    public static void main(String[] args) {

        try {
            int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da conta: "));
            double saldoConta = Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo da conta: "));
            double debitoConta = Double.parseDouble(JOptionPane.showInputDialog("Insira o débito da conta: "));
            double creditoConta = Double.parseDouble(JOptionPane.showInputDialog("Insira o crédito da conta: "));
            double saldoAtual = calcularSaldoAtual(saldoConta, debitoConta, creditoConta);
            JOptionPane.showMessageDialog(null,
                    String.format("R$ %.2f\n%s", saldoAtual, verificarSaldoPositivo(saldoAtual) ? "Saldo Positivo." : "Saldo Negativo."),
                    "Saldo atual: ",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            invocarErro();
        }

    }

    public static Double calcularSaldoAtual(double saldo, double debito, double credito) {
        return saldo - debito + credito;
    }

    public static Boolean verificarSaldoPositivo(double saldoAtual) {
        return (saldoAtual >= 0);
    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }

}
