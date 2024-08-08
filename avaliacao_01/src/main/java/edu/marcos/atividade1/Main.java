package edu.marcos.atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nome = input.nextLine();
        System.out.println("Digite o preço do produto: ");
        double valorUnitario = input.nextDouble();
        double valorComDesconto = valorUnitario * 0.91;
        System.out.println("\nO produto " + nome + " custa R$ " + valorUnitario + ". Com desconto de 9% custa R$ " + valorComDesconto);

    }
}