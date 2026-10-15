package problems;

class Mobile {
    String brand;
    int price;
    static String name;

    public void showDetails() {
        System.out.println("Brand: " + brand +" - Price: " + price + " - Name: " + name);
    }

    public static void showDetails1(Mobile mobile) {
        System.out.println("Brand: " + mobile.brand +" - Price: " + mobile.price + " - Name: " + name);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 10000;

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 9000;

        Mobile.name = "SmartPhone"; // Changing the static variable name

        Mobile.showDetails1(mobile1);
        Mobile.showDetails1(mobile2);

    }
}
