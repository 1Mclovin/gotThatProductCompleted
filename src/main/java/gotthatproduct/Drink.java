package gotthatproduct;

public abstract class Drink extends Product implements Consumable{
    public Drink(String name, double price) {
        super(name, price);

    }

    @Override
    public void calculateDiscount(Product product) {
        double v = getDISCOUNT_RATE()+ 0.20 * getPrice();
        System.out.println(v);

    }
}
