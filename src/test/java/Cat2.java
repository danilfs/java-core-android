public class Cat2 {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat2(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Bowl bowl) {
        if (!Bowl.decreaseFood(appetite)) {
            System.out.printf("%s not enough\n", name);

        } else {
            System.out.printf("%s has ate\n", name);
            satiety = true;
        }

    }

    @Override
    public String toString() {
        return "Cat2{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}