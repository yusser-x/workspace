package Tarea3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sesion {
	
	public boolean login(String usuario, String passworde) {
		try {
            File myObj = new File("./assets/usuarios.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                String[] campo = data.split("#");

                if (campo[0].equals(usuario) && campo[1].equals(passworde)) {
                	return true;
                }          
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se pudo abrir el archivo.");
            e.printStackTrace();
        }
        return false; 
    
	}
}
