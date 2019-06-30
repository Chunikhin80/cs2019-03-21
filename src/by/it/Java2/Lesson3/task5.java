package by.it.Java2.Lesson3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваш текст:");
        String text = in.nextLine();
        text = text.trim();
        int a1 = 0;
        int a2 = 1;
        int word = 0;

        int words = getWords(text, a1, a2, word);

        System.out.println(words);
    }

    private static int getWords(String text, int a1, int a2, int word) {
        for (int i = 0; i < text.length(); i++) {
            String t = text.substring(a1, a2);
            a1++;
            a2++;
            if (t.equals(" ")) {
                word++;
            }
        }
        return word + 1;
    }
}


