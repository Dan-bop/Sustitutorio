package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.playwright.Target;
import net.serenitybdd.screenplay.playwright.interactions.Click;

public class EliminarCarrito implements Task {

    private final String productName;

    public EliminarCarrito(String productName) {
        this.productName = productName;
    }


    public static EliminarCarrito producto(String productName) {
        return Tasks.instrumented(EliminarCarrito.class, productName);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Target boton = Target.the("remove from cart button")
                .locatedBy(CarritoPage.removeFromCartButton(productName));

        actor.attemptsTo(
                Click.on(boton)
        );
    }
}