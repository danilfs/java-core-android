package Hw5;

class EmployeeTest {
    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    //4. Создать массив из 5 сотрудников.
    //Пример:
    //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    //persArray[1] = new Person(...);
    //...
    //persArray[4] = new Person(...);
    //
    //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jack J. J.", "Engineer", "jack@mail.com", "+036000044552", 100_000, 32),
                new Employee("Nick N. N.", "Designer", "nick@mail.com", "+036000044553", 120_000, 41),
                new Employee("John J. J.", "Programmer", "john@mail.com", "+036000044554", 150_000, 40),
                new Employee("Matt M. M.", "Builder", "matt@mail.com", "+036000044555", 90_000, 59),
                new Employee("Stew S. S.", "Teacher", "stew@mail.com", "+036000044556", 500_000, 24),
        };

        for (Employee employee : employees) {
            if (employee.getAge() > 40) employee.printInfo();
        }
    }
}
