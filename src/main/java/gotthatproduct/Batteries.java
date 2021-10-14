package gotthatproduct;

public class Batteries extends Product implements Consumable{
    public Batteries(String name, double price) {
        super(name, price);
    }

    @Override
    public void calculateDiscount(Product product) {
        double v = getDISCOUNT_RATE() * getPrice();
        System.out.println(v);

    }

    @Override
    public int consume() {
        int randomNum = (int)(Math.random()*101);
        return randomNum;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*consume();
    }


}
