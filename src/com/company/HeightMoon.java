/*
Программа для вычисления вашего веса на Луне
*
Автор Морковин Александр
*
1 июня 2019 года
*/

package com.company;

import java.util.Scanner;

public class HeightMoon {
    public static void main (String [] args) {
        double earth = 9.807;
        double moon;
        moon = 0.17 * earth;

        Scanner in = new Scanner (System.in); // создаем новый объект класса Scanner
        System.out.print("Введите Ваш вес на Земле: ");
        double height = in.nextDouble();

        System.out.println("Ваш вес на Луне составит: " + (height/earth*moon) + " кг.");
        in.close();
    }
}
