package box;

public class Box2 extends Box{

    public Box2() {
        length = 15;
        width = 10;
        height = 10;
    }

    @Override
    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    @Override
    public int getPrice() {
        return 70;
    }

    @Override
    public String getName() {
        return "Box2";
    }
}
