package EjercicioArray;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
	
		int[] vector = {4,3,1,4,2,5,8};
		
		int[] vector1 = {4,2,5};
		
		
		int resultado = buscarSecuenciaInt(vector, vector1);
		System.out.println("El índice donde empieza la ocurrencia es: " + resultado);
	}
	
	public static int buscarSecuenciaInt(int[] vector, int[] vector1) {
		int resultado = 0;
		for(int i=0; i<vector.length; i++) {
			if(vector[i] == vector1[0]) {
				for(int y=vector[i]; y<vector.length; y++) {
					if(vector[y] == vector1[y+i]) {
						resultado = vector[i];
					}
				}
			}
		}
		return resultado;
	}

}
