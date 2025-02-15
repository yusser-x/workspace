package EjercicioArray;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del vector");
		int tamaño = teclado.nextInt(); 
		int[] vector = new int[tamaño];
		for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce el valor del vector para la posición " + i + ": ");
            vector[i] = teclado.nextInt();
        }
		
		System.out.println("Introduzca el numero del que quieras saber la frecuencia: ");
		int num = teclado.nextInt();
		
		int resultado = frecuenciaNumero(vector, num);
		System.out.println("La frecuencia de " + num + " es: " + resultado);
	}

	public static int frecuenciaNumero(int[] vector, int num) {
		int frecuencia = 0;
		for(int i = 0; i<vector.length; i++) {
			if(vector[i] == num) {
				frecuencia++;
			}
		}
		return frecuencia;
	}
}
