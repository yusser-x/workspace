/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * DMS - 2021.11.27
 * version 0.1.0
 */
package Classes;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sesion session = new Sesion();
        boolean running = true;

        while (running) {
            if (session.isLogged()) {
                showLoggedMenu(session);
            } else {
                showUnloggedMenu(session);
            }
        }
    }

    private static void showUnloggedMenu(Sesion session) {
        System.out.println(Config.UNLOGGED_MENU);
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada

        switch (option) {
            case 1:
                // Iniciar sesión
                System.out.print("Nombre de usuario: ");
                String username = scanner.nextLine();
                System.out.print("Contraseña: ");
                String password = scanner.nextLine();
                session.login(username, password);
                break;
            case 2:
                // Registro
                System.out.print("Nombre de usuario: ");
                username = scanner.nextLine();
                System.out.print("Contraseña: ");
                password = scanner.nextLine();
                System.out.print("Nombre completo: ");
                String name = scanner.nextLine();
                System.out.print("NIF: ");
                String nif = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Dirección: ");
                String address = scanner.nextLine();
                System.out.print("Fecha de nacimiento: ");
                String birthdate = scanner.nextLine();
                session.signup(username, password, name, nif, email, address, birthdate);
                break;
            case 0:
                System.out.println(Config.GOODBYE);
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void showLoggedMenu(Sesion session) {
        System.out.println(Config.LOGGED_MENU);
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada

        switch (option) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Próximamente");
                break;
            case 5:
                session.showUser();
                break;
            case 6:
                session.logout();
                break;
            case 0:
                System.out.println(Config.GOODBYE);
                System.exit(0);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
