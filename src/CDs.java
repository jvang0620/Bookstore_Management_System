/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Jai Vang
 */
public class CDs extends Product {

    /*
     * Default Constructor
     */
    public CDs() {
    }

    /**
     * Main Constructor
     * 
     * @param nameOfItem
     * @param authorOfItem
     * @param productId
     * @param priceOfItem
     */
    public CDs(String nameOfItem, String authorOfItem, int productId, int priceOfItem) {

        super(nameOfItem, authorOfItem, productId, priceOfItem);
    }

    @Override
    public int compareTo(Product otherObject) {

        // //Create Pricing and Purchase instance
        // PricingAndPurchase PNPInstance = new PricingAndPurchase();

        CDs cdInstance = new CDs();

        // Get CD price
        int cdsPrice = cdInstance.getPriceOfItem();
        // Get other item price
        int otherItemPrice = otherObject.getPriceOfItem();

        System.out.println("Price of CD: $" + cdsPrice);
        System.out.println("Price of other item: $" + otherItemPrice);

        if (cdsPrice > otherItemPrice) { // If the cds price is greater than the other item price, return 1
            return 1;
        } else if (cdsPrice < otherItemPrice) { // If the cds price is less than the other item price, return -1
            return -1;
        } else {
            return 0; // if the cds price is equal to the other item price, return 0
        }
    }

} // End of class
