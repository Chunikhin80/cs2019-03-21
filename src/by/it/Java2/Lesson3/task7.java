package by.it.Java2.Lesson3;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше число:");
        int num = in.nextInt();

        System.out.printf("%010d",num);
    }
}
