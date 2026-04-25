package edu.pe.cibertec.saucedemo.stepdefinitions;

import edu.pe.cibertec.saucedemo.tasks.VerificarInventario;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ProductosStepDefinitions {

    @Then("she should see exactly {int} products on the inventory page")
    public void sheShouldSeeExactlyProductsOnTheInventoryPage(int expectedCount) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(VerificarInventario.total(), equalTo(expectedCount))
        );
    }
}
