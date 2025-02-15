package CuentaBancaria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cuenta cuenta1 = new Cuenta(10002, 123456789, 1200.50);
		
		
		int eleccion;
		do {
			eleccion = 0;
			System.out.println("\n\nElige que opcion quieres:" + "\n1: Ingresar saldo a la cuenta" + "\n2: Retirar dinero de la cuenta" + "\n3: Mostrar la informacion de la cuenta" + "\n4:Salir");
			eleccion = teclado.nextInt();
			if(eleccion == 1) {
				System.out.println("Cuanto dinero quieres ingresar: ");
				cuenta1.ingresar();
			}else if(eleccion == 2) {
				System.out.println("Cuanto dinero quieres retirar: ");
				cuenta1.retirar();
			}else if(eleccion == 3) {
				System.out.println("Esta es la informacion de la cuenta");
				cuenta1.infoCuenta();
			}
		} while (eleccion != 4);
	}
}
