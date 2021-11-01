import java.util.Random;
import java.util.Scanner;



    public class hw3 {
        static Scanner scanner = new Scanner(System.in);
        static Random random = new Random();
        static final int TRIES = 3;

        public static void main(String[] args) {
            while (true) {
                System.out.print("Please enter the bound >>> ");
                int numberAI = random.nextInt(scanner.nextInt() + 1);
                System.out.println("Test: " + numberAI);
                boolean playerGuessed = false;
                for (int i = 0; i < TRIES; i++) {
                    System.out.print("Guess the number >>> ");
                    int answer = scanner.nextInt();
                    if (answer == numberAI) {
                        System.out.println("You won!!!");
                        playerGuessed = true;
                        break;
                    } else if (answer < numberAI) {
                        System.out.println("Your number must be bigger!");
                    } else {
                        System.out.println("Your number must be smaller!");
                    }
                }
                if (!playerGuessed) System.out.println("Looser!");
                System.out.print("Wanna play again? y or n >>> ");
                if (!scanner.next().toLowerCase().equals("y")) break;
            }
        }
    }
