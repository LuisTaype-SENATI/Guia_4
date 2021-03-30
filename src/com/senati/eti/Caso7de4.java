package com.senati.eti;

import java.util.Scanner;;

public class Caso7de4 {

	public static void main(String[] args) {
		Scanner hola=new Scanner(System.in);
		int [][] matrix = new int[3][4];

		float suma=0;
		float promedio;
		float n_menor=0;
		float num_mayor=0;
		
		for(int i=0;i<matrix.length;i++) {
			System.out.println("\nDatos de la fila " + (i + 1));
			System.out.println("----------------------");
			for(int j=0;j<4;j++) {		
				System.out.print("Número " + (j + 1) + ": ");
				matrix[i][j] =hola.nextInt();
				suma+=matrix[i][j];
				if(i == 0 && j == 0) 
					num_mayor = matrix[0][0];
				if (matrix[i][j] > num_mayor)
					num_mayor = matrix[i][j];
				
				if(i == 0 && j == 0) 
					n_menor = matrix[0][0];
				if (matrix[i][j] < n_menor)
					n_menor = matrix[i][j];
			}
		}
		promedio=suma/12;
		

		System.out.println(" RESULTADOS  ");
		System.out.println("Número mayor: " + num_mayor);
		System.out.println("El numero menor: "+n_menor);
		System.out.println("Suma: "+suma);
		System.out.println("Promedio: "+promedio);

	}
}
