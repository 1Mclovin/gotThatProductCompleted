package constructorclass;

public class Shirt {


    //what do we know about a shirt?
    private String color;
    private char size;

// lets make a constructor
    Shirt (){
    }
// below is an overloaded constructor as well and
    @Override
    public String toString() {
        return "Shirt{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    Shirt(String color, char size){
        this.color = color;
        this.size = size;
    }

    //now lets create methods
    public static void putOn(){
        System.out.println("shirt is on");
    }

    public static void takeOff(){
        System.out.println("Shirt is off");
    }


    // lets create setters and getters for our private instances
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
