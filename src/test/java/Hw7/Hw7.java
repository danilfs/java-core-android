package Hw7;

public class Hw7 {
    public static void main(String[] args) {
        Cat2[] cats = {
                new Cat2("Barsik", 50),
                new Cat2("Murzik", 100),
                new Cat2("Vaska", 300),
        };

        Bowl bowl = new Bowl();
        bowl.putFood(400);

        for (Cat2 cat2 : cats) {
            cat2.eat(bowl);
        }

        for (Cat2 cat2 : cats) {
            System.out.println(cat2);
        }
    }
}
