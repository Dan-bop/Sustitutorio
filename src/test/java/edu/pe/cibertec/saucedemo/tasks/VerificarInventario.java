package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.ProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

public class VerificarInventario implements Task {

    private final int cantidadEsperada;

    public VerificarInventario(int cantidadEsperada) {
        this.cantidadEsperada = cantidadEsperada;
    }

    public static VerificarInventario conCantidad(int cantidadEsperada) {
        return Tasks.instrumented(VerificarInventario.class, cantidadEsperada);
    }

    @Override
public <T extends Actor> void performAs(T actor) {

    WebDriver driver = BrowseTheWeb.as(actor).getDriver();

    int cantidad = driver.findElements(
            org.openqa.selenium.By.cssSelector(ProductosPage.INVENTORY_ITEM)
    ).size();

    actor.should(
            seeThat("número de productos en inventario",
                    a -> cantidad,
                    equalTo(cantidadEsperada))
    );
}
}