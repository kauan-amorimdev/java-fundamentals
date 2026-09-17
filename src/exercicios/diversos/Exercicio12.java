package exercicios.diversos;

import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Random random = new Random();

        // Faça um programa que gere um número aleatório entre 1 e 10 e peça para o usuário adivinhar.
        // O programa deve informar se o palpite foi maior, menor ou correto.

        // Seu código começa aqui

        int numero = random.nextInt(10) + 1;
        pedirn(numero);

    }
        public static void pedirn ( int numero){
            int valor = 0;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Informe um numero de 1 a 10:");
                valor = scanner.nextInt();
                if (valor < 1 || valor > 10) {
                    System.out.println("palpite invalido");
                } else {
                    if (valor == numero) {
                        System.out.println("palpite correto o numero era : " + numero);
                        break;
                    } else if (valor > numero) {
                        System.out.println("palpite foi maior");
                    } else {
                        System.out.println("palpite foi menor");
                    }
                }
            }
        }
    }
