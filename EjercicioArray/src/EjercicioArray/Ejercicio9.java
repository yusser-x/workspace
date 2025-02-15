package EjercicioArray;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del vector:");
		int tamaño = teclado.nextInt();
		
		int[] vector = new int[tamaño];
		for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce el valor del vector para la posición " + i + ": ");
            vector[i] = teclado.nextInt();
        }
		
		int resultado = masFrecuenteInt(vector);
		System.out.println("El numero mas frecuente es: " + resultado);
	}
	
	public static int masFrecuenteInt(int[] vector) {
		
		int maxcontador = 0;
		int resultado = vector[0];
		
		for(int i=0; i<vector.length; i++) {
			int contador = 0;
			for(int y = 0; y<vector.length; y++) {
				if(vector[i] == vector[y]) {
					contador++;
				}
			}
			if(contador > maxcontador) {
				resultado = vector[i];
				maxcontador = contador;
			}
		}
		return resultado;
	}
}
