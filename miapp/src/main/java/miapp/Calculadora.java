package miapp;

public class Calculadora {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int cuadradoBinomio(int a, int b) {
        return a * a + 2 * a * b + b * b;
    }

    public static void main(String[] args) {
        // Aquí puedes llamar a tus métodos para probarlos
        int resultadoSuma = suma(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = resta(5, 3);
        System.out.println("Resta: " + resultadoResta);

        int resultadoCuadradoBinomio = cuadradoBinomio(2, 3);
        System.out.println("Cuadrado del binomio: " + resultadoCuadradoBinomio);
    }
}
