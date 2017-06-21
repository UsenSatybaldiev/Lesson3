package com.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        guessNumber();
    }
    public static void guessNumber () {
        System.out.println("Угадайте число от 0 до 9");
        Random random = new Random();
        int v = random.nextInt(10);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int t = i + 1;
            System.out.println("Попытка номер - " + t + ":");
            int n = sc.nextInt();
            if (n == v) {
                System.out.println("Вы угадали число!");
                break;
            }
            else {
                if (n > v)
                    System.out.println("Загаданное число меньше указанного");
                else
                    System.out.println("Загаданное число больше указанного");
            }
        }
        System.out.println("Хотите повторить?: Да - 0, Нет - 1");
        int a = sc.nextInt();
        if (a == 0) {
            guessNumber();
        }
    }
}
