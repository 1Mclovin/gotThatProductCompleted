package differenceWithAccessMods;

public class Main {
    public static void main(String[] args) {

        Access1 a = new Access1();
        // this is default
        System.out.println(a.hours+" hours and "+a.minutes+" mins");


        // using our getters and setters from our access class
        a.setMilaSeconds(10000);
        a.setSeconds(28);

        System.out.println(a.getMilaSeconds());

    }
}
