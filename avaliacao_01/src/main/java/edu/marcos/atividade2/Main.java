package edu.marcos.atividade2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = input.nextDouble();
        System.out.println("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = input.nextDouble();
        double quantidadeSalarios = salarioFuncionario / salarioMinimo;
        System.out.println("\nO funcionário ganha " + quantidadeSalarios + " salários mínimos.");

    }

}
