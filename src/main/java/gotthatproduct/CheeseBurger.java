package gotthatproduct;

public class CheeseBurger extends Food{
    public CheeseBurger(String name, double price) {
        super(name, price);
    }


    @Override
    public int consume() {
        int randomNum = (int)(Math.random()*10);
        return randomNum;
    }

    @Override
    public  boolean isEdible() {
        return true;
    }


    @Override
    public double getPrice() {
        return super.getPrice()*consume();
    }


}
