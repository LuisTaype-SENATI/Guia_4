package com.senati.eti;

public class Caso1de4 {

	public static void main(String[] args) {
		String[] nombre = new String [4];
		
		nombre[0] = "Joe Castillo";
		nombre[1] = "Rosa Flores";
		nombre[2] = "Carlos Tello";
		nombre[3] = "Ericka Valiente";
		
		//Estructura repetitiva
		
		for(int x = 0; x < nombre.length; x++)
			System.out.println("Nombre " + (x + 1) + ": " + nombre[x]);
		

	}

}
