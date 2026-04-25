package edu.pe.cibertec.saucedemo.stepdefinitions;

import edu.pe.cibertec.saucedemo.questions.TheCartBadge;
import edu.pe.cibertec.saucedemo.questions.TheCartContents;
import edu.pe.cibertec.saucedemo.tasks.AgregarAlCarrito;
import edu.pe.cibertec.saucedemo.tasks.EliminarCarrito;
import edu.pe.cibertec.saucedemo.tasks.NavegarAlCarrito;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class CarritoStepDefinitions {

    @And("she adds the product {string} to the cart")
    public void sheAddsTheProductToTheCart(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.conNombre(productName)
        );
    }

    @And("she navigates to the cart page")
    public void sheNavigatesToTheCartPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                NavegarAlCarrito.page()
        );
    }

    @Then("she should see the product {string} in the cart")
    public void sheShouldSeeTheProductInTheCart(String productName) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCartContents.itemNames(), hasItem(containsString(productName)))
        );
    }

    @And("she removes the product {string} from the cart")
    public void sheRemovesTheProductFromTheCart(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EliminarCarrito.conNombre(productName)
        );
    }

    @Then("the cart icon should display {string}")
    public void theCartIconShouldDisplay(String expectedCount) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCartBadge.count(), equalTo(expectedCount))
        );
    }

    @Then("the cart should only contain {string}")
    public void theCartShouldOnlyContain(String productName) {
        OnStage.theActorInTheSpotlight().attemptsTo(NavegarAlCarrito.page());
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCartContents.itemNames(), hasSize(1)),
                seeThat(TheCartContents.itemNames(), hasItem(containsString(productName)))
        );
    }

    @And("the cart should contain {string} and {string}")
    public void theCartShouldContainBothProducts(String product1, String product2) {
        OnStage.theActorInTheSpotlight().attemptsTo(NavegarAlCarrito.page());
        OnStage.theActorInTheSpotlight().should(
                seeThat(TheCartContents.itemNames(), hasItem(containsString(product1))),
                seeThat(TheCartContents.itemNames(), hasItem(containsString(product2)))
        );
    }
}
