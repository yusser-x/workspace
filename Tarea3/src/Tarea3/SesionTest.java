package Tarea3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SesionTest {

    @Test
    public void testLoginCorrecto1() {
        Sesion sesion = new Sesion();
        assertTrue(sesion.login("dmunuera", "123456"));
    }

    @Test
    public void testLoginCorrecto2() {
        Sesion sesion = new Sesion();
        assertTrue(sesion.login("pepe", "654321"));
    }

    @Test
    public void testLoginIncorrecto() {
        Sesion sesion = new Sesion();
        assertFalse(sesion.login("maria", "654321"));
    }

    @Test
    public void testLoginIncorrecto2() {
        Sesion sesion = new Sesion();
        assertFalse(sesion.login("dmunuera", "987654321"));
    }
}
