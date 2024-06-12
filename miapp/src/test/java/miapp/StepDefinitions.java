package miapp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    private int numero1;
    private int numero2;
    private int resultadoSuma;
    private int resultadoMultiplicacion;
    
    @Given("que tengo dos números {int} y {int}")
    public void que_tengo_dos_numeros(int num1, int num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    @When("los sumo")
    public void los_sumo() {
        this.resultadoSuma = Calculadora.suma(numero1, numero2);
    }

    @When("los resto")
    public void los_resto() {
        this.resultadoMultiplicacion = Calculadora.resta(numero1, numero2);
    }

    @Then("el resultado de la suma es {int}")
    public void el_resultado_de_la_suma_es(int resultadoEsperado) {
        assertEquals(resultadoEsperado, resultadoSuma);
    }

    @Then("el resultado de la multiplicacion es {int}")
    public void el_resultado_de_la_multiplicacion_es(int resultadoEsperado) {
        assertEquals(resultadoEsperado, resultadoMultiplicacion);
    }
}
