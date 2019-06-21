package by.it.Java2.Lesson1;

import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String w1 = s.nextLine();
        System.out.println("Введите второе слово");
        String w2 = s.nextLine();
        int a = w1.length();
        int b = w2.length();

        if (w1.equals(w2)) {
            System.out.println("Отлично! Слова одинаковы.");
        } else if (w1.equalsIgnoreCase(w2)) {
            System.out.println("Хорошо. Почти одинаковы.");
        } else if (a == b) {
            System.out.println("Ну, хотя бы они одной длины.");
        } else
            System.out.println("Это абсолютно разные слова");
    }
}
