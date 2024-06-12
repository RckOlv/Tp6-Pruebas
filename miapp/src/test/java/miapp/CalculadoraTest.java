package miapp;

import org.junit.Test; // Importa la anotación @Test de JUnit
import static org.junit.Assert.assertEquals; // Importa el método assertEquals de JUnit
import miapp.Calculadora;

public class CalculadoraTest {
    
    @Test
    public void testSuma() {
        assertEquals(4, Calculadora.suma(2, 2));
    }

    @Test
    public void testResta() {
        assertEquals(1, Calculadora.resta(3, 2));
    }

    @Test
    public void testCuadradoBinomio() {
        assertEquals(25, Calculadora.cuadradoBinomio(3, 2));
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(6, Calculadora.multiplicacion(3, 2));
    }
}
