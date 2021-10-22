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
public class Meat extends Item{
    private int prodId; 
    private String itemName;
    private double quantity;
    private double price;

    public Meat(int id, String categoryName, String description, int prodId, String itemName, double quantity, double price) {
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
        return Double.toString(quantity)+"KG";
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return Double.toString(price)+"$";
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
