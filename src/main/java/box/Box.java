package box;

public abstract class Box {

    int length;
    int width;
    int height;

    public abstract boolean validate(int a, int b, int c);

    public abstract int getPrice();

    public abstract String getName();




}
