package gotthatproduct;
// when it is aggregated it does not extend
public class ExpirationDate  {
    private String month;
    private String day;
    private String year;

    @Override
    public String toString() {
        return
//                "month='" + month + '\'' +
//                ", day='" + day + '\'' +
//                ", year=" + year ;
        month +" "+day+" "+year;
    }

    public ExpirationDate(String month,String day, String year){
     this.month=month;
     this.day=day;
     this.year=year;
    }
}
