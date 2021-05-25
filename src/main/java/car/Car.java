package car;

import java.util.Calendar;
import java.util.Date;

public class Car {

    String id;
    Date enter;

    public Car(String id) {
        this.id = id;
        enter = new Date();
    }
    public Car(String id, String time) {
        Calendar calendar = Calendar.getInstance();
        this.id = id;
        String[] times = time.split(":");
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(times[0]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(times[1]));
        enter = calendar.getTime();

    }


}
