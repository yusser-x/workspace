package EjercicioArray;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Introduce el tamaño del vector: ");
		int tamaño = teclado.nextInt();
		
		int[] vector = new int[tamaño];
		for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce el valor del vector para la posición " + i + ": ");
            vector[i] = teclado.nextInt();
        }

		int resultado = contarIntConsecutivos(vector);
		System.out.println("El numero de numeros en orden en el vector es de: " + resultado);
	
	}

	public static int contarIntConsecutivos(int[] vector) {
		int contador = 0;
		for(int i= 1; i<vector.length; i++) {
			int total = vector[i] - vector[i-1];
			if(total == 1 ) {
				contador++;
			}
		}
		return contador;
	}
}
