package src;

/**
 *
 * @author Jai Vang
 */
public class PremiumMembers extends Members {

    // Instance variables
    boolean hasPreiumMembership;
    boolean paidFeeOnTime;
    int monthlyFee;

    /**
     * Default constructor
     */
    public PremiumMembers() {
    }

    /**
     * Main Constructor
     * 
     * @param firstName
     * @param lastName
     * @param totalMoneySpent
     * @param itemsPurchased
     * @param memberID
     * @param methodOfPayment
     * @param membershipType
     * @param hasPreiumMembership
     * @param paidFeeOnTime
     * @param monthlyFee
     */
    public PremiumMembers(String firstName, String lastName, int totalMoneySpent, int itemsPurchased, int memberID,
            String methodOfPayment, String membershipType, boolean hasPreiumMembership, boolean paidFeeOnTime,
            int monthlyFee) {

        super(firstName, lastName, totalMoneySpent, itemsPurchased, memberID, methodOfPayment, membershipType);
        this.hasPreiumMembership = hasPreiumMembership;
        this.paidFeeOnTime = paidFeeOnTime;
        this.monthlyFee = monthlyFee;

    }

    /**
     * Boolean method checking if the customer is a premium member
     * 
     * @return Return true if customer has premium membership; return false if
     *         member is a regular member
     */
    public boolean isAPremiumMember() {
        return hasPreiumMembership;
    }

    /**
     * Set premium membership
     * 
     * @param hasPreiumMembership
     */
    public void setPremiumMembership(boolean hasPreiumMembership) {
        this.hasPreiumMembership = hasPreiumMembership;
    }

    /**
     * Boolean method checking the fee of a premium member to see if it's due or not
     * 
     * @return Return true if fee is due, false if fee is not due
     */
    public boolean isFeePaidOnTime() {
        return paidFeeOnTime; // This will return true or false depending on how we set up membership
    }

    /**
     * Set method that sets current feePaidOnTime to new feeaPaidOnTime.
     * 
     * @param paidFeeOnTime
     */
    public void setFeePaidOnTime(boolean paidFeeOnTime) {
        this.paidFeeOnTime = paidFeeOnTime;
    }

    /**
     * Get method that returns member monthly fee
     * 
     * @return Returns member monthly fee
     */
    public int getMemberMonthlyFee() {

        return this.monthlyFee;
    }

    /**
     * Set method that sets new monthly fee to current memberMonthlyFee
     * 
     * @param newMonthlyFee
     */
    public void setMemberMonthlyFee(int newMonthlyFee) {
        this.monthlyFee = newMonthlyFee;
    }

} // end of class
