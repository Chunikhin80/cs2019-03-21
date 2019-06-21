package by.it.Java2.Lesson1;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите год: ");
        int y= s.nextInt();
        if (y%4==0 && y%100==0 && y%400==0){
            System.out.println("Это високосный год");}
        else if (y%4==0 && y%100==0){
            System.out.println("Это не високосный год");}
        else if (y%4!=0){
            System.out.println("Это не високосный год");}
        else{
            System.out.println("Это високосный год");}
    }
    }

