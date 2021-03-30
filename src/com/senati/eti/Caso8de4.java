package com.senati.eti;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso8de4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrNombre = new ArrayList<String>();
		ArrayList<Integer> arrEdad = new ArrayList<Integer>();
		
		String rp = "S", nombre = "";
		int num_reg = 0, edad = 0;
		
		while(rp.equalsIgnoreCase("S")) {
			num_reg++;
			
			System.out.println("\nREGISTRO" + num_reg);
			System.out.println("-----------");
			
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad: ");
			edad = sc.nextInt();
			
			arrNombre.add(nombre);
			arrEdad.add(edad);
			
			
			sc.nextLine();
			
			rp = "";
			
			while(rp.equalsIgnoreCase("S") == false && rp.equalsIgnoreCase("N") == false) {
				System.out.print("¿Continuar con otro registro <S/N>? ");
				rp = sc.nextLine();
				
				if(rp.equalsIgnoreCase("S") == false && rp.equalsIgnoreCase("N") == false) {
					System.out.print("Solo escriba <S> o <N>");
				}
				
			}
			
		}
		
		// Impresión de los datos registrados
		System.out.println("LISTA DE DATOS REGISTRADOS");
		System.out.println("--------------------------");
		
		System.out.println("Nombre \tEdad \t\tEstado");
		System.out.println("*****************************");
		
		for (int i = 0; i < arrNombre.size(); i++)
			System.out.println(arrNombre.get(i) + "\t\t" + 
		                       arrEdad.get(i) + "años\t\t" + 
					           VerEstado(arrEdad.get(i)));

	}
	
	// Métodos (funciones) que devuelven un valor
	
	public static String VerEstado(int edad) {
		String estado = "Menor de edad";
		
		if(edad >= 18) estado ="Mayor de edad";
		
		return estado;
	}
	
	public static String VerMensaje(int edad) {
		String etapa = "";
		if(edad <= 10)  etapa = "Niñez";
		else if(edad <= 17) etapa = "Adolescencia";
		else if(edad <= 24) etapa = "Juventud";
		else if(edad <= 59) etapa = "Adulto";
		else if(edad >= 60) etapa = "Adulto mayor";

		
		return etapa;
	}

}
