package temp;

public class Vehiculo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private int anofabricacion;
	private String color;
	private String propietario;
	
	static int contador;

	
	public Vehiculo(String matricula, String color, String propietario) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.propietario = propietario;
	}

	public Vehiculo(String matricula, String marca, int anofabricacion) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.anofabricacion = anofabricacion;
	}

	public Vehiculo(String matricula, String marca, String modelo, int anofabricacion, String color,
			String propietario) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anofabricacion = anofabricacion;
		this.color = color;
		this.propietario = propietario;
		contador++;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnofabricacion() {
		return anofabricacion;
	}

	public void setAnofabricacion(int anofabricacion) {
		this.anofabricacion = anofabricacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Vehiculo.contador = contador;
	}

	public void mostrarInformacion() {
		System.out.print("\nMatricula: " + this.matricula + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAño de Fabricacion: " + this.anofabricacion + "\ncolor: " + this.color + "\nPropietario: " + this.propietario + "\n");
	}


}
