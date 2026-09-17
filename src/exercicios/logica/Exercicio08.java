package exercicios.logica;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um programa que leia um número inteiro e informe se ele é primo.

        // Seu código começa aqui
        System.out.println("informe um numero: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("invalido");
        }
        else {
            scanner.close();
            verificarprimno(numero);
        }
    }
    public static void verificarprimno(int numero){
        int quantidaded = 0;
        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0) {
                quantidaded++;
            }
        }
        if (quantidaded == 2) {
            System.out.println("eh primo");
        }
        else{
            System.out.println("nao eh prinmo");
        }
    }
}
