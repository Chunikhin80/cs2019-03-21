package by.it.Java2.Lesson2;

import java.util.Scanner;

public class task91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        int i;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                System.out.println("Это не простое число ");
                break;
            } else {
                System.out.println("Это простое число ");
                break;
            }

        }
    }
    }
