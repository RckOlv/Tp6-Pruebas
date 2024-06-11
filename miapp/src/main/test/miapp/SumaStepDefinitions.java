package miapp.src.main.test.miapp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class SumaStepDefinitions {
    private int num1;
    private int num2;
    private int resultado;

    @Given("dos números enteros {int} y {int}")
    public void dos_numeros_enteros_y(int a, int b) {
        num1 = a;
        num2 = b;
    }

    @When("los sumo")
    public void los_sumo() {
        resultado = Calculadora.suma(num1, num2);
    }

    @Then("el resultado es {int}")
    public void el_resultado_es(int expected) {
        assertEquals(expected, resultado);
    }
}