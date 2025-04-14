import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaTest {

    private Cuenta cuenta;

    @Before
    public void setUp() {
        cuenta = new Cuenta("123ABC", 1000f);
    }

    @Test
    public void testGetNumero() {
        assertEquals("123ABC", cuenta.getNumero());
    }

    @Test
    public void testGetSaldo() {
        assertEquals(1000f, cuenta.getSaldo(), 0.001f);
    }

    @Test
    public void testSetNumero() {
        cuenta.setNumero("456DEF");
        assertEquals("456DEF", cuenta.getNumero());
    }

    @Test
    public void testSetSaldo() {
        cuenta.setSaldo(500f);
        assertEquals(500f, cuenta.getSaldo(), 0.001f);
    }

    @Test
    public void testIngresarDinero() {
        cuenta.ingresarDinero(250f);
        assertEquals(1250f, cuenta.getSaldo(), 0.001f);
    }

    @Test
    public void testExtraerDinero() {
        cuenta.extraerDinero(300f);
        assertEquals(700f, cuenta.getSaldo(), 0.001f);
    }

    @Test
    public void testMostrarCuenta() {
        // Para pruebas de impresión por consola, se puede redirigir la salida
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        cuenta.mostrarCuenta();

        String salidaEsperada = "N° cuenta: 123ABC\nSaldo: 1000.0 C\n";
        assertEquals(salidaEsperada.replace("\n", System.lineSeparator()), outContent.toString());
    }
}
