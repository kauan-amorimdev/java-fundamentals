package exercicios.logica;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um programa que leia um número inteiro positivo e calcule a soma de 1 até esse número.

        // Seu código começa aqui
        System.out.println("informe o numero");
        int numero = scanner.nextInt();
        if (numero < 1) {
            System.out.println("numero invalido");
        }
        else {
            somaaten(numero);
            scanner.close();
        }
    }
    public static void somaaten(int numero){
        int soma = 0;
        for (int i = 1; i <= numero ; i++) {
            soma += i;
        }
        System.out.println("A soma e: " + soma);
    }
}
