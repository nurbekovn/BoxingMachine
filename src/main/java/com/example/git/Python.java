package com.example.git;

import java.util.Scanner;

public class Python {
    public static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" 1 - Задача ");
        System.out.println("Добрый день Дидар Маматжановна !!!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        task2();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        task3();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        task4();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        task5();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        task6();

    }
        public static void  task2 () {
            System.out.println(" 2 - Задача ");
            System.out.println("Введите имя : ");
            String name = scanner.nextLine();
            System.out.println("Привет " + name);
        }

        public static void task3() {

            System.out.println("3 - Задача ");
            System.out.println("Введите 3 числа : ");
            int a,b,c;
            System.out.println("Введите а : ");
            a = scanner.nextInt();
            System.out.println("Введите b : ");
            b = scanner.nextInt();
            System.out.println("Введите c : ");
            c = scanner.nextInt();
            System.out.println("a = " + a +" b = " + b + " c = " + c);
            System.out.println("___________________________________");
            System.out.println("(a+b)/c  = " + (a+b)/c);
            System.out.println();
            System.out.println("(a-b)*c = " + (a-b)*c);
            System.out.println();
            System.out.println("(a-c) ^ = " + (a-b) * (a-b));
            System.out.println();
            System.out.println("(a-c) % c = " + (a-c)%c);

        }
        // 3
        // Пользователь вводит 3 числа абс
        // (a+b)/c without int
        // (a-b)*c drobnoe number
        // (a-b) stepen c
        // (a-c)/c %

        // 4
        // Дан отрезок в км , метрах и см.
        // Напишите программу , которая определит этот же отрезок в см .

    public static void task4() {
        System.out.println("4 - Задача ");
        System.out.println("Введите киломметр : ");
        int kilometer = scanner.nextInt();
        System.out.println("Cантиметр : " + kilometer*100000 + "см.");
    }

    public static void task5() {
        System.out.println("5 - Задача ");
        int a , b , c ;
        System.out.println("Введите а : ");
        a = scanner.nextInt();
        System.out.println("Введите b : ");
        b = scanner.nextInt();
        System.out.println("Введите c : ");
        c = scanner.nextInt();
        System.out.println("a = " + a +" b = " + b + " c = " + c);
        if (a%2==0) {
            System.out.println("Целое число = " + a);
        }
        if (b%2==0) {
            System.out.println("Целое число = " + b);
        }
        if (c%2==0) {
            System.out.println("Целое число = " + c);
        }
        else System.out.println("Здесь нету целые числа ");
    }
        // 5
        // Даны 3 int A,B,C .
        // Определить есть ли среди них хотя бы одно четное число.
        // Выходные данные Одна строка - "YES" or "NO" .
        //6
        // Дано 3-х значное Если оно четное , то выведите "ЧЕТНОЕ" , в противном
        //случае "Не Четное"

    public static void task6() {
        System.out.println("6 - Задача ");
        System.out.println("Введите число");
        int number = scanner.nextInt();
        if (number%2==0) {
            System.out.println("Четное ");
        }
        else System.out.println("Не четное");
    }

}

