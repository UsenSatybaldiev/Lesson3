package com.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int v = random.nextInt(10);
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            if (n == v) {
                System.out.println("Вы угадали число! Repeat?");

            }
            else {
                if (n > v)
                    System.out.println("Введенное число больше");
                else
                    System.out.println("Введенное число меньше");
            }

        }





//
//        System.out.println(sc.nextInt());

    }
}
