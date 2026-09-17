package exercicios.logica;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um programa que leia três notas e mostre a média aritmética.

        // Seu código começa aqui

        System.out.println("informe a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("informe a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("informe a terceria nota: ");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("\na media e %.2f " , media);
        scanner.close();
    }
}
