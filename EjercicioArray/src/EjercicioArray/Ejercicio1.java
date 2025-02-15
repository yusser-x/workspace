package EjercicioArray;

public class Ejercicio1 {
	public static void main(String[] args) {
		int[] vector = new int[10];
		
		for(int i = 0; i<vector.length; i++) {
			vector[i] = 7;
		}
		
		for(int i = 0; i<vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
}
