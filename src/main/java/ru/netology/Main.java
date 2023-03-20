package ru.netology;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Ints intsCalc = new IntsCalculator();
        //демонстрация
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));
        System.out.println(intsCalc.div(45, 5));
        System.out.println(intsCalc.sub(10, 2));

    }
}