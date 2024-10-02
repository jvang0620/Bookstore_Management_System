package src;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Jai Vang
 */
public class TestHarness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creat scanner
        Scanner scanner = new Scanner(System.in);

        // Create instances
        BookStoreInventory bookStoreInventoryInstance = new BookStoreInventory();
        PricingAndPurchase pricingAndPurchaseInstance = new PricingAndPurchase();
        Books bookInstance = new Books();
        CDs cdsInstance = new CDs();
        DVDs dvdsInstance = new DVDs();

        // Creat ArrayList of memberlist
        ArrayList<Members> memberList = new ArrayList<Members>();
        ArrayList<PremiumMembers> premiumMemberList = new ArrayList<PremiumMembers>();
        ArrayList<Books> bookList = new ArrayList<Books>();
        ArrayList<CDs> cdsList = new ArrayList<CDs>();
        ArrayList<DVDs> dvdList = new ArrayList<DVDs>();

        /*
         **** FOR REFERENCE ONLY****
         * public Members(String firstName, String lastName, int totalMoneySpent, int
         * itemsPurchased, int memberID,
         * String methodOfPayment, String membershipType)
         * 
         * Creating member Objects with parameters
         */
        Members member1 = new Members("Jai", "Vang", 0, 0, 1, "Credit", "regular");
        Members member2 = new Members("Bill", "Gates", 0, 0, 2, "Debit", "regular");
        Members member3 = new Members("Tom", "Brady", 0, 0, 3, "Cash", "regular");
        // Add member objects to arraylist memberLists
        memberList.add(member1);
        memberList.add(member2);
        memberList.add(member3);
        // memberList.add(new Members("Tom", "Brady", 0, 0, 3, "Cash", "regular"));

        /*
         **** FOR REFERENCE ONLY****
         * public PremiumMembers(String firstName, String lastName, int totalMoneySpent,
         * int itemsPurchased, int memberID,
         * String methodOfPayment, String membershipType boolean hasPreiumMembership,
         * boolean paidFeeOnTime, int monthlyFee)
         * 
         * Creating premiummember object with parameters
         */
        PremiumMembers premiumMember1 = new PremiumMembers("Pa", "Vue", 0, 0, 1, "Cash", "premium", true, true, 50);
        PremiumMembers premiumMember2 = new PremiumMembers("Steph", "Curry", 0, 0, 2, "Debit", "premium", true, false,
                51);
        PremiumMembers premiumMember3 = new PremiumMembers("Tom", "Hank", 0, 0, 3, "Credit", "premium", true, false,
                52);
        // Addd premium members to arrayList premiumMemberList
        premiumMemberList.add(premiumMember1);
        premiumMemberList.add(premiumMember2);
        premiumMemberList.add(premiumMember3);
        // premiumMemberList.add(new PremiumMembers("Tom", "Hank", 0, 0, 3, "Credit",
        // "premium", true, false, 52));

        /*
         **** FOR REFERENCE ONLY****
         * 
         * public Books (String nameOfItem, String authorOfItem, int productId, int
         * priceOfItem)
         * Create book object with parameters
         */
        Books book1 = new Books("Hungry Game", "Suzanne Collins", 100, 3);
        Books book2 = new Books("Robinhood", "Howard Pyle", 101, 1);
        Books book3 = new Books("Cat in the hat", "Dr. Sues", 102, 5);
        // Add books object ito arrayList booksList
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        /*
         **** FOR REFERENCE ONLY****
         * 
         * public CDs (String nameOfItem, String authorOfItem, int productId, int
         * priceOfItem)
         * Create book object with parameters
         */
        CDs cd1 = new CDs("King Jesus", "Hillsong", 200, 6);
        CDs cd2 = new CDs("Holy Roar", "Chris Tomlin", 201, 3);
        CDs cd3 = new CDs("I Love You", "Barney", 202, 1);
        // Add cds object it arrayList booksList
        cdsList.add(cd1);
        cdsList.add(cd2);
        cdsList.add(cd3);

        /*
         **** FOR REFERENCE ONLY****
         * 
         * public CDs (String nameOfItem, String authorOfItem, int productId, int
         * priceOfItem)
         * Create dvd object with parameters
         */
        DVDs dvd1 = new DVDs("Nemo", "Pixar", 300, 1);
        DVDs dvd2 = new DVDs("Star Track", "Gene Roddenberry", 301, 6);
        DVDs dvd3 = new DVDs("Passion of Christ", "Mel Gibson", 302, 3);
        // Add dvds object to arrayList dvdList
        dvdList.add(dvd1);
        dvdList.add(dvd2);
        dvdList.add(dvd3);

        // **********************************************************************
        // **********************************************************************
        // **********************************************************************

        // Start of program
        System.out.println("Welcome! Please select 1 or 2.");
        System.out.println("\t 1. Log into system");
        System.out.println("\t 2. Exit screen");

        int input = scanner.nextInt();

        while (input < 1 || input > 2) {
            System.out.println(input + " is an invaild entry. Please enter only 1 or 2.");
            break;
        }

        while (input == 1) { // Start of first while loop

            System.out.println();
            System.out.println("Please select from the following menu of options by typing a number:");
            System.out.println("\t 1. Complete a Purchase");
            System.out.println("\t 2. Check Member's Stauts");
            System.out.println("\t 3. Compare Items"); // New Function
            System.out.println("\t 4. Register New Member"); // New Function
            System.out.println("\t 5. Restock/Add New Products Into Inventory"); // New Function
            System.out.println("\t 6. Update Price of Products");
            System.out.println("\t 7. View Inventory");
            System.out.println("\t 8. View Inventory Value"); // New Function1
            System.out.println("\t 9. Exit");

            int numberSelected = scanner.nextInt();
            switch (numberSelected) { // start of second swtich

                case 1: // 1. Complete a purchase

                    System.out.println("Enter '1' if you are a regular member");
                    System.out.println("Enter '2' if you are a premium member");
                    System.out.println("Enter '3' to return to main menu");

                    int numberSelected2 = scanner.nextInt();
                    switch (numberSelected2) {
                        case 1: // make purchase as a regular member

                            System.out.println("Please enter Member's ID number ");
                            int IDEntered = scanner.nextInt();

                            System.out.println("How many books to you want to purchase?");
                            int numberOfBooksPurchased = scanner.nextInt();

                            System.out.println("How many DVDs do you want to purchase?");
                            int numberOfDVDsPurchased = scanner.nextInt();

                            System.out.println("How many CDs do you want to purchase?");
                            int numberOfCDsPurchased = scanner.nextInt();

                            // calcuates the customer's total amount of purchase by multiplying the number
                            // of books, Dvds, and CDs with by it's price
                            pricingAndPurchaseInstance.calculatingTheCustomersTotal(numberOfBooksPurchased,
                                    numberOfDVDsPurchased,
                                    numberOfCDsPurchased);
                            // calcuates total items customer puchased
                            int totalItemPurchased = numberOfBooksPurchased + numberOfDVDsPurchased
                                    + numberOfCDsPurchased;

                            // set total in cart to int total
                            int totalSpending = pricingAndPurchaseInstance.getShoppingCartTotal();
                            System.out.println("");
                            // Display to customer what they ordered
                            System.out.println("You are purhcasing: " + numberOfBooksPurchased + " book(s), "
                                    + numberOfDVDsPurchased + " DVD(s), " + numberOfCDsPurchased + " CD(s).");
                            // Display total items member purchased
                            System.out.println(totalItemPurchased + " purchased.");
                            // Display member's total spending
                            System.out.println("Your total is $" + totalSpending);

                            // if ID input is from 1 to 10
                            if (IDEntered >= 1 && IDEntered <= 10) {
                                // Loop through arrayList memberList
                                for (Members member : memberList) {
                                    // If a member in the list has an ID number equals to user IDInput(1 through 10)
                                    if (member.getMemberID() == IDEntered) {
                                        // add previous spending with current spending
                                        int memberPreviousAndCurrentSpendingAddTogether = member
                                                .getHowMuchMoneyMemberHadSpent()
                                                + totalSpending;
                                        // Set total to member previous and current spending combined together
                                        int total = memberPreviousAndCurrentSpendingAddTogether;
                                        // update member's Spending Total
                                        member.updateMemberSpending(total);

                                        // add member's previous total items purchased to currect total items purchased
                                        int memberPreviousAndCurrentItemsPurchaseAddTogether = member
                                                .getTotalItemsPurchased() + totalItemPurchased;
                                        // Set total to member's previous and current items purchased combined togther
                                        int total2 = memberPreviousAndCurrentItemsPurchaseAddTogether;
                                        // update member total items purchased
                                        member.updateMemberTotalItemsPurchased(total2);
                                    }
                                }
                            } else {
                                System.out.println("Invaild input. Exiting to main menu."); // if input is not 1, 2, or
                                                                                            // 3.
                            }

                            System.out.println();
                            System.out.println("Your order is in. Thank you for your purchaee!");

                            // Deducts items purchase from inventory
                            bookStoreInventoryInstance.deductionOfBooksFromInventory(numberOfBooksPurchased); // deducts
                                                                                                              // books
                                                                                                              // from
                                                                                                              // inventory
                            bookStoreInventoryInstance.deductionOfDVDsFromInventory(numberOfDVDsPurchased); // deduects
                                                                                                            // DVDs from
                                                                                                            // inventory
                            bookStoreInventoryInstance.deductionOfCDsFromInventory(numberOfCDsPurchased); // deducts Cds
                                                                                                          // from
                                                                                                          // inventory

                            break; // break from case 1 of switch of case 1

                        case 2: // making purchase as a premium member

                            System.out.println("Please enter Premium Member's ID number ");
                            int IDEntered2 = scanner.nextInt();

                            System.out.println("How many books to you want to purchase?");
                            int numberOfBooksPurchased2 = scanner.nextInt();

                            System.out.println("How many DVDs do you want to purchase?");
                            int numberOfDVDsPurchased2 = scanner.nextInt();

                            System.out.println("How many CDs do you want to purchase?");
                            int numberOfCDsPurchased2 = scanner.nextInt();

                            // calcuates the customer's total amount of purchase by multiplying the number
                            // of books, Dvds, and CDs with by it's price
                            pricingAndPurchaseInstance.calculatingTheCustomersTotal(numberOfBooksPurchased2,
                                    numberOfDVDsPurchased2,
                                    numberOfCDsPurchased2);
                            // calcuates total items customer puchased
                            int totalItemPurchased2 = numberOfBooksPurchased2 + numberOfDVDsPurchased2
                                    + numberOfCDsPurchased2;

                            // set total spending 2 to shopping cart's total
                            int totalSpending2 = pricingAndPurchaseInstance.getShoppingCartTotal();
                            System.out.println("");
                            // display what comstomer just ordered
                            System.out.println("You are purhcasing: " + numberOfBooksPurchased2 + " book(s), "
                                    + numberOfDVDsPurchased2 + " DVD(s), " + numberOfCDsPurchased2 + " CD(s).");
                            // display the number of iems comstomer just ordered
                            System.out.println(totalItemPurchased2 + " purchased.");
                            // display member's total spending
                            System.out.println("Your total is $" + totalSpending2); // prints out purchase total.

                            // if ID input is from 1 to 10
                            if (IDEntered2 >= 1 && IDEntered2 <= 10) {
                                // Loop through arrayList memberList
                                for (PremiumMembers premiumMember : premiumMemberList) {
                                    // If a premium member in the list has an ID number equals to user IDInput(1
                                    // through 10)
                                    if (premiumMember.getMemberID() == IDEntered2) {
                                        // add previous spending with current spending
                                        int memberPreviousAndCurrentSpendingAddTogether = premiumMember
                                                .getHowMuchMoneyMemberHadSpent()
                                                + totalSpending2;
                                        // Set total to member's previous and current spending combined together
                                        int total = memberPreviousAndCurrentSpendingAddTogether;
                                        // update member's Spending Total
                                        premiumMember.updateMemberSpending(total);

                                        // add previous items purchased to current items purchased
                                        int memberPrviousAndCurrentItemsPurchaseAddTogether = premiumMember
                                                .getTotalItemsPurchased() + totalItemPurchased2;
                                        // set total2 to member's previous and current items purchased
                                        int total2 = memberPrviousAndCurrentItemsPurchaseAddTogether;
                                        // Update member's total items purchased
                                        premiumMember.updateMemberTotalItemsPurchased(total2);
                                    }
                                }
                            } else { // if user input is not 1 through
                                     // Print this message
                                System.out.println("Invaild input. Exiting to main menu.");
                            }

                            System.out.println();
                            // At the end, print statment telling user order is in, and thank you for your
                            // purchased.
                            System.out.println("Your order is in. Thank you for your purchaee!");

                            // Deducts items purchase from inventory
                            bookStoreInventoryInstance.deductionOfBooksFromInventory(numberOfBooksPurchased2); // deducts
                                                                                                               // books
                                                                                                               // from
                                                                                                               // inventory
                            bookStoreInventoryInstance.deductionOfDVDsFromInventory(numberOfDVDsPurchased2); // deduects
                                                                                                             // DVDs
                                                                                                             // from
                                                                                                             // inventory
                            bookStoreInventoryInstance.deductionOfCDsFromInventory(numberOfCDsPurchased2); // deducts
                                                                                                           // Cds from
                                                                                                           // inventory

                            break; // break from case 2 of switch of case 1

                        case 3:
                            System.out.println("You selected to return to main menu.");
                            break; // break from case 3 of switch of case 1

                        default:
                            // Print this if user enter an invalid number
                            System.out.println("Invalid entry. Exiting to main menu.");
                    }
                    break; // break from case 1

                case 2: // 2. Check member's stauts

                    System.out.println("Enter '1' to check regular member's stauts");
                    System.out.println("Enter '2' to check premium member's stauts");
                    System.out.println("Enter '3' to return to main menu");

                    int selection = scanner.nextInt();
                    switch (selection) {
                        case 1: // checking regular member's stauts
                            System.out.println("Enter member's ID number");
                            int IDInput = scanner.nextInt();

                            // If ID input is between 1 through 10
                            if (IDInput >= 1 && IDInput <= 10) {
                                // Loop through arrayList memberList
                                for (Members member : memberList) {
                                    // If a member in the list ID number equals to user IDInput(1 through 10)
                                    if (member.getMemberID() == IDInput) {
                                        System.out.println(
                                                member.getFirstNameOfMember() + " " + member.getLastNameOfMemeber()
                                                        + " has " + member.getMembershipType() + " membership");
                                        System.out.println(member.getFirstNameOfMember() + " "
                                                + member.getLastNameOfMemeber() + " total spending is $"
                                                + member.getHowMuchMoneyMemberHadSpent());
                                        System.out.println(
                                                member.getFirstNameOfMember() + " " + member.getLastNameOfMemeber()
                                                        + " purchased " + member.getTotalItemsPurchased() + " items");
                                        System.out.println(
                                                member.getFirstNameOfMember() + " " + member.getLastNameOfMemeber()
                                                        + " ID number is " + member.getMemberID());
                                        System.out.println(
                                                member.getFirstNameOfMember() + " " + member.getLastNameOfMemeber()
                                                        + " method of payment is " + member.getMemberPaymentMethod());
                                    }
                                }
                            } else { // if user did not input number from 1 through 10
                                System.out.println("Invalid entry. Returning the main menu.");
                            }
                            break; // break from case 1

                        case 2: // checking premium member's stauts
                            System.out.println("Enter premium member's ID number");
                            int IDInput2 = scanner.nextInt();

                            // If ID input is between 1 through 10
                            if (IDInput2 >= 1 && IDInput2 <= 10) {
                                // Loop through arrayList premiumMemberList
                                for (PremiumMembers premiumMember : premiumMemberList) {
                                    // If a member in the list ID number equals to user IDInput(1 through 10)
                                    if (premiumMember.getMemberID() == IDInput2) {

                                        // And if new member premium membership is true
                                        if (premiumMember.isAPremiumMember() == true) {
                                            // print member first and last name and state that member has premium
                                            // membership
                                            System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                    + premiumMember.getLastNameOfMemeber() + " has "
                                                    + premiumMember.getMembershipType() + " membership.");
                                        } else {
                                            // If not true, print that member is not premium member
                                            System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                    + premiumMember.getLastNameOfMemeber()
                                                    + " does not have Premium Membership");
                                        }

                                        // These prints also in loop
                                        System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                + premiumMember.getLastNameOfMemeber() + " total spending is $"
                                                + premiumMember.getHowMuchMoneyMemberHadSpent());
                                        System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                + premiumMember.getLastNameOfMemeber() + " purchased "
                                                + premiumMember.getTotalItemsPurchased() + " items");
                                        System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                + premiumMember.getLastNameOfMemeber() + " ID number is "
                                                + premiumMember.getMemberID());
                                        System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                + premiumMember.getLastNameOfMemeber() + " method of payment is "
                                                + premiumMember.getMemberPaymentMethod());

                                        // if premium member has not pay fee on time
                                        if (premiumMember.isFeePaidOnTime() != true) // if the fee due for new member is
                                                                                     // NOT TRUE
                                        {
                                            // print that fee is due and needs to be pay ASAP
                                            System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                    + premiumMember.getLastNameOfMemeber()
                                                    + " fee is due. Needs to pay ASAP"); // this prints
                                        } else {
                                            // If true, print that premium member had pay fee.
                                            System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                    + premiumMember.getLastNameOfMemeber() + " has paid fee."); // otherwise,
                                                                                                                // this
                                                                                                                // prints
                                        }

                                        System.out.println(premiumMember.getFirstNameOfMember() + " "
                                                + premiumMember.getLastNameOfMemeber() +
                                                " monthly method is $" + premiumMember.getMemberMonthlyFee());
                                    }
                                }
                            }
                            break; // break from case 2 of switch of case 2

                        case 3:
                            System.out.println("You selected to return to main menu.");
                            break; // break from case 3 of switch of case 2

                        default:
                            // Print this if user enter an invalid number
                            System.out.println("Invalid entry. Exiting to main menu.");

                    }
                    break; // break from case 2

                case 3: // compare items

                    System.out.println();
                    System.out.println("Select from the following:");
                    System.out.println("Enter '1' to compare the price of book with the price of CD");
                    System.out.println("Enter '2' to compare the price of book with the price of DVD");
                    System.out.println("Enter '3' to compare the price of CD with the price of DVD");
                    System.out.println("Enter '4' to compare the price of CD with Book");
                    System.out.println("Enter '5' to compare the price of DVD with the price of Book");
                    System.out.println("Enter '6' to compare the price of DVD with the price of CD");
                    System.out.println("Enter '7' to return to main menu");

                    int numberEntered = scanner.nextInt();
                    switch (numberEntered) {
                        case 1: // Compare the price of book with price of CD
                            System.out.println();
                            System.out.println("You are comparing the price of book to the price of CD");
                            System.out
                                    .println("Will return '1' if the price of book is greater than the price of CD. ");
                            System.out.println("Will return '-1' if the price of book is less than the price of CD. ");
                            System.out.println("WIll return '0' if price of book and CD are equal. ");
                            System.out.println();
                            /*
                             * Books bookInstance = new Books();
                             * CDs cdsInstance = new CDs();
                             * DVDs dvdsInstance = new DVDs();
                             * 
                             * Books book1 = new Books("Hungry Game", "Suzanne Collins", 100, 3);
                             * Books book2 = new Books("Robinhood", "Howard Pyle", 101, 1);
                             * Books book3 = new Books("Cat in the hat", "Dr. Sues", 102, 5);
                             * 
                             * CDs cd1 = new CDs("King Jesus", "Hillsong", 200, 6);
                             * CDs cd2 = new CDs("Holy Roar", "Chris Tomlin", 201, 3);
                             * CDs cd3 = new CDs("I Love You", "Barney", 202, 1);
                             * 
                             * DVDs dvd1 = new DVDs("Nemo", "Pixar", 300, 1);
                             * DVDs dvd2 = new DVDs("Star Track", "Gene Roddenberry", 301, 6);
                             * DVDs dvd3 = new DVDs("Passion of Christ", "Mel Gibson", 302, 3);
                             */

                            // Compare book price to cds price
                            int compareItem = book3.compareTo(cd1); // can use cd1, cd2 or cd3 in parameter
                            switch (compareItem) {
                                case 1 -> System.out.println("Return: '" + compareItem
                                        + "' because the price of book is greater than price of CD");
                                case -1 -> System.out.println("Return: '" + compareItem
                                        + "' because the price of book is less than price of CD");
                                default -> System.out.println(
                                        "Return: '" + compareItem + "' because the price of book and CD are equal.");
                            }
                            break; // Creak from case 1 of switch of case 7

                        case 2: // Compare the price of book with price of DVD
                            System.out.println();
                            System.out.println("You are comparing the price of book to the price of DVD");
                            System.out
                                    .println("Will return '1' if the price of book is greater than the price of DVD. ");
                            System.out.println("Will return '-1' if the price of book is less than the price of DVD. ");
                            System.out.println("WIll return '0' if price of book and DVD are equal. ");
                            System.out.println();

                            // Compare book price to dvd price
                            int compareItem2 = bookInstance.compareTo(dvd1); // Can use dvd1, dvd2, or dvd3 in parameter
                            switch (compareItem2) {
                                case 1 -> System.out.println("Return: '" + compareItem2
                                        + "' because the price of book is greater than price of DVD");
                                case -1 -> System.out.println("Return: '" + compareItem2
                                        + "' because the price of book is less than price of DVD");
                                default -> System.out.println(
                                        "Return: '" + compareItem2 + "' because the price of book and DVD are equal.");
                            }
                            break; // Break form case 2 of switch of case 7

                        case 3: // Compare the price of CD with the price of DVD
                            System.out.println();
                            System.out.println("You are comparing the price of CD to the price of DVD");
                            System.out.println("Will return '1' if the price of CD is greater than the price of DVD. ");
                            System.out.println("Will return '-1' if the price of CD is less than the price of DVD. ");
                            System.out.println("WIll return '0' if price of CD and DVD are equal. ");
                            System.out.println();

                            // Compare CD price to DVD price
                            int compareItem3 = cdsInstance.compareTo(dvd2); // Can use dvd1, dvd2, or dvd3 in parameter
                            switch (compareItem3) {
                                case 1 -> System.out.println("Return: '" + compareItem3
                                        + "' because the price of CD is greater than price of DVD");
                                case -1 -> System.out.println("Return: '" + compareItem3
                                        + "' because the price of CD is less than price of DVD");
                                default -> System.out.println(
                                        "Return: '" + compareItem3 + "' because the price of CD and DVD are equal.");
                            }
                            break; // Bfeak from case 3 of switch of case 7

                        case 4: // Compare the price of CD to the price of Book
                            System.out.println();
                            System.out.println("You are comparing the price of CD to the price of Book");
                            System.out
                                    .println("Will return '1' if the price of CD is greater than the price of Book. ");
                            System.out.println("Will return '-1' if the price of CD is less than the price of Book. ");
                            System.out.println("WIll return '0' if price of CD and Book are equal. ");
                            System.out.println();

                            // Compare CD price to Book price
                            int compareItem4 = cdsInstance.compareTo(book2); // Can use book1, book2 or book3 in
                                                                             // parameter
                            switch (compareItem4) {
                                case 1 -> System.out.println("Return: '" + compareItem4
                                        + "' because the price of CD is greater than price of Book");
                                case -1 -> System.out.println("Return: '" + compareItem4
                                        + "' because the price of CD is less than price of BOok");
                                default -> System.out.println(
                                        "Return: '" + compareItem4 + "' because the price of CD and Book are equal.");
                            }
                            break; // Break from case 4 of switch of case 7

                        case 5: // Compare the price of DVD to the price of Book
                            System.out.println();
                            System.out.println("You are comparing the price of DVD to the price of Book");
                            System.out
                                    .println("Will return '1' if the price of DVD is greater than the price of Book. ");
                            System.out.println("Will return '-1' if the price of DVD is less than the price of Book. ");
                            System.out.println("WIll return '0' if price of DVD and Book are equal. ");
                            System.out.println();

                            // Compare DVD price to Book price
                            int compareItem5 = dvdsInstance.compareTo(book3); // Can use book1, book2 or book3 in
                                                                              // parameter
                            switch (compareItem5) {
                                case 1 -> System.out.println("Return: '" + compareItem5
                                        + "' because the price of DVD is greater than price of Book");
                                case -1 -> System.out.println("Return: '" + compareItem5
                                        + "' because the price of DVD is less than price of BOok");
                                default -> System.out.println(
                                        "Return: '" + compareItem5 + "' because the price of DVD and Book are equal.");
                            }
                            break; // Break from case 5 of switch of case 7

                        case 6: // Compare the price of DVD to the price of CD
                            System.out.println();
                            System.out.println("You are comparing the price of DVD to the price of CD");
                            System.out.println("Will return '1' if the price of DVD is greater than the price of CD. ");
                            System.out.println("Will return '-1' if the price of DVD is less than the price of CD. ");
                            System.out.println("WIll return '0' if price of DVD and CD are equal. ");
                            System.out.println();

                            // Compare DVD price to CD price
                            int compareItem6 = dvdsInstance.compareTo(cd1); // Can use cd1, cd2, or cd3 in parameter
                            switch (compareItem6) {
                                case 1 -> System.out.println("Return: '" + compareItem6
                                        + "' because the price of DVD is greater than price of CD");
                                case -1 -> System.out.println("Return: '" + compareItem6
                                        + "' because the price of DVD is less than price of CD");
                                default -> System.out.println(
                                        "Return: '" + compareItem6 + "' because the price of DVD and CD are equal.");
                            }

                            break; // Break from case 6 of switch of case 7

                        case 7:
                            System.out.println("You selected to return to main menu.");
                            break; // break from case 7 of switch of case 7

                        default:
                            // Print this if user enter an invalid number
                            System.out.println("Invalid entry. Exiting to main menu.");

                    } // end of switch in case 7

                    break; // break from case 3

                case 4: // Register New Member
                    System.out.println();
                    System.out.println("Are you registering a new regular member or a premium member?");
                    System.out.println("Enter '1' to register new regular member");
                    System.out.println("Enter '2' to register new premium member");
                    System.out.println("Enter '3' to return to main menu");

                    int numberChosen = scanner.nextInt();

                    switch (numberChosen) {

                        case 1: // Register new regular member
                            System.out.println("Enter new member first name ");
                            String newFirstName = scanner.next();
                            System.out.println("Enter new member last name ");
                            String newLastName = scanner.next();
                            System.out.println("Enter new member total spending ");
                            int newTotalSpending = scanner.nextInt();
                            System.out.println("Enter total items purchased ");
                            int newTotalItemsPurchased = scanner.nextInt();
                            System.out.println("Enter new member ID. Pick a number from 4 to 10 ");
                            int newID = scanner.nextInt();
                            System.out
                                    .println("Enter new member method of payment. Enter 'Credit', 'Debit', or 'Cash'.");
                            String newMethodPayment = scanner.next();
                            System.out.println("Enter 'regular' ");
                            String newMembershipType = scanner.next();

                            // Create new member object(Members instance)
                            Members newMember = new Members(newFirstName, newLastName, newTotalSpending,
                                    newTotalItemsPurchased,
                                    newID, newMethodPayment, newMembershipType);

                            // Add new member into ArrayList memberList
                            // memberList.add(new Members(newFirstName, newLastName,
                            // newTotalSpending,newTotalItemsPurchased,
                            // newID,newMethodPayment, newMembershipType));
                            memberList.add(newMember);
                            System.out.println();
                            System.out.println("New regular member, " + newMember.getFirstNameOfMember() + " "
                                    + newMember.getLastNameOfMemeber() +
                                    ", had just been added.");

                            break; // Break from case 1 of switch of case 4

                        case 2: // Register new Premium member

                            System.out.println("Enter new member first name ");
                            String newFirstName2 = scanner.next();
                            System.out.println("Enter new member last name ");
                            String newLastName2 = scanner.next();
                            System.out.println("Enter new member total spending ");
                            int newTotalSpending2 = scanner.nextInt();
                            System.out.println("Enter total items purchased ");
                            int newTotalItemsPurchased2 = scanner.nextInt();
                            System.out.println("Enter new premium member ID. Pick a number from 4 to 10 ");
                            int newID2 = scanner.nextInt();
                            System.out
                                    .println("Enter new member method of payment. Enter 'Credit', 'Debit', or 'Cash'.");
                            String newMethodPayment2 = scanner.next();
                            System.out.println("Enter 'premium' ");
                            String newMembershipType2 = scanner.next();
                            System.out.println("Does member have premium membership? Enter 'true' or 'false'.");
                            boolean hasPremiumMembershp = scanner.nextBoolean();
                            System.out.println("Is new member fee paid on time? Enter 'true' or 'false'.");
                            boolean isPaidFeeOnTime = scanner.nextBoolean();
                            System.out.println("Enter new member monthly fee");
                            int monthlyFee = scanner.nextInt();

                            // Create new premium object(a Premium Member instance)
                            PremiumMembers newPremiumMember = new PremiumMembers(newFirstName2, newLastName2,
                                    newTotalSpending2, newTotalItemsPurchased2,
                                    newID2, newMethodPayment2, newMembershipType2, hasPremiumMembershp, isPaidFeeOnTime,
                                    monthlyFee);

                            // Add new premium member into ArrayList premiumMemberList
                            premiumMemberList.add(newPremiumMember);
                            System.out.println();
                            System.out.println("New premium member, " + newPremiumMember.getFirstNameOfMember() + " "
                                    + newPremiumMember.getLastNameOfMemeber() + ", had just been added.");
                            break; // break from case 2 of switch of case 4

                        case 3:
                            System.out.println("You selected to return to main menu.");
                            break; // break from case 3 of switch of case 4

                        default: // if user enter another number
                            System.out.println("Invalid entry. Exiting to main menu.");
                    } // end of switch for case 4

                    break; // break from case 4

                case 5: // Restock/Add new products into inventory //Implement restockProduct(int
                        // productId, int amount) and inventoryVaule methods
                    System.out.println("Enter '1' to add to inventory WITHOUT item's title, author, and Product ID");
                    System.out.println("Enter '2' to add to inventory with item's name, author, product ID, and price");
                    System.out.println("Enter '3' to return to main menu");
                    System.out.println();

                    int numEntered = scanner.nextInt();
                    switch (numEntered) { // start of second swtich
                        case 1: // Add to inventory without item's title, author, and Product ID
                            System.out.println("Enter the number of books recieved");
                            int booksRecieved = scanner.nextInt();

                            System.out.println("Enter the number of CDs received");
                            int CDsReceived = scanner.nextInt();

                            System.out.println("Enter the number of DVDs recieved");
                            int DVDsRecieved = scanner.nextInt();

                            // Update inventory
                            bookStoreInventoryInstance.updateCurrentInventory(booksRecieved, CDsReceived, DVDsRecieved);
                            // Display inventory
                            bookStoreInventoryInstance.displayBookStoreInventory();

                            System.out.println(
                                    "The total inventory value is: $" + bookStoreInventoryInstance.inventoryValue());
                            System.out.println("Enter '1' if you want to view the Inventory Value Display");
                            System.out.println("Enter '2' to return to main menu");

                            int numEntry = scanner.nextInt();
                            if (numEntry == 1) {
                                // diplay inventory value
                                bookStoreInventoryInstance.displayInventoryValue();
                            } else {
                                break;
                            }

                            break; // break from case 1 of switch in case 5

                        case 2: // Add to inventory with item's title, author, and Product ID
                            System.out.println("Which item do you want to add into the inventory?");
                            System.out.println("Enter '1' for Book");
                            System.out.println("Enter '2' for CDs");
                            System.out.println("Enter '3' for DVDs");
                            System.out.println("Enter '4' to return to main menu");
                            int numberEntered1 = scanner.nextInt();

                            // If user input is 1
                            if (numberEntered1 == 1) {

                                // Set amount to zero
                                int amount = 0;

                                System.out.println("Enter book's name. ");
                                String booksName = scanner.next();
                                booksName += scanner.nextLine();

                                System.out.println("Enter author's name");
                                String bookAuthorsName = scanner.nextLine();
                                System.out.println("Enter Product ID. Choose a number from 104 to 199");
                                int bookProductID = scanner.nextInt();
                                System.out.println("Enter price of item");
                                int priceOfBook = scanner.nextInt();

                                // Create newBook object(A Books instance)
                                Books newBook = new Books(booksName, bookAuthorsName, bookProductID, priceOfBook);
                                // And new book to arrayList bookList
                                bookList.add(newBook);

                                System.out.println();
                                System.out.println("The book titled " + newBook.getNameOfItem() + " by author "
                                        + newBook.getAuthorOfItem() +
                                        " with a Product ID of " + newBook.getProductId() + " and priced at $"
                                        + newBook.getPriceOfItem() +
                                        " has just been added into the inventory.");

                                // increment amount by one
                                amount++;
                                // add new book into inventory
                                bookStoreInventoryInstance.restockProduct(bookProductID, amount);
                                // display book store inventory
                                bookStoreInventoryInstance.displayBookStoreInventory();
                                // Print out total inventory value
                                System.out.println("The total inventory value is: $"
                                        + bookStoreInventoryInstance.inventoryValue());

                                // Ask user whether or not they want to view inventory value display
                                System.out.println("Enter '1' if you want to view the Inventory Value Display");
                                System.out.println("Enter '2' to return to main menu");
                                int numEntry2 = scanner.nextInt();
                                if (numEntry2 == 1) {
                                    // display inventory value
                                    bookStoreInventoryInstance.displayInventoryValue();
                                } else { // if they don't want to view, break from loop.
                                    break;
                                }
                            }
                            // If user input is 2
                            else if (numberEntered1 == 2) {

                                // Set amount to zero
                                int amount = 0;

                                System.out.println("Enter CD's name");
                                String cdsName = scanner.next();
                                cdsName += scanner.nextLine();

                                System.out.println("Enter artist's name");
                                String cdsAuthorsName = scanner.nextLine();
                                System.out.println("Enter Product ID. Choose a number from 204 to 299");
                                int cdsProductID = scanner.nextInt();
                                System.out.println("Enter price of item");
                                int priceOfCd = scanner.nextInt();

                                // Create newCds object(A CDs instance)
                                CDs newCds = new CDs(cdsName, cdsAuthorsName, cdsProductID, priceOfCd);
                                // Add new CD to arrayList cdsList
                                cdsList.add(newCds);

                                System.out.println();
                                System.out.println("The CD titled " + newCds.getNameOfItem() + " by artist "
                                        + newCds.getAuthorOfItem() +
                                        " with a Product ID of " + newCds.getProductId() + " and priced at $"
                                        + newCds.getPriceOfItem() +
                                        " has just been added into the inventory.");

                                // Increment amount by one
                                amount++;
                                // Add new CD is inventory
                                bookStoreInventoryInstance.restockProduct(cdsProductID, amount);
                                // Display Book Store inventory
                                bookStoreInventoryInstance.displayBookStoreInventory();
                                // Print total inventory value
                                System.out.println("The total inventory value is: $"
                                        + bookStoreInventoryInstance.inventoryValue());

                                // Ask whether or not user want to view the display of inventory value
                                System.out.println("Enter '1' if you want to view the Inventory Value Display");
                                System.out.println("Enter '2' to return to main menu");
                                int numEntry3 = scanner.nextInt();
                                if (numEntry3 == 1) {
                                    // Display inventory value
                                    bookStoreInventoryInstance.displayInventoryValue();
                                } else { // if they don't want to view, break from loop.
                                    break;
                                }
                            }
                            // If user input is 3
                            else if (numberEntered1 == 3) {

                                // set amount to zero
                                int amount = 0;

                                System.out.println("Enter DVD's name.");
                                String dvdName = scanner.next();
                                dvdName += scanner.nextLine();

                                System.out.println("Enter author's name");
                                String dvdAuthorName = scanner.nextLine();
                                System.out.println("Enter Proudct ID. Choose a number from 304 to 399");
                                int dvdProductId = scanner.nextInt();
                                System.out.println("Enter price of item");
                                int priceOfDvd = scanner.nextInt();

                                // Create newDvd object(A DVDs instance)
                                DVDs newDvd = new DVDs(dvdName, dvdAuthorName, dvdProductId, priceOfDvd);
                                // Add newDvd to arrayList dvdList
                                dvdList.add(newDvd);

                                System.out.println();
                                System.out.println("The DVD titled " + newDvd.getNameOfItem() + " by author "
                                        + newDvd.getAuthorOfItem() +
                                        " with a Product ID of " + newDvd.getProductId() + " and priced at $"
                                        + newDvd.getPriceOfItem() +
                                        " has just been added into the inventory.");

                                // Increment amount by 1
                                amount++;
                                // add newDVDs into inventory
                                bookStoreInventoryInstance.restockProduct(dvdProductId, amount);
                                // Display BookStore Inventory
                                bookStoreInventoryInstance.displayBookStoreInventory();
                                // Print inventory value
                                System.out.println("The total inventory value is: $"
                                        + bookStoreInventoryInstance.inventoryValue());

                                // Ask if user want to view the display of inventory value
                                System.out.println("Enter '1' if you want to view the Inventory Value Display");
                                System.out.println("Enter '2' to return to main menu");
                                int numEntry4 = scanner.nextInt();
                                if (numEntry4 == 1) {
                                    // display inventory value
                                    bookStoreInventoryInstance.displayInventoryValue();
                                } else { // If user don't want to view display inventory value, break from loop
                                    break;
                                }
                            }

                            else if (numberEntered1 == 4) { // Return to main menu
                                System.out.println("You selected to return to main menu.");
                            }

                            // If user enter a different value, this message will occur and will break them
                            // from the loop
                            else {
                                System.out.println("Invalid entry. Exiting to main menu.");
                                break;
                            }
                        case 3:
                            System.out.println("You selected to return to main menu.");
                            break; // break from case 3 of switch of case 5

                        default:
                            // Print this if user enter an invalid number
                            System.out.println("Invalid entry. Exiting to main menu.");
                    }// end of switch in case 4

                    break; // break from case 5

                case 6: // Updating Prices
                    // display the prices of all items
                    pricingAndPurchaseInstance.displayPricesOfAllItems();

                    System.out.println("What would you like to do?");
                    System.out.println("Enter '1' to update the price of Book");
                    System.out.println("Enter '2' to update the price of CD");
                    System.out.println("Enter '3' to update the price of DVD");
                    System.out.println("Enter '4' to update all prices of items");
                    System.out.println("Enter '5' to returm to main menu");

                    int scanInput = scanner.nextInt();
                    switch (scanInput) {

                        case 1: // update price of book
                            System.out.println("Enter new price for the books");
                            int newBookPrice = scanner.nextInt();

                            // Update the price of book
                            pricingAndPurchaseInstance.updateBookPrice(newBookPrice);
                            System.out.println();
                            System.out.println("Pricing for book has been updated");

                            // redisplay the prices of all items
                            pricingAndPurchaseInstance.displayPricesOfAllItems();

                            break; // break from case 1 of switch of case 6

                        case 2: // update price of CD
                            System.out.println("Enter new price for the CDs");
                            int newCDsPrice = scanner.nextInt();

                            // Update the price of CD
                            pricingAndPurchaseInstance.updateCDPrice(newCDsPrice);
                            System.out.println();
                            System.out.println("Pricing for CD has been updated");

                            // redisplay the prices of all items
                            pricingAndPurchaseInstance.displayPricesOfAllItems();

                            break; // break from case 2 of switch of case 6

                        case 3: // update price of DVD
                            System.out.println("Enter the new price for the DVDs");
                            int newDVDsPrice = scanner.nextInt();

                            // Update the price of DVD
                            pricingAndPurchaseInstance.updateDVDPrice(newDVDsPrice);
                            System.out.println();
                            System.out.println("Pricing for DVD has been updated");

                            // redisplay the prices of all items
                            pricingAndPurchaseInstance.displayPricesOfAllItems();

                            break; // break from case 3 of switch of case 6

                        case 4: // update all prices of items

                            System.out.println("Enter new price for the books");
                            int newBookPrice2 = scanner.nextInt();

                            System.out.println("Enter new price for the CDs");
                            int newCDsPrice2 = scanner.nextInt();

                            System.out.println("Enter the new price for the DVDs");
                            int newDVDsPrice2 = scanner.nextInt();

                            // updates all prices
                            pricingAndPurchaseInstance.updateAllItemsPricing(newBookPrice2, newCDsPrice2,
                                    newDVDsPrice2);
                            System.out.println();

                            System.out.println("Pricing for all items has been updated");
                            // redisplay the prices of all items
                            pricingAndPurchaseInstance.displayPricesOfAllItems();

                            break; // break from case 4 of switch of case 6

                        case 5: // return to main menu
                            System.out.println("You selected to return to main menu.");
                            break; // brak from case 5 of switch of case 6

                        default:
                            // Print this if user enter an invalid number
                            System.out.println("Invalid entry. Exiting to main menu.");
                    } // End of switch cases

                    break; // break from case 6

                case 7: // View Inventory
                    System.out.println("What would you like to view?");
                    System.out.println("Enter '1' to view Book's inventory");
                    System.out.println("Enter '2' to view CD's inventory");
                    System.out.println("Enter '3' to view DVD's inventory");
                    System.out.println("Enter '4' to view full inventory");
                    System.out.println("Enter '5' to return to main menu.");
                    int numberChoice = scanner.nextInt();

                    switch (numberChoice) { // start of switch inside case 3
                        case 1:
                            // display inventory of books
                            bookStoreInventoryInstance.displayBooksTotalInInventory();
                            break;

                        case 2:
                            // display inventory of CDs
                            bookStoreInventoryInstance.displayCDsTotalInInventory();
                            break;

                        case 3:
                            // display inventory of DVDs
                            bookStoreInventoryInstance.displayDVDsTotalInInventory();
                            break;

                        case 4:
                            // display overall inventory of books, CDs, and DVDs
                            bookStoreInventoryInstance.displayBookStoreInventory();
                            break;

                        case 5:
                            // Break from switch case
                            break;

                        default:
                            // Print this message if user enter incorrect number.
                            System.out.println("Invalid entry. Exiting to main menu.");

                    } // end of switch inside case 7

                    break; // end of case 6

                case 8: // View inventory value

                    // Display inventory value
                    bookStoreInventoryInstance.displayInventoryValue();

                    break; // Break from case 8

                case 9: // Exit program.
                    System.out.println("You selected to exit main menu. Bye bye!");
                    System.exit(0);
                    break; // break from case 6

                default:
                    // If user entered another number, program will exit and this will display.
                    System.out.println("Invalid entry. Exiting to main menu.");

            } // end of second switch

            scanner.close(); // close scanner

            while (input == 2) { // Exit. Don't loop program.
                System.exit(0);
                break;
            }

        } // end of first while loop

    } // end of main method

} // end of class
