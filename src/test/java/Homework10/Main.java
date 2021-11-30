package Homework10;


import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.function.BiFunction;

public class Main {
    //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
    // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
    // Посчитать, сколько раз встречается каждое слово.
    //Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
    // В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
    // Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
    // Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
    // Консоль использовать только для вывода результатов проверки телефонного справочника.

    private static final String words =
            "Lie upon the lie " +
                    "upon the lie " +
                    "upon the lie " +
                    "upon the lie " +
                    "And it all comes down to this " +
                    "That a pig is a pig is a pig is a pig";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

//    private static Set<String> getWordsTest(String[] arr) {
//        return Set.of(arr);
//    }

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            String word = arr[i];
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }

        for (String s : arr) {
            map.merge(s, 1, Integer::sum);
//            map.merge(s, 1, (value1, value2) -> value1 + value2);
//            map.merge(s, 1, new BiFunction<Integer, Integer, Integer>() {
//                @Override
//                public Integer apply(Integer integer, Integer integer2) {
//                    return integer + integer2;
//                }
//            });
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "ivanov-phone-1");
        phonebook.add("Petrov", "petrov-phone-1");
        phonebook.add("Petrov", "89996669999");
        phonebook.add("Petrov", "Petr3");
        phonebook.add("Petrov", "Petr4");
        phonebook.add("Ivanov", "ivanov-phone-2");
        phonebook.add("Ivanov", "ivanov-phone-3");
        phonebook.add("Ivanov", "ivanov-phone-4");
        phonebook.add("Ivanov", "ivanov-phone-5");
        phonebook.add("XXXX", "XXX-XX-XX");


        System.out.println("phone Ivanov: " + phonebook.get("Ivanov"));
        System.out.println("phone Petrov: " + phonebook.get("Petrov"));
        System.out.println("phone XXX: " + phonebook.get("XXXX"));
    }
}
