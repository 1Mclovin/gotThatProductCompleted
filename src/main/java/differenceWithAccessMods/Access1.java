package differenceWithAccessMods;

public class Access1 {
   // these are the types of modifiers
    // default, public, private, protected


//// this is using the default modifiers
//    int hours=3;
//    int minutes=35;

    //lets try using public modifiers
// this is literally the same as default
    public int hours = 3;
    public int minutes = 35;


    // with private instances you will need getters and setters
    private int seconds;
    private int milaSeconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMilaSeconds() {
        return milaSeconds;
    }

    public void setMilaSeconds(int milaSeconds) {
        this.milaSeconds = milaSeconds;
    }
}
