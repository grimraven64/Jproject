package com.company;

import java.util.Scanner;

public class DoWhile {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        int value;
            do {
                System.out.println("введи 5");
                value = scanner.nextInt(); // помещаем в переменную value то, что ввели с клавиатуры
        }
            while (value!= 5);
            System.out.println("Вы ввели 5");
    }
}
