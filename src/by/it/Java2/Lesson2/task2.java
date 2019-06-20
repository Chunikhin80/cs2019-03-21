package by.it.Java2.Lesson2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int i = 0;
        int a = 2;
        int array[];
        array = new int[10];
        while (i<=9);
        {       if ((a % 2 == 0) || (a % 4 == 0)) {
                array[i] = a;
                a++;
                i++;}
                else
                a++;
                i=i;

            }
        for (i=0; i<array.length; i++)
            System.out.println(array[i]);
        }

    }




