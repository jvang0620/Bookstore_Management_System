package src;

/**
 * This class is an abstract class called Product.
 * It is the parent class of Books, CDs, and DVDs.
 * It also contains a Comparable interface
 * 
 * @author Jai Vang
 */
public abstract class Product implements Comparable<Product> {

    // Instance variables
    String nameOfItem;
    String authorOfItem;
    int productId;
    int priceOfItem;

    /**
     * Default COnstructor
     */
    public Product() {
    }

    /**
     * Main Constructor
     * 
     * @param nameOfItem
     * @param authorOfItem
     * @param productId
     * @param priceOfItem
     */
    public Product(String nameOfItem, String authorOfItem, int productId, int priceOfItem) {
        this.nameOfItem = nameOfItem;
        this.authorOfItem = authorOfItem;
        this.productId = productId;
        this.priceOfItem = priceOfItem;
    }

    /**
     * Getter for name of item
     * 
     * @return name of item
     */
    public String getNameOfItem() {
        return this.nameOfItem;
    }

    /**
     * Setter for name of item
     * 
     * @param nameOfItem
     */
    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    /**
     * Getter for author of item
     * 
     * @return author of item
     */
    public String getAuthorOfItem() {
        return this.authorOfItem;
    }

    /**
     * Setter for author of item
     * 
     * @param authorOfItem
     */
    public void setAuthorOfItem(String authorOfItem) {
        this.authorOfItem = authorOfItem;
    }

    /**
     * Getter for product ID
     * 
     * @return product ID
     */
    public int getProductId() {
        return this.productId;
    }

    /**
     * Setter for ID of product
     * 
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * Getter for price of item
     * 
     * @return price of item
     */
    public int getPriceOfItem() {
        return this.priceOfItem;
    }

    /**
     * Setter for price of item
     * 
     * @param priceOfItem
     */
    public void setPriceOfItem(int priceOfItem) {
        this.priceOfItem = priceOfItem;
    }

} // End of class
