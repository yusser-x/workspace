package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sesion{
	public static Scanner keyboard = new Scanner(System.in);
	
	private static User usuario;
	private boolean logged;
	
	public static User getUsuario() {
        return usuario;
    }

	public void login() {
		System.out.print("Introduce el nombre de usuario: ");
	    String username = keyboard.nextLine();
	    System.out.print("Introduce la contraseña: ");
	    String password = keyboard.nextLine();
	    
	    try {
	    	File myObj = new File("./assets/files/users.txt");
	    	Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) {
		    	String data = myReader.nextLine();
		    	String[] campo =data.split("#");
	        
		    	String username1 = campo[0];
		    	String password1 = campo[1];
			
		    	
		    	if (username.equals(username1) && password.equals(password1)){
					usuario = new User(campo[0], campo[1], campo[2],campo[3],campo[4],campo[5],campo[6],campo[7]);					
					logged  = true;
					System.out.println("Has iniciado sesion con: " + campo[0]);		
					break;
				}
			        
		    }
			    myReader.close();
			    if (logged == false) {
			    	System.out.println("Nombre de usuario o contraseña incorrectos.");
		        	}
		        } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			 }
	    }
	    
	public void signUp() {
		System.out.println("Introduce el nombre de usuario: ");
		String username = keyboard.nextLine();
		boolean exist = false;
		
		try {
            File myObj = new File("./assets/files/users.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] campo = data.split("#");
                String username1 = campo[0];

                if (username.equals(username1)) {
                	exist = true;
                    break;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
		if(exist == true) {
			System.out.println("El nombre de usuario existe intoduzca otro");
			
			System.out.println("Introduce el nombre de usuario: ");
			username = keyboard.nextLine();
			System.out.print("Introduce la contraseña: ");
	        String password = keyboard.nextLine();
	        System.out.print("Introduce tu nombre completo: ");
	        String name = keyboard.nextLine();
	        System.out.print("Introduce tu NIF: ");
	        String nif = keyboard.nextLine();
	        System.out.print("Introduce tu email: ");
	        String email = keyboard.nextLine();
	        System.out.print("Introduce tu dirección: ");
	        String address = keyboard.nextLine();
	        System.out.print("Introduce tu fecha de nacimiento (DD/MM/YYYY): ");
	        String birthdate = keyboard.nextLine();
	        System.out.print("Introduce tu Rol: ");
	        String role = keyboard.nextLine();
	        
	        usuario = new User(username, password, name,nif,email,address,birthdate,role);
	        
	        try {
	            FileWriter myWriter = new FileWriter("./assets/files/users.txt");     
	            myWriter.write("\n" + username + "#" + password + "#" + name + "#" + nif + "#" +
	                    email + "#" + address + "#" + birthdate + "#" + role + "\n");
	            myWriter.close();
	            System.out.println("Usuario " + username + " registrado con éxito.");
	            logged = true;
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
		}else {
			System.out.print("Introduce la contraseña: ");
	        String password = keyboard.nextLine();
	        System.out.print("Introduce tu nombre completo: ");
	        String name = keyboard.nextLine();
	        System.out.print("Introduce tu NIF: ");
	        String nif = keyboard.nextLine();
	        System.out.print("Introduce tu email: ");
	        String email = keyboard.nextLine();
	        System.out.print("Introduce tu dirección: ");
	        String address = keyboard.nextLine();
	        System.out.print("Introduce tu fecha de nacimiento (DD/MM/YYYY): ");
	        String birthdate = keyboard.nextLine();
	        System.out.print("Introduce tu Rol: ");
	        String role = keyboard.nextLine();
	        
	        usuario = new User(username, password, name,nif,email,address,birthdate,role);
	        
	        try {
	            FileWriter myWriter = new FileWriter("./assets/files/users.txt");     
	            myWriter.write("\n" + username + "#" + password + "#" + name + "#" + nif + "#" +
	                    email + "#" + address + "#" + birthdate + "#" + role + "\n");
	            myWriter.close();
	            System.out.println("Usuario " + username + " registrado con éxito.");
	            logged = true;
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
		}
	}
	
	
	
	public boolean isLogged() {
		return logged;
		
	}
	
	public static void showUser() {
		usuario.mostrarUsuario();
	}
	
	public void logout() {
		logged = false;
		usuario = null;
		System.out.println("Sesion cerrada");
	}
}