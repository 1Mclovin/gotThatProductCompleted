package gotthatproduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductTester {
    public static void main(String[] args) {

        Batteries batteries = new Batteries("Duracell",7.99);
        CocaCola cocaCola= new CocaCola("Coke", 1.99);
        CheeseBurger cheeseBurger = new CheeseBurger("Big-Mac", 7.50);
        Car car = new Car("Toyota Supra",59000.00);

        // create an array of ingredients
        String ingredients[]={"Ketchup","lettuce","Meat","Sugar"};



       // Consumable[] consumables = {batteries, cocaCola, cheeseBurger};
        ArrayList<Consumable>consumables= new ArrayList<>();
       consumables.add(batteries);
       consumables.add(cocaCola);
       consumables.add(cheeseBurger);

       ArrayList<Product>products = new ArrayList<>();
       products.add(car);
       products.add(batteries);
       products.add(cocaCola);
       products.add(cheeseBurger);

        System.out.println("========Expiration dates for consumable products=========");

        ExpirationDate batteryExpiration = new ExpirationDate("January", "7","2023");
      batteries.setExpirationDate(batteryExpiration);
      batteries.printExpirationDate(batteries);

      ExpirationDate cheeseBurgerExpiration = new ExpirationDate("March", "21","2022");
      cheeseBurger.setExpirationDate(cheeseBurgerExpiration);
      cheeseBurger.printExpirationDate(cheeseBurger);

      ExpirationDate cocaColaexpirationDate = new ExpirationDate("August","10","2029");
      cocaCola.setExpirationDate(cocaColaexpirationDate);
      cocaCola.printExpirationDate(cocaCola);

        System.out.println("============================================");

      Product.printOrder(products);

        System.out.println("=============Consumption Quantity===========");
      Product.printConsumptionQty(consumables);

        System.out.println("=======calculate discount for products======");
        cheeseBurger.calculateDiscount(cheeseBurger);
        cocaCola.calculateDiscount(cocaCola);
        batteries.calculateDiscount(batteries);

        System.out.println("================= Is edible ===============");
        System.out.println( cheeseBurger.isEdible());

        System.out.println("============== consume =============");

        Drink drink = new CocaCola("generic soda",1.00);

        System.out.println( drink.consume());

        System.out.println("============Print Ingredients=========");

        System.out.println(Arrays.toString(ingredients));


    }
}
