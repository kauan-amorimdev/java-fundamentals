package exercicios.arrays;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int qnumeros = 5;

        // Faça um programa que leia 5 números inteiros em um vetor e mostre o vetor em ordem crescente.

        // Seu código começa aqui
        int[] numeros = new int[qnumeros];
        for (int i = 0; i < qnumeros; i++) {
            System.out.printf("\ninforme o %d numero: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        scanner.close();
        ordernarv(numeros);
        mostrar(numeros);
    }
        public static void ordernarv(int[] numeros){
            int intermedio;
            for (int i = 0; i < numeros.length ; i++) {
                for (int j = 0; j < numeros.length ; j++) {
                    if (numeros[i] > numeros[j]) {
                        intermedio = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = intermedio;
                    }
                }
            }

        }
        public static void mostrar(int[] numeros){
            for (int i = 1; i <= numeros.length ; i++) {
                System.out.printf("\n%d" , numeros[numeros.length - i]);
            }
        }
    }

