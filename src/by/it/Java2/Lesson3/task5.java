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
        int probel = 0;

        int words = getWords(text, a1, a2, probel);

        if (words > 4) {
            System.out.println("Всего в Вашем тексте найдено" + " " + words + " " + "слов");
        } else if (words < 2) {
            System.out.println("Всего в Вашем тексте найдено" + " " + words + " " + "слово");
        } else {
            System.out.println("Всего в Вашем тексте найдено" + " " + words + " " + "слов");
        }
    }

    private static int getWords(String text, int a1, int a2, int probel) {
        for (int i = 0; i < text.length(); i++) {
            String t = text.substring(a1, a2);
            a1++;
            a2++;
            if (t.equals(" ")) {
                probel++;
            }
        }
        return probel + 1;
    }
}
