package car;

import java.util.*;

public class Tester {

    public static void main(String[] args) {

        int hourFee = 30;

        Car car1 = new Car("0000-123", "04:30");
        Car car2 = new Car("0000-234", "09:26");
        Car car3 = new Car("0000-567", "10:34");

        Map<String, Car> cars = new HashMap<>();
        cars.put(car1.id, car1);
        cars.put(car2.id, car2);
        cars.put(car3.id, car3);

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your car id");
        String finding = scan.next();

        Car car = cars.get(finding);

        if(car == null) {
            System.out.println("The car is not exist");
        }   else {
            System.out.println("Your car id is " + car.id);
            Date date = new Date();
            long second = date.getTime() - car.enter.getTime();
            long cost = (second/1000/60/60) * hourFee;
            System.out.println("The cost is "+ cost + " dollars");
        }





    }
}
