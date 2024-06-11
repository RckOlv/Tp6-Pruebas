package miapp.src.main.test.miapp;

import miapp.src.main.java.miapp.Calculadora;

public class CalculadoraTest {
    @Test
    public void testSuma() {
        assertEquals(4, Calculadora.suma(2, 2));
    }

    @Test
    public void testResta() {
        assertEquals(1, Calculadora.resta(3, 2));
    }

    private void assertEquals(int i, int resta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testCuadradoBinomio() {
        assertEquals(25, Calculadora.cuadradoBinomio(3, 2));
    }
}
