package car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date d = sdf.parse("08:30");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());


        Car car1 = new Car("0000-123");
        System.out.println(car1.enter);
        Car car2 = new Car("0000-456", "8:30");




    }
}
