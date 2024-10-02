/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Jai Vang
 */
public class PricingAndPurchase {

    // Instance Variables
    private int bookCost = 0; // one dollar
    private int cdCost = 0; // two dollar
    private int dvdCost = 0; // three dollar
    private int bookPurchasedTotalAmount;
    private int cdPurchasedTotalAmount;
    private int dvdPurchasedTotalAmount;
    private int totalPurchasedAmount;

    public int getBookCost() {
        return this.bookCost;
    }

    public void setBookCost(int newBookCost) {
        this.bookCost = newBookCost;
    }

    public int getCdCost() {
        return this.cdCost;
    }

    public void setCdCost(int newCdCost) {
        this.cdCost = newCdCost;
    }

    public int getDvdCost() {
        return this.dvdCost;
    }

    public void setDvdCost(int newDvdCost) {
        this.dvdCost = newDvdCost;
    }

    /**
     * Method that display items price
     */
    public void displayPricesOfAllItems() {
        System.out.println();
        System.out.println("The Price of all the items");
        System.out.println("********************************");
        System.out.println("Book's price: $" + bookCost);
        System.out.println("CD'ss price: $" + cdCost);
        System.out.println("DVD's price: $" + dvdCost);
        System.out.println("********************************");
        System.out.println();
    }

    /**
     * Method that updates the pricing of an item
     * 
     * @param newBookPricing
     * @param newCDsPricing
     * @param newDVDsPricing
     */
    public void updateAllItemsPricing(int newBookPricing, int newCDsPricing, int newDVDsPricing) {
        this.bookCost = newBookPricing;
        this.cdCost = newCDsPricing;
        this.dvdCost = newDVDsPricing;
    }

    /**
     * Method that update the price of book
     * 
     * @param newBookPrice
     */
    public void updateBookPrice(int newBookPrice) {
        this.bookCost = newBookPrice;
    }

    /**
     * Method that update the price of CD
     * 
     * @param newCDPrice
     */
    public void updateCDPrice(int newCDPrice) {
        this.cdCost = newCDPrice;
    }

    /**
     * Method that update the price of DVD
     * 
     * @param newDVDPrice
     */
    public void updateDVDPrice(int newDVDPrice) {
        this.dvdCost = newDVDPrice;
    }

    /**
     * This method calculates the customers total spending
     * 
     * @param booksPurchased
     * @param cdsPurchased
     * @param dvdsPurchased
     */
    public void calculatingTheCustomersTotal(int booksPurchased, int cdsPurchased, int dvdsPurchased) {

        bookPurchasedTotalAmount = booksPurchased * bookCost;
        cdPurchasedTotalAmount = cdsPurchased * cdCost;
        dvdPurchasedTotalAmount = dvdsPurchased * dvdCost;

        this.totalPurchasedAmount = bookPurchasedTotalAmount + cdPurchasedTotalAmount + dvdPurchasedTotalAmount;
    }

    /**
     * Get method that return the shopping cart total
     * 
     * @return Return the total purchased amount
     */
    public int getShoppingCartTotal() {
        return totalPurchasedAmount;
    }

} // end of class
