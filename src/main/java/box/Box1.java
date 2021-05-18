package box;

public class Box1 extends Box{

    public Box1() {
        length = 10;
        width = 10;
        height = 10;
    }

    @Override
    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    @Override
    public int getPrice() {
        return 60;
    }

    @Override
    public String getName() {
        return "Box1";
    }
}
