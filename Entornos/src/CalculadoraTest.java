import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void setUp() {
        calc = new Calculadora();
    }

    @Test
    public void testSuma() {
        assertEquals(5, calc.suma(2, 3));
    }

    @Test
    public void testResta() {
        assertEquals(1, calc.resta(4, 3));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(12, calc.multiplicacion(4, 3));
    }

    @Test
    public void testDivisionValida() {
        assertEquals(2, calc.division(6, 3));
    }

    @Test
    public void testDivisionPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.division(5, 0));
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }

    @Test
    public void testEsParTrue() {
        assertTrue(calc.esPar(4));
    }

    @Test
    public void testEsParFalse() {
        assertFalse(calc.esPar(5));
    }

    @Test
    public void testMaximoPrimero() {
        assertEquals(9, calc.maximo(9, 4, 2));
    }

    @Test
    public void testMaximoSegundo() {
        assertEquals(10, calc.maximo(2, 10, 3));
    }

    @Test
    public void testMaximoTercero() {
        assertEquals(7, calc.maximo(1, 3, 7));
    }

    @Test
    public void testEsDivisibleTrue() {
        assertTrue(calc.esDivisible(10, 5));
    }

    @Test
    public void testEsDivisibleFalse() {
        assertFalse(calc.esDivisible(10, 3));
    }

    @Test
    public void testEsDivisiblePorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.esDivisible(5, 0));
        assertEquals("El divisor no puede ser cero", exception.getMessage());
    }
}
