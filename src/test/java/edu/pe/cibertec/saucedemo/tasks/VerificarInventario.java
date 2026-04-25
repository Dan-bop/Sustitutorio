package edu.pe.cibertec.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.playwright.abilities.BrowseTheWebWithPlaywright;

public class VerificarInventario implements Question<Integer> {

    public static VerificarInventario total() {
        return new VerificarInventario();
    }

    @Override
    public Integer answeredBy(Actor actor) {

        return BrowseTheWebWithPlaywright.as(actor)
                .getCurrentPage()
                .locator(".inventory_item") // Selector directo
                .count();
    }
}