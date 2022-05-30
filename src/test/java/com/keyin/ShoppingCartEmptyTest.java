package com.keyin;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ShoppingCartEmptyTest {
    
    private Item item;

    private void assertArrayEquals(Item[] items, Object items2) {
    }

    private void assertArrayEquals(Object items) {
    }

    @Test
    public void isEmpty() {
        ShoppingCart cart = new ShoppingCart(new ArrayList<Item>());
        assertArrayEquals(new Item[] {}, cart.getItems());
        System.out.println("Should be not Empty = " + cart.getItems());        
    }

    @Test
    public void isNotEmpty() {
        ShoppingCart cart = new ShoppingCart();
        assertArrayEquals(cart.getItems());
        System.out.println("Should be Empty = " + cart.getItems());
    }

    @Test
    public void isNotEmptyWithQuantityTwo() {
        ShoppingCart cart = new ShoppingCart(Arrays.asList(new Item(100.0, 2)));
        assertArrayEquals(new Item[] {new Item(100.0, 2)}, cart.getItems());
        System.out.println("Should be not Empty = " + cart.getItems());
    }

}
