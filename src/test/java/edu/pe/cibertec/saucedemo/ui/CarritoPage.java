package edu.pe.cibertec.saucedemo.ui;

public class CarritoPage {

    public static String addToCartButton(String productName) {
        String slug = productName.toLowerCase().replace(" ", "-");
        return "[data-test='add-to-cart-" + slug + "']";
    }

    public static String removeFromCartButton(String productName) {
        String slug = productName.toLowerCase().replace(" ", "-");
        return "[data-test='remove-" + slug + "']";
    }

    public static final String CART_LINK = "a.shopping_cart_link";

    
    public static final String CART_ITEM_NAME = ".cart_item .inventory_item_name";

    public static final String CART_BADGE = ".shopping_cart_badge";
}
