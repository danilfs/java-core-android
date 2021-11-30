package Hw6;

public class Cat1 extends Animal{
    private static final int CAT_MAX_RUN = 200;
    private static int counter;

    public Cat1(String name) {
        super("Cat", name, CAT_MAX_RUN, 0);
        counter++;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println(getName() + " won't swim!");
        return false;
    }

    public static int getCounter() {
        return counter;
    }
}