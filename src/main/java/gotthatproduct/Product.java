package gotthatproduct;

import java.util.ArrayList;

public abstract class Product {

    private String name;
private double price;
protected ExpirationDate expirationDate;

// since it is in all caps it is a constant
public final double DISCOUNT_RATE = 0.10;
// now the constructor
public Product(String name, double price){
this.name=name;
this.price=price;
}
// this method takes in the Product as a parameter
public void printExpirationDate(Product product){
    System.out.println(product.getName()+" expires: on "+product.getExpirationDate());

}
// this method contains an array return-type
public String[] printIngredients(String[] ingredients){

return null;
}
public static void printConsumptionQty(ArrayList<Consumable> consumables){

    for (Consumable c:consumables) {
        //logic goes here

        System.out.println(c.consume());
    }
}


    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public abstract void calculateDiscount(Product product);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDISCOUNT_RATE() {
        return DISCOUNT_RATE;
    }

    public void printIngrediants(String[] ingredients){
        System.out.println(ingredients);

    }

   //lets fukkkiiing goooooooo!!!!
    public static void printOrder(ArrayList<Product>products){

        for(Product p : products){

            System.out.println(p.getName()+" will cost you "+ p.getPrice());
        }
    }

}
