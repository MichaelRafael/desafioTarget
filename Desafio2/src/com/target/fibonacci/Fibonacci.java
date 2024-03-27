package com.target.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1, c;
        boolean pertence = false;

        System.out.println("Sequência de Fibonacci até " + numero + ":");
        while (a <= numero) {
            System.out.print(a + " ");
            if (a == numero) {
                pertence = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }

        if (pertence) {
            System.out.println("\nO número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}


