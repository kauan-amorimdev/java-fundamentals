package exercicios.logica;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um programa que leia três números e mostre o maior e o menor entre eles.

        // Seu código começa aqui

        System.out.println("informe a primeiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("informe o segundo: ");
        int numero2 = scanner.nextInt();

        System.out.println("informe o terceiro: ");
        int numero3 = scanner.nextInt();
        int maior = numero1;
        int menor = numero2;
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("os tres numeros sao iguais");
        }
        else{
            if (maior < menor) {
                menor = maior;
                maior = numero2;
            }
            if (maior < numero3 ) {
                maior = numero3;
            }
            if (menor > numero3) {
                menor = numero3;
            }
            System.out.println("maior :  " + maior + " menor: " + menor);
        }
        scanner.close();
    }
}
