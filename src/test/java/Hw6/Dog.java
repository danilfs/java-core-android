package Hw6;

public class Dog extends Animal{
    private static int counter;

    Dog(String name, int maxRun, int maxSwim) {
        super("Hw6.Dog", name, maxRun, maxSwim);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}