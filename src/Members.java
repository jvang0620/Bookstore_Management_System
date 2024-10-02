/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 * This class has the member's attributes
 * This class has the class member's setter and getter methods.
 * 
 * @author Jai Vang
 */
public class Members {

    // private instance variables
    private String memberFirstName;
    private String memberLastName;
    private int howMuchMoneyMemberHadSpent;
    private int itemsPurchased;
    private int memberID;
    private String memberPaymentMethod;
    private String membershipType;

    /**
     * Default Constructor
     */
    public Members() {
    }

    /**
     * Constructor for member object
     * 
     * @param firstName
     * @param lastName
     * @param totalMoneySpent
     * @param itemsPurchased
     * @param memberID
     * @param methodOfPayment
     * @param membershipType
     */
    public Members(String firstName, String lastName, int totalMoneySpent, int itemsPurchased, int memberID,
            String methodOfPayment, String membershipType) {
        this.memberFirstName = firstName;
        this.memberLastName = lastName;
        this.howMuchMoneyMemberHadSpent = totalMoneySpent;
        this.itemsPurchased = itemsPurchased;
        this.memberID = memberID;
        this.memberPaymentMethod = methodOfPayment;
        this.membershipType = membershipType;

    } // End of Constructor

    /**
     * Get method that returns the name of member
     * 
     * @return Returns the name of member
     */
    public String getFirstNameOfMember() {
        return memberFirstName;
    }

    /**
     * Set method that sets new name to name of member
     * 
     * @param newFirstName
     */
    public void setFirstNameOfMember(String newFirstName) {
        this.memberFirstName = newFirstName;
    }

    /**
     * Get method that returns last name
     * 
     * @return Returns last name
     */
    public String getLastNameOfMemeber() {
        return memberLastName;
    }

    /**
     * Set method that sets new last name to last name
     * 
     * @param newLastName
     */
    public void setLastNameOfMember(String newLastName) {
        this.memberLastName = newLastName;
    }

    /**
     * Get method that returns how much money member had spent
     * 
     * @return Returns how much money member had spent
     */
    public int getHowMuchMoneyMemberHadSpent() {
        return this.howMuchMoneyMemberHadSpent;
    }

    /**
     * Set method that sets the new amount to how much much money member had spent
     * 
     * @param newAmount
     */
    public void setHowMuchMoneyMemberHadSpent(int newAmount) {
        this.howMuchMoneyMemberHadSpent = newAmount;
    }

    /**
     * Method that updates member's spending
     * 
     * @param moneySpent
     */
    public void updateMemberSpending(int moneySpent) {
        this.howMuchMoneyMemberHadSpent = moneySpent;
    }

    /**
     * Getter for total items purchased
     * 
     * @return total items purchased
     */
    public int getTotalItemsPurchased() {
        return this.itemsPurchased;
    }

    /**
     * Setter for total items purchased
     * 
     * @param totalItemsPurchased
     */
    public void setTotalItemsPurchased(int totalItemsPurchased) {
        this.itemsPurchased = totalItemsPurchased;
    }

    public void updateMemberTotalItemsPurchased(int itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    /**
     * Get method to return ID of member
     * 
     * @return Return member's ID number
     */
    public int getMemberID() {
        return memberID;
    }

    /**
     * Set method to set new ID of member to ID of member
     * 
     * @param newMemberID
     */
    public void setMemberID(int newMemberID) {
        this.memberID = newMemberID;
    }

    /**
     * Method for getting member's payment method
     * 
     * @return Return the member payment method
     */
    public String getMemberPaymentMethod() {
        return this.memberPaymentMethod;
    }

    /**
     * Set method that sets current memberpaymentMthod to newPaymentMethod
     * 
     * @param newPaymentMethod
     */
    public void setMemberPaymentMethod(String newPaymentMethod) {
        this.memberPaymentMethod = newPaymentMethod;
    }

    /**
     * Getter for membership type
     * 
     * @return
     */
    public String getMembershipType() {
        return this.membershipType;
    }

    /**
     * Setter for membership type
     * 
     * @param membershipType
     */
    public void setMembershipTye(String membershipType) {
        this.membershipType = membershipType;
    }

} // end of class
