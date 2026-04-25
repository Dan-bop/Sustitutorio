package edu.pe.cibertec.saucedemo.tasks;

import edu.pe.cibertec.saucedemo.ui.ProductosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarInventario implements Question<Integer> {

    public static VerificarInventario total() {
        return new VerificarInventario();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return ProductosPage.PRODUCT_ITEMS.resolveAllFor(actor).size();
    }
}
