package com.senati.eti;

import java.util.Scanner;

public class Caso2de4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[5];
		int num_mayor = 0, num_menor = 0, suma = 0;
		
		for (int x = 0; x <= numeros.length - 1; x++) {
			System.out.println("Ingrese número " + (x + 1) + ": ");
			numeros[x] = sc.nextInt();
			
			if(x == 0) {
				num_mayor = numeros[0];
				num_menor = numeros[0];
			}
			
			if (numeros[x] > num_mayor) num_mayor = numeros[x];
			
			if (numeros[x] < num_menor) num_menor = numeros[x];
			
			suma += numeros[x];
		}
		System.out.println("\n R E S U L T A D O S " );
		System.out.println("Número mayor.....: " + num_mayor);
		System.out.println("Numero menor.....: " + num_menor);
		System.out.println("Sumatoria........: " + suma);

	}

}
