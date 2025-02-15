package temp;

public class ProductoTest {
	public static void main(String[] args) {
		Producto producto = new Producto("4090", 2000);
		Producto producto1 = new Producto("I5-10400f", "Procesadores", 105.5, 20,"1234f", "Intel" );
		
		System.out.println("Informacion de los productos");
		producto.infoProducto();
		System.out.println("--------------------------------------------------------------------");
		producto1.infoProducto();
		
		System.out.println(Producto.Contador());
	}
	
}
