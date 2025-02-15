/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * DMS - 2021.11.27
 * version 0.1.0
 */
package Classes;
import Classes.Config;
import Classes.Interface;
import Classes.Sesion;


public class Main {
	public static Sesion sesionActual = new Sesion();
	public static void main(String[] args) {
		System.out.println(Config.WELCOME);
		int opcion = -1;
		opcion = Interface.getInt(Config.UNLOGGED_MENU);
		while (true) {

            if (opcion == 1) {
                sesionActual.login();  
                if (sesionActual.isLogged() == true) {
                	opcion = Interface.getInt(Config.LOGGED_MENU);
                	accionConLogin(opcion);
                    
                }
            }else if(opcion == 2) {
            	sesionActual.signUp();
            	opcion = Interface.getInt(Config.LOGGED_MENU);
            	accionConLogin(opcion);
    			}
            
            else if (opcion == 0) {
            	System.out.println(Config.GOODBYE);
            }
		}
	}
	
	public static void accionConLogin(int opcion) {
		if (opcion == 1){
			System.out.println("PROXIMAMENTE");
		}else if (opcion == 2) {
			System.out.println("PROXIMAMENTE");
		}else if (opcion == 3) {
			System.out.println("PROXIMAMENTE");
		} else if (opcion == 4) {
				System.out.println("PROXIMAMENTE");
		}
		else if(opcion == 5) {
			sesionActual.showUser();
		}else if(opcion == 6) {
			sesionActual.logout();	
			System.out.println(sesionActual.isLogged());
		}
	}
}
