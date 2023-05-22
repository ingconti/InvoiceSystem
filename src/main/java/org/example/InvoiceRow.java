package org.example;

public class InvoiceRow {
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getCost() {
        return product.getCost() * soldQty;
    }
    public int getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(int soldQty) {
        this.soldQty = soldQty;
    }

    private Product product;
    private int soldQty;

    public InvoiceRow(Product product, int soldQty) {
        this.product = product;
        this.soldQty = soldQty;
    }
}
