package edu.pe.cibertec.saucedemo.ui;

public class CarritoPage {

    // Método para generar el selector del botón de añadir
    public static String addToCartButton(String productName) {
        String slug = productName.toLowerCase().replace(" ", "-");
        return "[data-test='add-to-cart-" + slug + "']";
    }

    // Método para generar el selector del botón de remover
    public static String removeFromCartButton(String productName) {
        String slug = productName.toLowerCase().replace(" ", "-");
        return "[data-test='remove-" + slug + "']";
    }

    // Selector para navegar al carrito
    public static final String CART_ICON = "a.shopping_cart_link";

    // Selector para los nombres de los productos dentro del carrito
    public static final String CART_ITEMS = ".cart_item .inventory_item_name";

    // Selector para el badge (contador) del carrito
    public static final String CART_BADGE = ".shopping_cart_badge";
}