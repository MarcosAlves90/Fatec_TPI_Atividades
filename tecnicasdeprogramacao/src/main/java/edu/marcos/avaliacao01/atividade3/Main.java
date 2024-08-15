package edu.marcos.avaliacao01.atividade3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        float valor1 = input.nextFloat();
        System.out.println("Digite o segundo valor:");
        float valor2 = input.nextFloat();
        float media = (valor1 + valor2) / 2;
        System.out.println("\nA média dos valores " + valor1 + " e " + valor2 + " é " + media);

    }

}
