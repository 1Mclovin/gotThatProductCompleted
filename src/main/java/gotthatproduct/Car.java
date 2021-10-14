package gotthatproduct;

public class Car extends Product{
    public Car(String name, double price) {
        super(name, price);
    }

    @Override
    public void calculateDiscount(Product product) {
        double v = getDISCOUNT_RATE() * getPrice();
        System.out.println(v);

    }


}
