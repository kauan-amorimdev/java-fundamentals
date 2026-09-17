package exercicios.matrizes;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TMATRIZ = 3;
        // Faça um programa que leia uma matriz 3x3 e mostre a soma de todos os elementos.

        // Seu código começa aqui

        int[][] matriz = new int[TMATRIZ][TMATRIZ];
        for (int i = 0; i < TMATRIZ ; i++) {
            for (int j = 0; j < TMATRIZ ; j++) {
                System.out.printf("\nInforme o numero da %d linha %d coluna", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        somaM(matriz);
    }
    public static void somaM(int[][] matriz){
        int soma = 0;
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                soma += matriz[i][j];
                System.out.print(" " +matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("a soma e: " + soma);
    }

}
