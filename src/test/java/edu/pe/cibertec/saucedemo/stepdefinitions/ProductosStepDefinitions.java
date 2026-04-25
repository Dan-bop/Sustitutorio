package edu.pe.cibertec.saucedemo.stepdefinitions;

import edu.pe.cibertec.saucedemo.tasks.VerificarInventario;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

public class ProductosStepDefinitions {
    
    @Then("she should see exactly {int} products on the inventory page")
    public void sheShouldSeeExactlyProducts(int expectedCount) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerificarInventario.conCantidad(expectedCount)
        );
    }
}