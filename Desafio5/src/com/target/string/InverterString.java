package com.target.string;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra para inverter: ");
        String entrada = scanner.nextLine();

        char[] caracteres = entrada.toCharArray();
        int tamanho = caracteres.length;

        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }

        String invertida = new String(caracteres);
        System.out.println("Palavra invertida: " + invertida);
    }
}
