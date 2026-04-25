package edu.pe.cibertec.saucedemo.questions;

import edu.pe.cibertec.saucedemo.ui.CarritoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.questions.Text;

public class TheCartBadge implements Question<String> {

    public static TheCartBadge count() {
        return new TheCartBadge();
    }

    @Override
    public String answeredBy(Actor actor) {
        Target badge = Target.the("cart badge")
                .locatedBy(CarritoPage.CART_BADGE);

        return Text.of(badge).answeredBy(actor).trim();
    }
}
