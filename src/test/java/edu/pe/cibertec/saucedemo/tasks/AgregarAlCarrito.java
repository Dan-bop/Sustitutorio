package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.playwright.Target; // Import de Playwright
import net.serenitybdd.screenplay.playwright.interactions.Click; // Import de Playwright

public class AgregarAlCarrito implements Task {

    private final String productName;

    public AgregarAlCarrito(String productName) {
        this.productName = productName;
    }

    public static AgregarAlCarrito producto(String productName) {
        return Tasks.instrumented(AgregarAlCarrito.class, productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Usamos el Target de Playwright
        Target boton = Target.the("add to cart button")
                .locatedBy(CarritoPage.addToCartButton(productName));

        actor.attemptsTo(Click.on(boton));
    }
}