package edu.marcos.atividade4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = input.nextDouble();
        // Fórmula modificada, pois na atividade estava incorreta
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("\nA temperatura de " + celsius + " graus Celsius é equivalente a " + fahrenheit + " graus Fahrenheit.");

    }

}
