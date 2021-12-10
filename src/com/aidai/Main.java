package com.aidai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String wiss ;
        final int NUM =12;
        String world = "a";
        wiss = NUM+world;
        System.out.println(wiss);
        if (NUM<0) {
            System.out.println("Вы сохранили отрицательное число");
        }else if (NUM>0){
            System.out.println("Вы соохранили положиительное число");
        }else
            System.out.println("Вы сохранили нуль");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String DD = in.nextLine();
        System.out.println("Привет: " + DD);





    }
}
