/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Jai Vang
 */
public class DVDs extends Product {

    /*
     * Default Constructor
     */
    public DVDs() {
    }

    /**
     * Main Constructor
     * 
     * @param nameOfItem
     * @param authorOfItem
     * @param productId
     * @param priceOfItem
     */
    public DVDs(String nameOfItem, String authorOfItem, int productId, int priceOfItem) {

        super(nameOfItem, authorOfItem, productId, priceOfItem);
    }

    @Override
    public int compareTo(Product otherObject) {

        // Create Pricing and Purchase instance
        // PricingAndPurchase PNPInstance = new PricingAndPurchase();
        DVDs dvdInstance = new DVDs();

        // Get DVD price
        int dvdPrice = dvdInstance.getPriceOfItem();
        // Get other item price
        int otherItemPrice = otherObject.getPriceOfItem();

        System.out.println("Price of DVD: $" + dvdPrice);
        System.out.println("Price of other item: $" + otherItemPrice);

        if (dvdPrice > otherItemPrice) { // If the dvd price is greater than the other item price, return 1
            return 1;
        } else if (dvdPrice < otherItemPrice) { // If the dvd price is less than the other item price, return -1
            return -1;
        } else {
            return 0; // if the dvd price is equal to the other item price, return 0
        }
    }

} // end of class
