package exercicios.logica;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Faça um programa que leia um número inteiro e informe se ele é par, ímpar, positivo ou negativo.

        // Seu código começa aqui
        System.out.println("informe um numero");
        int numero = scanner.nextInt();
        if (numero == 0) {
            System.out.println("o numero e neutro");
        }
        else {
            verificarpar(numero);
            scanner.close();
        }
    }
    public static void verificarpar(int numero){
        boolean ehpar = false;
        boolean ehpositivo = false;
        if (numero % 2 == 0) {
            ehpar = true;
        }
        if (numero > 0) {
            ehpositivo = true;
        }
        mostrar(ehpar, ehpositivo);
    }
    
    public static void mostrar(boolean ehpar, boolean ehpostivo){
        if (ehpar) {
            if (ehpostivo == true) {
                System.out.println("E par e positivo");
            }
            else {
                System.out.println("E par e negativo");
            }
        }
        else{
            if (ehpostivo == true) {
                System.out.println("E impar e positivo");
            }
            else {
                System.out.println("E impar e negativo");
            }
        }
    }
}
