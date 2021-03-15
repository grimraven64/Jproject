package com.company;

public class WhileLoops {
    public static void main (String [] args){
       // boolean t = 5==1;// == оператор сравнивания
        int value = 0;
       // boolean t = value>5; // сравниваем, если больше 5 то true
        while (value<5){
            System.out.println("Hello!"+value);
            value = value + 1;
        }

    }
}
