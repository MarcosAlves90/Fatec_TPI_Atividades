package edu.marcos.avaliacao01.atividade5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio da lata:");
        double raio = input.nextDouble();
        System.out.println("Digite a altura da lata:");
        double altura = input.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("\nO volume da lata é " + volume);

    }

}
