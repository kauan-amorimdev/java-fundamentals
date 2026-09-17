package exercicios.logica;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um programa que leia um número inteiro positivo e calcule o fatorial dele.

        // Seu código começa aqui
        System.out.println("informe um numero");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("invalido");
        } else if (numero == 0) {
            System.out.println("o fatorial de 0 e 1");
        } else{
            calcularf(numero);
        }
        scanner.close();
    }
    public static void calcularf(int numero){
        int fatorial = numero;
        for (int i = numero - 1; i > 1 ; i--) {
            fatorial *= i;
        }
        System.out.printf("\no fatorial de %d eh %d", numero, fatorial);
    }
}
