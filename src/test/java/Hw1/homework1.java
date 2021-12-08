package Hw1;

public class homework1 {
    public static void main(String[] args) {
        System.out.println ("Задание 1");
        System.out.println(calculate(50f, 25f, 3f, -4f));
        System.out.println("Задание 2");
        System.out.println(numberscheck(10, 1));
        System.out.println ("Задание 3");
        numberpositiv(-8);
        System.out.println ("Задание 4");
        System.out.println(positivnegativ(-10));
        welcome("Alo") ;
    }


    // 1 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    // где a, b, c, d – аргументы этого метода, имеющие тип float.
    static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // 2 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    // (включительно), если да – вернуть true, в противном случае – false.
    static boolean numberscheck(int a, int b) {
        int sum = a + b;
        boolean result = sum <= 20 && sum >= 10;
        return result;
    }

    // 3 Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    static void numberpositiv(int a) {
        if (a >= 0) System.out.println( "положительное");
        else System.out.println(" отрицательное");
    }

    // 4 Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    static boolean positivnegativ(int a ) { return a < 0 ;}


    //Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    static String welcome (String name) {
        String result = ("Привет ," + name + "!");
        System.out.println (result);
        return result;
    }
}

