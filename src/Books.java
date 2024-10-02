package src;

/**
 *
 * @author Jai Vang
 */
public class Books extends Product {

    /*
     * Default Constructor
     */
    public Books() {
    }

    /**
     * Main constructor
     * 
     * @param nameOfItem
     * @param authorOfItem
     * @param productId
     * @param priceOfItem
     */
    public Books(String nameOfItem, String authorOfItem, int productId, int priceOfItem) {

        super(nameOfItem, authorOfItem, productId, priceOfItem);
    }

    /**
     * CompareTo method that contrast price between book and other item
     * 
     * @param otherObject
     * @return 1 if the book price is greater than the other item price.
     *         Return -1 if the book price is less than the other item price.
     *         Return 0 if both items are equals.
     * 
     */
    @Override
    public int compareTo(Product otherObject) {

        // //Create Pricing and Purchase instance
        // PricingAndPurchase PNPInstance = new PricingAndPurchase();

        Books bookInstance = new Books();

        // Get book price
        int booksPrice = bookInstance.getPriceOfItem();
        // Get other item price
        int otherItemPrice = otherObject.getPriceOfItem();

        System.out.println("Price of book: $" + booksPrice);
        System.out.println("Price of other item: $" + otherItemPrice);

        if (booksPrice > otherItemPrice) { // If the book price is greater than the other item price, return 1
            return 1;
        } else if (booksPrice < otherItemPrice) { // If the book price is less than the other item price, return -1
            return -1;
        } else {
            return 0; // if the book price is equal to the other item price, return 0
        }
    }

} // End of class
