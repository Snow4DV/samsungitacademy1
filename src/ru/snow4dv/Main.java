package ru.snow4dv;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (char c:
             "Hello world!".toCharArray()) {
            System.out.println(c);
        }
        int i = 0;
        for (char c:
                "Hello world!".toCharArray()) {
            i++;
            for (int j = 0; j < i % 5; j++) {
                System.out.print("-");
                System.out.println("DSD");
            }
            System.out.println(c);
        }
    }
}