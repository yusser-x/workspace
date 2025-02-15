package EjercicioArray;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del vector:");
		int tamaño = teclado.nextInt();
		
		int[] vector = new int[tamaño];
		for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce el valor del vector para la posición " + i + ": ");
            vector[i] = teclado.nextInt();
        }
		boolean resultado = yaOrdenadoInt( vector);
		System.out.println("El resultado de la ordenacion de tu vector es: " + resultado);
		
	}
	
	public static boolean yaOrdenadoInt(int[] vector) {
		boolean resultado = false;
		for (int i = 1; i < vector.length; i++) {
            if (vector[i] > vector[i - 1]) {
                resultado = true;
            }else {
            	resultado = false;
            	break;
            }   
		}
		return resultado;
	}
}
