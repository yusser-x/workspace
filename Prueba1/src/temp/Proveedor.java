package temp;

public class Proveedor {
	
	private String nombre;
	private String dirreccion;
	private int telefono;
	private String correo;
	
	public Proveedor(String nombre, String dirreccion, int telefono, String correo) {
		super();
		this.nombre = nombre;
		this.dirreccion = dirreccion;
		this.telefono = telefono;
		this.correo = correo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirreccion() {
		return dirreccion;
	}
	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
