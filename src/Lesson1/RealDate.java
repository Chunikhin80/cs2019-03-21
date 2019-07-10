package Lesson1;

import java.util.Scanner;

public class RealDate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int day = s.nextInt();
        System.out.println("Введите месяц");
        int month = s.nextInt();
        System.out.println("Введите год");
        int year = s.nextInt();
        if ((day <= 29) && month == 2 && isLeapYear(year)) {
            System.out.println("Эта дата существует:" + day + "." + month + "." + year);}
        else if (day <= 28 && month == 2 && !(isLeapYear(year))) {
            System.out.println("Эта дата существует:" + day + "." + month + "." + year);}
        else if ((day <= 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            System.out.println("Эта дата существует:" + day + "." + month + "." + year);}
        else if ((day <= 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Эта дата существует:" + day + "." + month + "." + year);}
        else{
            System.out.println("Такой даты не существует ");}
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 400 == 0 && year % 100 == 0;
    }
}
