package EjercicioArray;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca el tamaño del vector: ");
		int tamaño = teclado.nextInt();
		
		int[] vector = new int[tamaño];
		for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce el valor del vector para la posición " + i + ": ");
            vector[i] = teclado.nextInt();
        }
		
		System.out.println("Introduzca el numero a buscar: ");
		int buscado= teclado.nextInt();
		
		int inf = vector[0];
		int sup = vector.length -1;
		
		int resultado = buscarBinariaRec(vector, inf, sup, buscado); 
		System.out.println("El numero es: " + resultado);
	}

	public static int buscarBinariaRec(int[] vector,int inf, int sup, int buscado) {
		
		int med = (inf+ sup )/2;
		
		if(inf > sup) {
			return -1;
		}else  if(buscado == vector[med]) {
			return med;
		}else if(buscado < vector[med]) {
			return buscarBinariaRec(vector, inf, med - 1, buscado);
		}else {
			return buscarBinariaRec(vector, med+1, sup, buscado);
		}
	}
}
