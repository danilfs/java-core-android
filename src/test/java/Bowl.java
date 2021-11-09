public class Bowl {
    private static int foodAmount;


    public static boolean decreaseFood(int amount) {
        if (foodAmount < amount || amount < 0) {
            return false;
        }
        foodAmount -= amount;
        System.out.printf("Food decreased for %d, %d left\n", amount, foodAmount);
        return true;
    }

    public void putFood(int amount) {
        if (amount < 0) {
            return;
        }
        foodAmount += amount;
        System.out.printf("Food increased for %d, %d now\n", amount, foodAmount);
    }
}
