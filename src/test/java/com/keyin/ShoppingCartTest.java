/*
 * QAP1.
 * @author Michael O'Reilly
 * 
 */

package com.keyin;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShoppingCartTest {
        
    private ShoppingCart buildCartWithItems(Item... items) {
    return new ShoppingCart(Arrays.asList(items));
    } 

    @Test 
    public void totalOfEmptyCart() {
        ShoppingCart cart = buildCartWithItems();
        assertEquals(0.0, cart.getTotal(), 0.0);
    }

    @Test
    public void totalOfOneItem() {
        ShoppingCart cart = buildCartWithItems(new Item(100.0, 1));
        assertEquals(100.0, cart.getTotal(), 0.0);
    }

    @Test
    public void totalOfTwoItems() {
        ShoppingCart cart = buildCartWithItems(new Item(100.0, 1), (new Item(200.0, 1)));
        assertEquals(300.0, cart.getTotal(), 0.0);
    }    

    @Test
    public void totalOfItemWithQuanityTwo() {
        ShoppingCart cart = buildCartWithItems(new Item(100.0, 2));
        assertEquals(200.0, cart.getTotal(), 0.0);
    }
    
}
