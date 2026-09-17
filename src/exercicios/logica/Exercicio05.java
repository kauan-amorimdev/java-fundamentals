package exercicios.logica;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um programa que leia um número inteiro e mostre a tabuada desse número de 1 a 10.

        // Seu código começa aqui
        System.out.println("infome um numero: ");
        int numero = scanner.nextInt();
        if (numero == 0) {
            System.out.println("informe um valor valido na proxima");
        }
        else {
            tabuadasoma(numero);
            System.out.println("\n");
            tabuadasub(numero);
            System.out.println("\n");
            tabuadamulti(numero);
            System.out.println("\n");
            tabuadadiv(numero);
            System.out.println("\n");
            scanner.close();
        }
    }
    public static void tabuadasoma(int numero){
        final int tamanhotabuada = 10;
        for (int i = 0; i <= tamanhotabuada  ; i++) {
            System.out.printf("\n%d + %d == %d", numero, i , numero + i);
        }
    }

    public static void tabuadasub(int numero){
        final int tamanhotabuada = 10;
        for (int i = 0; i <= tamanhotabuada  ; i++) {
            System.out.printf("\n%d - %d == %d", numero, i , numero - i);
        }
    }

    public static void tabuadamulti(int numero){
        final int tamanhotabuada = 10;
        for (int i = 0; i <= tamanhotabuada  ; i++) {
            System.out.printf("\n%d * %d == %d", numero, i , numero * i);
        }
    }

    public static void tabuadadiv(int numero){
        final int tamanhotabuada = 10;
        for (int i = 1; i <= tamanhotabuada  ; i++) {
            System.out.printf("\n%d / %d == %.2f", numero, i , (double)numero / i);
        }
    }
}
