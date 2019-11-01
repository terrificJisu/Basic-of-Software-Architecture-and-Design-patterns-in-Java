package visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Visitor Pattern ->  way of separating an algorithm from an object structure on which it operates
 *
 *      A practical result of this separation is the ability to add
 *          new operation to existing object structures without modifying those structures
 *              ~ we can solve the open-closed principle with this design pattern as well !!!
 *
 *          IMPORTANT: we can extract common operations into a unique class
 *
 *                     For example: webshop application
 *
 * */

public class Main {
    public static void main(String[] args) {

        List<ShoppingItem> items = new ArrayList<>();
        items.add(new Table("desk", 20));
        items.add(new Chair("chair1", 30));
        items.add(new Chair("chair2", 25));

        double sum = 0;
        ShoppingCartVisitor shoppingCart = new ShoppingCart();

        for (ShoppingItem shoppingItem : items) {
            sum = sum + shoppingItem.accept(shoppingCart);
        }

        System.out.println(sum);
    }
}
