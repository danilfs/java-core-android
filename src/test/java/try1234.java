import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class try1234 {
        //    static boolean flag = false;
        //Создать массив из слов
        //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно можно пользоваться:
        //String str = "apple";
        //char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово.
        //Используем только маленькие буквы.

        public static void main(String[] args) {
            String[] words = {
                    "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                    "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                    "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
            };
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            String wordAI = words[random.nextInt(words.length)];
            System.out.println("DEBUG: " + wordAI);
            String wordUser;
            char[] guessedLetters = new char[15];

            System.out.print("AI want you to guess a word from these: ");
            System.out.println(Arrays.toString(words));
            while (true) {
                Arrays.fill(guessedLetters, '#');
                System.out.print("Enter your guess >>> ");
                wordUser = scanner.next();

                if (wordUser.toLowerCase().equals(wordAI)) {
                    System.out.println("You win!!!");
                    break;
                }

                for (int i = 0; i < wordUser.length() && i < wordAI.length(); i++) {
                    if (wordUser.charAt(i) == wordAI.charAt(i)) guessedLetters[i] = wordAI.charAt(i);
                }
                System.out.println("No, you guessed theese letters: ");
                System.out.println(new String(guessedLetters));
            }


        }
    }


