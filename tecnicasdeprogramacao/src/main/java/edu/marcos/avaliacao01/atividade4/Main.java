package edu.marcos.avaliacao01.atividade4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = input.nextDouble();
        double fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("\nA temperatura de " + celsius + " graus Celsius é equivalente a " + fahrenheit + " graus Fahrenheit.");

    }

}
