package box;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester2 {

    public static void main(String[] args) {

        ArrayList<Box> list = new ArrayList();
        list.add(new Box1());
        list.add(new Box2());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your length");
        int length = scanner.nextInt();
        System.out.println("Please enter your width");
        int width = scanner.nextInt();
        System.out.println("Please enter your height");
        int height = scanner.nextInt();

        for(Box box : list) {
            box.validate(length, width, height);
            System.out.println("Your box is " + box.getName() + ", and the price is " + box.getPrice() + " dollars");
            break;
        }
    }

}
