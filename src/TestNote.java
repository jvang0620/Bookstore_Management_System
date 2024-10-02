package src;

public class TestNote {
    public static void main(String[] args) {

        Books bookInstance = new Books();
        CDs cdInstance = new CDs();
        DVDs dvdInstance = new DVDs();

        int booksPrice = bookInstance.getPriceOfItem();
        int cdsPrice = cdInstance.getPriceOfItem();
        int dvdPrice = dvdInstance.getPriceOfItem();

        System.out.println("The price of book is $" + booksPrice);
        System.out.println("The price of cd is $" + cdsPrice);
        System.out.println("The price of dvd is $" + dvdPrice);

        /*
         * Need to figure out why price is zero
         */
    }

}
