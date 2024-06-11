package miapp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import miapp.Calculadora;

public class CuadradoBinomioTest {
    @Test
    public void testCuadradoBinomio() {
        assertEquals(25, Calculadora.cuadradoBinomio(3, 2));
        assertEquals(49, Calculadora.cuadradoBinomio(4, 3));
        assertEquals(16, Calculadora.cuadradoBinomio(0, 4));
    }
}
