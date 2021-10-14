package constructorclass;

public class Main {
    public static void main(String[] args) {

        Shirt shirt = new Shirt();

        // calling our methods
        shirt.putOn();
        shirt.setColor("blue");

        //when imputing something for char it has to be in single quotes
        shirt.setSize('S');

        System.out.println(shirt.getColor());

        // lets see if it works with our constructor
        Shirt shirt1 = new Shirt("White",'M');

        System.out.println(shirt1);


    }
}
