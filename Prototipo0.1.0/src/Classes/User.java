package Classes;

public class User {
	public String username;
	public String password;
	public String name;
	public String nif;
	public String email;
	public String  address;
	public String birthdate;
	public String role;
	
	public User(String username, String password, String name, String nif, String email, String address,
			String birthdate, String role) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.nif = nif;
		this.email = email;
		this.address = address;
		this.birthdate = birthdate;
		this.role = role;
	}
	
	

	public void mostrarUsuario() {
		System.out.println("\nUsuario: " + this.username +"\nContraseña: " + this.password + "\nNombre: " + this.name + 
				"\nnif: " + this.nif + "\nemail: " + this.email + "\nDirrecion: " + this.address + "\nFecha de nacimiento: " + this.birthdate + "\nRol: " + this.role);
	}
	
	
	
	

}
