package Classes;

import java.util.*;

public class Sesion {
    private User user;
    private boolean logged;

    public Sesion() {
        this.logged = false;
        this.user = null;
    }

    public boolean isLogged() {
        return logged;
    }

    public void login(String username, String password) {
        List<User> users = loadUsersFromFile();
        for (User u : users) {
            if (u.getUsername().equals(username) && password.equals("dummyPassword")) { // Asegurarse de que la contraseña sea correcta
                this.user = u;
                logged = true;
                System.out.println("Sesión iniciada con éxito.");
                return;
            }
        }
        System.out.println("Usuario o contraseña no válidos.");
    }

    public void signup(String username, String password, String name, String nif, String email, String address, String birthdate) {
        List<User> users = loadUsersFromFile();
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                System.out.println("El nombre de usuario ya existe.");
                return;
            }
        }
        User newUser = new User(username, name, nif, email, address, birthdate, "user");
        users.add(newUser);
        saveUsersToFile(users);
        System.out.println("Registro completado con éxito.");
    }

    public void showUser() {
        if (logged && user != null) {
            System.out.println("Información del usuario:");
            System.out.println("Usuario: " + user.getUsername());
            System.out.println("Nombre completo: " + user.getName());
            System.out.println("NIF: " + user.getNif());
            System.out.println("Email: " + user.getEmail());
            System.out.println("Dirección: " + user.getAddress());
            System.out.println("Fecha de nacimiento: " + user.getBirthdate());
            System.out.println("Rol: " + user.getRole());
        } else {
            System.out.println("No hay sesión iniciada.");
        }
    }

    public void logout() {
        if (logged) {
            logged = false;
            user = null;
            System.out.println("Sesión cerrada.");
        }
    }

    private List<User> loadUsersFromFile() {
        List<User> users = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(Config.USERS_FILE))) {
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                users.add(new User(data[0], data[1], data[2], data[3], data[4], data[5], data[6]));
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo de usuarios.");
        }
        return users;
    }

    private void saveUsersToFile(List<User> users) {
        try (PrintWriter writer = new PrintWriter(new File(Config.USERS_FILE))) {
            for (User u : users) {
                writer.println(u.getUsername() + "," + u.getName() + "," + u.getNif() + "," + u.getEmail() + "," + u.getAddress() + "," + u.getBirthdate() + "," + u.getRole());
            }
        } catch (Exception e) {
            System.out.println("Error al guardar el archivo de usuarios.");
        }
    }
}
