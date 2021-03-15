package com.company;

import java.util.Scanner;

public class RoPa {
    public static void main (String [] args) {
        String[] value = {"камень", "ножницы", "бумага"}; //создаем 3 массива
        int x = value.length; // пересчитываем длинну массива (3 слова)
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Напиши, что ты выбрал: ");

            int rand = (int) (Math.random() * x); // выбираем случайное значение из массива

            String a = s.nextLine();
            System.out.println("Ты выбрал - " + a);
            String word = value[rand];
            System.out.println("Я выбрал - " + word);


            if (word.equals(a)) {
                System.out.println("Ничья!");
            }
            if (word.equals("ножницы") & a.equals("камень")) {
                System.out.println("Ты победил!");
            } else {
                if (word.equals("ножницы") & a.equals("бумага")) {
                    System.out.println("Я победил!");
                }
            }
            if (word.equals("камень") & a.equals("бумага")) {
                System.out.println("Ты победил!");
            } else {
                if (word.equals("камень") & a.equals("ножницы")) {
                    System.out.println("Я победил!");
                }
            }
            if (word.equals("бумага") & a.equals("ножницы")) {
                System.out.println("Ты победил!");
            } else {
                if (word.equals("бумага") & a.equals("камень")) {
                    System.out.println("Я победил!");
                }
            }
            if(a.equals("выход")) {
                break;
            }
        }
    }

}
