package EjercicioArray;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del primer vector:");
		int tamaño = teclado.nextInt();
		System.out.println("Introduzca el tamaño del segundo vector:");
		int tamaño1 = teclado.nextInt();
		
		int[] vector = new int[tamaño];
		int[] vector1 = new int[tamaño1];
		
		for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce el valor del primer vector para la posición " + i + ": ");
            vector[i] = teclado.nextInt();
        }
		for (int i = 0; i < vector1.length; i++) {
            System.out.print("Introduce el valor del segundo vector para la posición " + i + ": ");
            vector1[i] = teclado.nextInt();
        }
		
		boolean resultado = vectoresIntIguales(vector, vector1);
		System.out.println("El resultado es: " + resultado);
		
	}
	
	public static boolean  vectoresIntIguales(int[] vector, int[]vector1) {
		boolean resultado = false;
		
		if(vector.length == vector1.length) {
			for(int i=0; i<vector.length; i++) {
				if(vector[i] == vector1[i]) {
					resultado = true;
				}else {
					resultado = false;
				}
			}
		}else {
			resultado = false;
		}
		return resultado;
	}
}
