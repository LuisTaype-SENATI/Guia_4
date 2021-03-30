package com.senati.eti;

import java.util.ArrayList;


import java.util.Scanner;

public class Caso4de4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		ArrayList <Integer> ga = new ArrayList <Integer>();
		int num_par = 0, num_impares = 0;
		float promedio = 0.0f,suma = 0.0f;
		
		
		System.out.println("lECTURA DE NUMEROS");
		System.out.println("_ _ _ _ _ _ _ _ _ _");
		
		for (int x = 0; x < 5; x++) {
			System.out.println("Ingrese número " + (x + 1) + ": ");
			float dentro = sc.nextFloat();
			
			ga.add((int)dentro);
		
		}		
		for (int x = 0; x < 5; x++) {
			if(ga.get(x) % 2 == 0) {
				num_par++;
				
				
			}
			else if (ga.get(x) % 2 != 0) {
				num_impares++;
			}
			suma += ga.get(x);
			
		}
		System.out.println("Cantidades de numero pares : " + num_par);
		
		System.out.println("Cantidad de numeros impares : " + num_impares);
		System.out.println("Promedio....................: " + (suma/5.0f));
		
		
		
		
		

		

	}

}
