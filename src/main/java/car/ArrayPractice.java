package car;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

        Car car1 = new Car("1234-123", "14:24");
        Car car2 = new Car("1234-223", "10:24");
        Car car3 = new Car("1234-446", "13:24");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        int hourFee = 45;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your car id");
        String carId = scanner.next();
        for(Car c : cars) {
            Date date = new Date();
            c.id = carId;
            System.out.println("Your car id is " + carId);
            long difference = date.getTime() - c.enter.getTime();
            long cost = difference / 1000 / 60 / 60 * hourFee;
            System.out.println("Your cost is " + cost + " dollars");
            break;
        }






    }

}
