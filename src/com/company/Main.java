package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Escreva um programa que lê uma palavra e escreve de volta com os caracteres ímpares em maiúsculo.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scan.nextLine();

        char[] caracteresPalavra = palavra.toCharArray();

        String palavraImpar = "";

        for(int i=0; i < caracteresPalavra.length; i++){
            if (i%2 == 0 ){
                palavraImpar += Character.toUpperCase(caracteresPalavra[i]);
            }
        };

        System.out.println(palavraImpar);
    }
}
