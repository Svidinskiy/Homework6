public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("\n");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("\n");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i+=2){
            System.out.println(i);
        }

        System.out.println("\n");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        System.out.println("\n");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i += 4){
            System.out.println(i + " год является високосным");
        }

        System.out.println("\n");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i+=7){
            System.out.println(i);
        }

        System.out.println("\n");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i*=2){
            System.out.println(i);
        }

        System.out.println("\n");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int total = 0;
        int salary =  29000;
        for (int i = 1; i <= 12; i++) {
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println("\n");
    }
    public static void task9 () {
        System.out.println("Задача 9");
        float salary =  29000;
        for (int i = 1; i <= 12; i++) {
            salary += salary * 0.01;
            System.out.println("Месяц " + i + " сумма накоплений равна " + salary + " рублей");
        }

        System.out.println("\n");
    }
    public static void task10 () {
        System.out.println("Задача 10");
        int a = 2;
        for (int i = 1; i <= 10; i++){
            System.out.println(a + " * " + i + " = " + a * i);
        }

        System.out.println("\n");
    }



}