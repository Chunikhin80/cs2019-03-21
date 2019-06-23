package by.it.Java2.Lesson2;

import java.util.Scanner;

/**
 * Created by user on 21.06.2019.
 */
public class task10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число ");
        int a=sc.nextInt();
        int f = getF(a);
        System.out.println("Факториал числа = " + f);
        }

    private static int getF(int a) {
        int i=1;
        int f=1;
        while (i <= a) {
        f = f * i;
        i++;}
        return f;
    }

}


