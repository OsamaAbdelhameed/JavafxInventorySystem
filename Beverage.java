/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmanagementsystem;

/**
 *
 * @author OSAMA
 */
public class Beverage extends Item{

    private int prodId;
    private String itemName;
    private int quantity;
    private double price;

    public Beverage(int id, String categoryName, String description, int prodId, String itemName, int quantity, double price) {
        super(id, categoryName, description);
        this.prodId = prodId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getItemName() {
        return itemName+" "+super.getName();
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getQuantity() {
        return Integer.toString(quantity)+"L";
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return Double.toString(price)+"$";
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
