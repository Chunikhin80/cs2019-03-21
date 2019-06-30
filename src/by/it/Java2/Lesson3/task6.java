package by.it.Java2.Lesson3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваш текст:");
        String text = in.nextLine();
        text = getNewString(text);
        System.out.println(text);
    }

    private static String getNewString(String text) {
        text = text.replaceAll("([a-z])\\1+", "$1");
        return text;
    }

}
