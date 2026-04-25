package edu.pe.cibertec.saucedemo.questions;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class TheCartContents implements Question<List<String>> {

    public static TheCartContents itemNames() {
        return new TheCartContents();
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Target.the("cart item names")
                .locatedBy(CarritoPage.CART_ITEM_NAME)
                .resolveAllFor(actor)
                .stream()
                .map(element -> element.getText().trim())
                .toList();
    }
}
