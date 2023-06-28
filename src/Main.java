import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert your OS. 0 - iOS, 1 - Android");
        int clientOS = sc.nextInt();
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой ОС не существует");
        }
    }

    public static void task2() {
        System.out.println("Задача 2:");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3:");
        System.out.println("Введите год: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();//вводим год из консоли
        boolean leapYear = year % 4 == 0 || year % 400 == 0;//високосный
        boolean notLeapYear = year % 100 == 0 && year % 4 == 0 && year % 400 != 0;//не високосный
        if (leapYear) {
            if (notLeapYear) {
                System.out.println(year + " год ne является високосным");
            } else {
                System.out.println(year + " год является високосным");
            }
        } else {
            System.out.println(year + " год ne является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4:");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка одни сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка двое суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка трое суток");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача 5:");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();//вводим месяц
        if (monthNumber == 12 || monthNumber < 3) {
            System.out.println("Зима");
        } else if (monthNumber < 6) {
            System.out.println("Весна");
        } else if (monthNumber < 9) {
            System.out.println("Лето");
        } else if (monthNumber < 12) {
            System.out.println("Осень");
        } else System.out.println("Не валидный месяц");
    }
}