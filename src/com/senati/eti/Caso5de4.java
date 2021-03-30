package com.senati.eti;
import java.util.Scanner;

public class Caso5de4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Recomendacion al hacer un arreglo o array Usar arreglo arrCodigo y
		// variable codigo
		
		String[] arrCodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"Joe Castillo", "Rosa Flores", "Ricardo Montes","Teresa"};
		int[] arrNota = {15, 8, 17, 11};
		
		System.out.println("BUSQUEDA DE DATOS");
		System.out.println("- - - - - - - - -");
		System.out.println("Código a buscar: ");
		String codigo = sc.nextLine(); //A-789
		
		
		// posicion  = 2
		
		int pos = -1;
		
		for (int x = 0; x <= arrCodigo.length - 1; x++) {
			if (codigo.equals(arrCodigo[x])) {
				pos = x;
				break;
			}
		}
		
		if (pos == -1) {
			System.out.println("- - - - - - - - -");
			System.out.println("Codigo no encontrado");
			System.out.println("- - - - - - - - -");
			
		}
		else {
			System.out.println("- - - - - - - - -");
			System.out.println("Codigo encontrado");
			System.out.println("- - - - - - - - -");
			System.out.println("\nCódigo........: " + arrCodigo[pos]);
			System.out.println("Nombre........: " + arrNombre[pos]);
			System.out.println("Nota........: " + arrNota[pos]);
			
			
		}

	}

}
