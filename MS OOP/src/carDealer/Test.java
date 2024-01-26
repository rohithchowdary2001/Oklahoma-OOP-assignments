package carDealer;

public class Test {

    public static void main(String[] args) {
        Dealer dealer;
        Car car;
        dealer = new Dealer("Rohith's car zone", "Edmond,OK");
        Car car1 = new Car("df12nbv34b5b45", "TATA", "altoz", 1976, "maroon", 5);
        dealer.addCar(car1);
        Car car2 = new Car("bm3fg55nbh344", "Renoult", "duster", 1987, "gray", 10);
        dealer.addCar(car2);
        Car car3 = new Car("djs4n45ddg2n4", "Mahindra", "xuv800", 2001, "green", 15);
        dealer.addCar(car3);
        Car car4 = new Car("df84nwc543cwd", "Tayota", "innova", 1966, "red", 20);
        dealer.addCar(car4);

        System.out.println(dealer+"\n");
        for (int i = 0; i < dealer.getcarCount(); i++) {
            System.out.println(dealer.getCars()[i]);
        }
        System.out.println("\n");
        double totalPrice = dealer.getTotalPrice();
        System.out.println("Total Price of all cars: $" + totalPrice+"\n");

        dealer.removeCar(car3);

        System.out.println(dealer+"\n");
        for (int i = 0; i < dealer.getcarCount(); i++) {
            System.out.println(dealer.getCars()[i]);
        }
        System.out.println("\n");
        totalPrice = dealer.getTotalPrice();
        System.out.println("Total Price of all cars: $" + totalPrice);
    }
}

