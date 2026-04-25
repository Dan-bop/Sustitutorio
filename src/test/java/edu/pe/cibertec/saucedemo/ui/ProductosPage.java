package edu.pe.cibertec.saucedemo.ui;

import net.serenitybdd.screenplay.playwright.Target;

public class ProductosPage {
    public static final Target PRODUCT_ITEMS =
            Target.the("product items").locatedBy(".inventory_item");
}