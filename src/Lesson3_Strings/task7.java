package Lesson3_Strings;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваше число:");
        long num = in.nextLong();


        String getString = String.format("%010d", num);
            if (num > 9999999999L) {
                System.out.printf("%010d", 0);
            } else {
                System.out.println(getString);


                //System.out.printf("%010d",num);
            }
        }
    }
