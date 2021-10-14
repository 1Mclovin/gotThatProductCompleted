package gotthatproduct;

public class CocaCola extends Drink {
    public CocaCola(String name, double price) {
        super(name, price);
    }

    @Override
    public void calculateDiscount(Product product) {
        super.calculateDiscount(product);
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
