package exercicios.logica;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um programa que leia dois números inteiros e mostre a soma deles.

        // Seu código começa aqui
        System.out.println("Informe o primeiro numero : ");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma e: " + soma);
        scanner.close();
    }
}
