package Homework9;

public class ArraySummator {
    //Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
    // При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    //Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
    // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
    // должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
    //В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
    // и вывести результат расчета.
    public static final int SIZE = 4;

    public static int sum(String[][] arr) {
        if (arr == null) throw new NullPointerException("You've given me a null!");
        if (arr.length != SIZE) {
            throw new MyArraySizeException("I need 4x4 array only!!!");
        }
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != SIZE) {
                throw new MyArraySizeException("I need 4x4 array only!!!");
            }
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Not a number data at cell [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Sum is " + sum);
        return sum;
    }

}
