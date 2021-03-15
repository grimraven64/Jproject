package com.company;

import java.util.Scanner;

public class Scanners {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in); // с помощью команды new мы создаем новый ОБЪЕКТ класса Scanner
        System.out.print("Введите значение ");
        int x = s.nextInt();
        System.out.println("Вы ввели " + x);
    }
}
