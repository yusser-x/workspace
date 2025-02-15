package EjercicioArray;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] vector = new int[20];
		
		for(int i = 0; i<vector.length; i++) {
			vector[i] = i * 5;
		}
		
		for ( int i = 0; i < vector.length; i++) {
		      System.out.println("elemento[" + i + "] = " + vector[i]);
		}

	}
}
