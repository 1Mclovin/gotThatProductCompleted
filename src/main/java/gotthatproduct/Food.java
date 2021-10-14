package gotthatproduct;

public abstract class Food extends Product implements Consumable, Edible{

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public void calculateDiscount(Product product) {
        double v = getDISCOUNT_RATE()+0.10 * getPrice();
        System.out.println(v);

    }
}
