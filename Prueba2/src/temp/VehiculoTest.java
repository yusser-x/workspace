package temp;

public class VehiculoTest {
	public static void main(String[] args) {
		
		Vehiculo vehiculo = new Vehiculo("ASD-123", "ford", "focus", 2010, "Gris", "kkkkk");
		Vehiculo vehiculo1 = new Vehiculo("ASD-123456", "Audi", 2018);
		
		System.out.println("Esta es la informacion sobre los coches: ");
		System.out.println("--------------------------------------------------- ");
		vehiculo.mostrarInformacion();
		System.out.println("--------------------------------------------------- ");
		vehiculo1.mostrarInformacion();
	}
	
	public static void Array() {
		
	}
}
