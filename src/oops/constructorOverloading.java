package oops;

public class constructorOverloading {
    private String title;
    private String author;
    private double price;

    public constructorOverloading() {
        this.title = "megha";
        this.author = "neha";
        this.price = 50.00;
    }

    public constructorOverloading(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public constructorOverloading(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

   // class test {

        public static void main(String[] args) {
            constructorOverloading co = new constructorOverloading();
            System.out.println("Book1 Title: " + co.title);
            System.out.println("Book1 Author: " + co.author);
            System.out.println("Book1 Price: " + co.price);

            constructorOverloading co1 = new constructorOverloading("mahak", "mahak2", 45.0);
            System.out.println("Book1 Title: " + co1.title);
            System.out.println("Book1 Author: " + co1.author);
            // System.out.println("Book1 Price: " + co1.price);

            constructorOverloading co2 = new constructorOverloading("viajy", "vijay2", 34.0);
            System.out.println("Book1 Title: " + co2.title);
            System.out.println("Book1 Author: " + co2.author);
             System.out.println("Book1 Price: " + co2.price);
        }
    }
