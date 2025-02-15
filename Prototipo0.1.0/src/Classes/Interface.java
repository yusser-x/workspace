package Classes;

import java.util.Scanner;

public class Interface {
	public static Scanner keyboard = new Scanner(System.in);
	
	
	public static int getInt() {
		int number = -1;
		String value = keyboard.nextLine();
		try {
			number = Integer.parseInt(value);
		} catch (Exception e) {
			System.err.println("El valor introducido no es un numero");
		}
		return number;
	}

	public static int getInt(String text) {
		System.out.print(text);
		return getInt();
	}

	public static String getString() {
		String value = keyboard.nextLine().trim();
		return value;
	}

		public static String getString(String text) {
		System.out.print(text);
		String value = keyboard.nextLine().trim();
		return value;
	}

	public static void toContinue() {
		System.out.print("\nPulse 'enter' para continuar");
		try {
			System.in.read();
		} catch (Exception e) {
		}
	}
}
