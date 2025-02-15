package temp;

public class Producto {
	
	private String nombre;
	private String categoria;
	private int precio;
	private int inventario;
	private String codigo;
	private String proveedor;
	
	static int contador = 0;
	static int stockMinimo = 10;
	
	
	public Producto(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		contador++;
	}

	public Producto(String nombre, String categoria, int precio, int inventario, String codigo, String proveedor) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.inventario = inventario;
		this.codigo = codigo;
		this.proveedor = proveedor;
		contador++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getInventario() {
		return inventario;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Producto.contador = contador;
	}

	public void infoProducto() {
		System.out.print("Nombre: " + this.nombre + "\nCategoria: " + this.categoria + "\nPrecio: " + this.precio + "\ninventario: " + this.inventario + "\nCodigo de barras: " + this.codigo + "\nProveedor: " + this.proveedor + "\n");
	}
	
	public static int Contador() {
		return contador;
	}
	
	public static void mostrarStockMinimo() {
        System.out.println("Stock mínimo requerido: " + stockMinimo);
    }
	
	public int valorInventario() {
		int valor = this.precio * this.inventario;
		return valor;
	}
}
