package by.it.Java2.Lesson3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите Ваш текст:");
        String text = in.nextLine();
        text = text.trim();
        int word = 0;

        int words=getWords(text,word);
        System.out.println(words);
    }

    private static int getWords(String text, int word) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ') {
                word++;
            }
        }
        return word + 1;
    }
}


