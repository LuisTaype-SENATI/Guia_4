package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3de4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer [] numeros = new Integer[5];
		
		System.out.println("lECTURA DE NUMEROS");
		
		for (int x = 0; x <= numeros.length - 1; x++) {
			System.out.println("Ingrese número " + (x + 1) + ": ");
			numeros[x] = sc.nextInt();
		}
		
		//Ordenar de forma ascedente
		
		Arrays.sort(numeros);
		
		System.out.println("NUMEROS ORDENADOS DE FORMA ASCENDENTE");
		System.out.println("- - - - - - - - - - - - - - - - - - - ");
		for(int x = 0; x < numeros.length; x++)
			System.out.println("Números " + (x + 1) + ": " + numeros[x]);
		
		//Ordenar de forma descendente
        Arrays.sort(numeros, Collections.reverseOrder());
		
		System.out.println("\nNUMEROS ORDENADOS DE FORMA DESCENDENTE");
		System.out.println("- - - - - - - - - - - - - - - - - - - ");
		for(int x = 0; x < numeros.length; x++)
			System.out.println("Números " + (x + 1) + ": " + numeros[x]);
		
			
	
		
		

	}

}
