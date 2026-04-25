package edu.pe.cibertec.saucedemo.questions;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.playwright.abilities.BrowseTheWebWithPlaywright;

import java.util.List;
import java.util.stream.Collectors;

public class TheCartContents implements Question<List<String>> {

    public static TheCartContents displayed() {
        return new TheCartContents();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return BrowseTheWebWithPlaywright.as(actor)
                .getCurrentPage()
                .locator(CarritoPage.CART_ITEMS)
                .allTextContents()
                .stream()
                .map(String::trim)
                .collect(Collectors.toList());
    }
}