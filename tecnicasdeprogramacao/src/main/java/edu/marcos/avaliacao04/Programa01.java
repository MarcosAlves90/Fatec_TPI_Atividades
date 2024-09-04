package edu.marcos.avaliacao04;
import javax.swing.JOptionPane;

public class Programa01 {

    public static void main(String[] args) {
        while (true) {
            try {
                String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
                if (nomeProduto == null) break;
                double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
                int quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto: "));
                double valorTotal = verificarPreco(quantidadeProduto, precoProduto);

                int option = JOptionPane.showOptionDialog(
                        null,
                        String.format("Valor do produto [%s]: %.2f", nomeProduto, valorTotal),
                        "Resultado: ",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        new String[]{"Próximo", "Sair"},
                        "Próximo"
                );

                if (option != JOptionPane.YES_OPTION) break;
            } catch (Exception e) {
                invocarErro();
            }
        }
    }

    public static double verificarPreco(int quantidadeProduto, double precoProduto) {
        return quantidadeProduto <= 10 ?
                (precoProduto) : quantidadeProduto <= 20 ?
                (precoProduto * 0.9) : quantidadeProduto <= 50  ?
                (precoProduto * 0.8) : (precoProduto * 0.75);
    }

    public static void invocarErro() {
        JOptionPane.showMessageDialog(null, "Valor inválido", "Erro: ", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }
}