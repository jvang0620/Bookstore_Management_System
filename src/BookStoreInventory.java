/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author Jai Vang
 */
public class BookStoreInventory implements BookstoreSpecification {

    /**
     * Bookstore will start with this amount of inventory
     */
    private int booksInStock = 50;
    private int cdsInStock = 50;
    private int dvdsInStock = 50;

    /**
     * Method that display the number of items in stock
     */
    public void displayBookStoreInventory() {
        System.out.println();
        System.out.println("Book Store Inventory Display");
        System.out.println("********************************");
        System.out.println("Books avaiable: " + booksInStock);
        System.out.println("CDs available: " + cdsInStock);
        System.out.println("DVDs available: " + dvdsInStock);
        System.out.println("********************************");
        System.out.println();
    }

    /**
     * Method that display the Inventory Value
     */
    public void displayInventoryValue() {
        PricingAndPurchase book = new PricingAndPurchase(); // create book object from PricingAndPurchase class
        PricingAndPurchase cds = new PricingAndPurchase(); // create Cds objects from PricingAndPurchase class
        PricingAndPurchase dvds = new PricingAndPurchase(); // create Dvds objects from PricingAndPurchase class

        int bookCost = book.getBookCost(); // get the cost of book from PricingAndPurchase class
        int cdsCost = cds.getCdCost(); // get the cost of Cds from PricingAndPurchase class
        int dvdsCost = dvds.getDvdCost(); // get the cost of Dvds from PricingAndPurchase class

        int bookValueInInventory = bookCost * booksInStock;
        int cdsValueInInventory = cdsCost * cdsInStock;
        int dvdsValueInInventory = dvdsCost * dvdsInStock;
        int totalValueOfItemsInInventory = bookValueInInventory + cdsValueInInventory + dvdsValueInInventory; // add the
                                                                                                              // cost of
                                                                                                              // book,
                                                                                                              // CDs,
                                                                                                              // and
                                                                                                              // DVDs
                                                                                                              // togther

        System.out.println();
        System.out.println("Book Store Inventory Value Display");
        System.out.println("**************************************");
        System.out.println("Books value: $" + bookCost * booksInStock);
        System.out.println("CDs value: $" + cdsCost * cdsInStock);
        System.out.println("DVDs value: $" + dvdsCost * dvdsInStock);
        System.out.println("Total value of all three items combined: $" + totalValueOfItemsInInventory);
    }

    /**
     * Method that display the total amount of books in stock.
     * 
     * @return Return the number of books in stock
     */
    public int booksTotalInInventory() {
        return booksInStock;
    }

    /**
     * Method that display the number of books in the inventory
     */
    public void displayBooksTotalInInventory() {
        System.out.println();
        System.out.println("Book's inventory");
        System.out.println("***********************************");
        System.out.println("Books avaiable: " + booksInStock);
        System.out.println("********************************");
        System.out.println();
    }

    /**
     * Method that display the total amount of CD in stock.
     * 
     * @return Return the number of CDs in stock
     */
    public int cdTotalInInventory() {
        return cdsInStock;
    }

    /**
     * Method that display the number of CDs in the inventory
     */
    public void displayCDsTotalInInventory() {
        System.out.println();
        System.out.println("CD's inventory");
        System.out.println("***********************************");
        System.out.println("CDs avaiable: " + cdsInStock);
        System.out.println("********************************");
        System.out.println();
    }

    /**
     * Method that display the total amount of DVDs in stock
     * 
     * @return Return the number of CDs in stock
     */
    public int dvdTotalInInventory() {
        return dvdsInStock;
    }

    /**
     * Method that display the number of DVDs in the inventory
     */
    public void displayDVDsTotalInInventory() {
        System.out.println();
        System.out.println("DVD's inventory");
        System.out.println("***********************************");
        System.out.println("DVDs avaiable: " + dvdsInStock);
        System.out.println("********************************");
        System.out.println();
    }

    /**
     * Method that removes book from inventory after customer's purchase
     * 
     * @param booksDeduction
     */
    public void deductionOfBooksFromInventory(int booksDeduction) {
        this.booksInStock = this.booksInStock - booksDeduction;
    }

    /**
     * Method that removes CDs from inventory after customer's purchase
     * 
     * @param cdsDeduction
     */
    public void deductionOfCDsFromInventory(int cdsDeduction) {
        this.cdsInStock = this.cdsInStock - cdsDeduction;
    }

    /**
     * Method that removes DVDs from inventory after customer's purchase
     * 
     * @param dvdsDeduction
     */
    public void deductionOfDVDsFromInventory(int dvdsDeduction) {
        this.dvdsInStock = this.dvdsInStock - dvdsDeduction;
    }

    /**
     * Method that updates the current inventory
     * 
     * @param currentBooks
     * @param currentCDs
     * @param currentDVDs
     */
    public void updateCurrentInventory(int currentBooks, int currentCDs, int currentDVDs) {
        this.booksInStock = this.booksInStock + currentBooks;
        this.cdsInStock = this.cdsInStock + currentCDs;
        this.dvdsInStock = this.dvdsInStock + currentDVDs;
    }

    /**
     * given a product id and a product quantity, update
     * stock by adding amount to existing product quantity
     * 
     * @param productId
     * @param amount
     * @return 0
     */
    @Override
    public int restockProduct(int productId, int amount) {

        if (productId >= 104 && productId <= 199) {
            if (amount == 1) {
                this.booksInStock++;
            }
            return this.booksInStock;
        } else if (productId >= 204 && productId <= 299) {
            if (amount == 1) {
                this.cdsInStock++;
            }
            return this.cdsInStock;
        } else if (productId >= 304 && productId <= 399) {
            if (amount == 1) {
                this.dvdsInStock++;
            }
            return this.dvdsInStock;
        } else {
            return 0;
        }
    }

    /**
     * calculate and return dollar amount for current inventory of products
     * that is in stock
     * 
     * @return total in stock value
     */
    @Override
    public double inventoryValue() {

        PricingAndPurchase book = new PricingAndPurchase(); // create book object from PricingAndPurchase class
        PricingAndPurchase cds = new PricingAndPurchase(); // create Cds objects from PricingAndPurchase class
        PricingAndPurchase dvds = new PricingAndPurchase(); // create Dvds objects from PricingAndPurchase class

        int bookCost = book.getBookCost(); // get the cost of book from PricingAndPurchase class
        int cdsCost = cds.getCdCost(); // get the cost of Cds from PricingAndPurchase class
        int dvdsCost = dvds.getDvdCost(); // get the cost of Dvds from PricingAndPurchase class

        int bookValueInInventory = bookCost * booksInStock;
        int cdsValueInInventory = cdsCost = cdsInStock;
        int dvdsValueInInventory = dvdsCost * dvdsInStock;

        // add the cost of book, CDs, and DVDs togther
        int totalValueOfItemsInInventory = bookValueInInventory + cdsValueInInventory + dvdsValueInInventory;

        // return total inventory value
        return totalValueOfItemsInInventory;

    }

} // end of class
