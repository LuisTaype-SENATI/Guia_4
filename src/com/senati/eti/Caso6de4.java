package com.senati.eti;

public class Caso6de4 {

	public static void main(String[] args) {
		String[][] datos = {{"Joe Castillo", "Rosa Flores", "Ricardo Tello"},
				            {"Callao", "Comas", "Puente Piedra"}};
		
		//datos.length      - > Cantidad de filas de la matriz ... (2)
		//datos[0].length     > Cantidad de elementos del arreglo de la 1era.fila ..(3)
		
		//Impresioón de valores de la matriz por filas
		System.out.println("Impresion pòr filas");
		
		for(int f =0; f < datos.length; f++) {
			for (int c =0; c < datos[0].length; c++)
	          	System.out.print(String.format("%-20s",datos[f][c]) + "\t"); 
			
			System.out.println();
			
		}
		
		System.out.println();
		
		//Impresioón de valores de la matriz por filas
		System.out.println("Impresion pòr columnas");
				
		for(int c =0; c < datos[0].length; c++) {
			for (int f =0; f < datos.length; f++)
			    System.out.print(String.format("%-20s",datos[f][c]) + "\t"); 
					
		    System.out.println();
					
				}
		
		

	}

}
