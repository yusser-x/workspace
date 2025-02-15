package Classes;

public class Interface {

    public static void main(String[] args) {
        Sesion session = new Sesion();
        boolean running = true;

        Interface.showWelcomeMessage();  // Mostrar mensaje de bienvenida

        while (running) {
            if (session.isLogged()) {
                showLoggedMenu(session);
            } else {
                showUnloggedMenu(session);
            }
        }
    }

    // Método para mostrar el menú cuando el usuario no ha iniciado sesión
    private static void showUnloggedMenu(Sesion session) {
        Interface.showUnloggedMenu();  // Mostrar el menú para usuarios no logueados
        int option = Interface.getInt("Selecciona una opción: ");

        switch (option) {
            case 1:
                // Iniciar sesión
                String username = Interface.getString("Nombre de usuario: ");
                String password = Interface.getString("Contraseña: ");
                session.login(username, password);
                break;
            case 2:
                // Registro
                String newUsername = Interface.getString("Nombre de usuario: ");
                String newPassword = Interface.getString("Contraseña: ");
                String name = Interface.getString("Nombre completo: ");
                String nif = Interface.getString("NIF: ");
                String email = Interface.getString("Email: ");
                String address = Interface.getString("Dirección: ");
                String birthdate = Interface.getString("Fecha de nacimiento: ");
                session.signup(newUsername, newPassword, name, nif, email, address, birthdate);
                break;
            case 0:
                Interface.showGoodbyeMessage();  // Mostrar mensaje de despedida
                System.exit(0);  // Terminar el programa
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    // Método para mostrar el menú cuando el usuario ha iniciado sesión
    private static void showLoggedMenu(Sesion session) {
        Interface.showLoggedMenu();  // Mostrar el menú para usuarios logueados
        int option = Interface.getInt("Selecciona una opción: ");

        switch (option) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Próximamente");
                break;
            case 5:
                session.showUser();  // Mostrar información del usuario actual
                break;
            case 6:
                session.logout();  // Cerrar sesión
                break;
            case 0:
                Interface.showGoodbyeMessage();  // Mostrar mensaje de despedida
                System.exit(0);  // Terminar el programa
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
