/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.es.calculadoraduszinfernos.teste;

import br.ifes.edu.es.calculadoraduszinfernos.Calculadora;
import br.ifes.edu.es.calculadoraduszinfernos.CalculadoraImpl;
import br.ifes.edu.es.calculadoraduszinfernos.Operador;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 * @author 1998547
 */
public class CalculadoraTest {

    private int valor1 = 0;
    private int valor2 = 0;
    private int resultado = 0;
    private Calculadora calculadora = new CalculadoraImpl();

    @Given("^eu tenho o numero (\\d+) e (\\d+)$")
    public void euTenhoONumeroE(int arg1, int arg2) throws Throwable {

        valor1 = arg1;
        valor2 = arg2;
    }

    @When("^eu quero somar$")
    public void euQueroSomar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.resultado = calculadora.calcular(Operador.SOMAR, valor1, valor2);
    }

    @When("^eu quero subtrair$")
    public void euQueroSubtrair() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.resultado = calculadora.calcular(Operador.SUBTRAIR, valor1, valor2);
    }

    @When("^eu quero multiplicar$")
    public void euQueroMultiplicar() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.resultado = calculadora.calcular(Operador.MULTIPLICAR, valor1, valor2);
    }

    @When("^eu quero dividir$")
    public void euQueroDividir() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.resultado = calculadora.calcular(Operador.DIVIDIR, valor1, valor2);
    }

    @Then("^Eu quero como resultado o numero (\\d+)$")
    public void euQueroComoResultadoONumero(int resultadoEXperado) throws Throwable {

        assertThat(resultado, is(resultadoEXperado));

    }
}
