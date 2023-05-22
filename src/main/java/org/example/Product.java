package org.example;

public class Product {
    private String descr;
    private int qty;
    private double cost;

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty>0 ? qty: 0;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost>0 ? cost : 0;
    }

    public Product(String descr, int qty, double cost) {
        this.descr = descr;
        this.setCost(cost);
        this.setQty(qty);
    }


}
