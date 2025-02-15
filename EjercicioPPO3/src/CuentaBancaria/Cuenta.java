package CuentaBancaria;

import java.util.Scanner;

public class Cuenta {
	
	private long numeroCuenta;
	private long dni;
	private double saldo;
	
	
	public Cuenta(long numeroCuenta, long dni, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.dni = dni;
		this.saldo = saldo;
	}
	public Cuenta(long dni, double saldo) {
		super();
		this.dni = dni;
		this.saldo = saldo;
	}
	public long getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double ingresar() {
		Scanner teclado = new Scanner(System.in);
		double ingreso = teclado.nextDouble();
		this.saldo =this.saldo + ingreso;
		return this.saldo;
	}
	
	public double retirar() {
		Scanner teclado = new Scanner(System.in);
		double retiro = teclado.nextDouble();
		this.saldo  = this.saldo - retiro;
		
		return this.saldo;
	}

	public void infoCuenta() {
		System.out.print("Numero de Cuenta: " + this.numeroCuenta + "\nDNI: " + this.dni + "\nSaldo Actual: " + this.saldo);
	}
}
