package EjercicioArray;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int[] vector = {3, 2, 3, 4, 7, 2, 4};
		System.out.println("Introduzca el numero que quiereas buscar:");
		int num = teclado.nextInt();
	
		int resultado = buscarInt(vector, num);
		System.out.println(resultado);
	}
	
	public static int buscarInt(int[] vector, int num) {
		int resultado = 0;
		for(int i= 0; i<vector.length; i++) {
			if(vector[i] == num) {
				resultado = i;
				break;
			}
		}
		return resultado;
	}
}
