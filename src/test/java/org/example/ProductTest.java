package org.example;

import junit.framework.TestCase;

public class ProductTest extends TestCase {

    public void testGetQty() {
        Product p = new Product("apple", 2,0.4);
        assertEquals(2, p.getQty());
    }

    public void testGetQty2() {
        Product p = new Product("apple", -4,0.4);
        assertEquals(0, p.getQty());
    }



    public void testSetCost() {
        Product p = new Product("apple", 1,0.4);
        assertEquals(0.4, p.getCost());
    }

    public void testSetCost2() {
        Product p = new Product("apple", 1,-45);
        double cost = p.getCost();
        assertEquals(0.0, cost);
    }

}