package exercicios.arrays;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int qnumeros = 10;

        // Faça um programa que leia 10 números inteiros em um vetor e depois leia um valor para buscar.
        // Mostre se o valor foi encontrado e em qual posição.

        // Seu código começa aqui

        int[] numeros = new int[qnumeros];
        for (int i = 0; i <qnumeros; i++) {
            System.out.printf("\ninforme o %d numero: ", i + 1);
            numeros[i] = scanner.nextInt();
        }
        System.out.println("\nInforme o valor que deseja buscar: ");
        int valorb = scanner.nextInt();
        buscarn(numeros,valorb);
        scanner.close();
    }
    public static void buscarn(int[] numeros , int valorb){
       int posicao = 0;
       boolean pertence = false;
        for (int i = 0; i < numeros.length ; i++) {
            if (valorb == numeros[i] ) {
                posicao = i;
                pertence = true;
                break;
            }
        }
        if (pertence) {
            System.out.println("valor encontrado na posicao: " + posicao);
        }
        else {
            System.out.println("valor nao encontrado");
        }
    }
}
