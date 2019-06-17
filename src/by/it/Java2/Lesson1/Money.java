package by.it.Java2.Lesson1;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите сумму :");
        int cash = s.nextInt();


        int x = cash % 100;
        int y = cash % 10;
        if (y == 1)
            System.out.println(cash + " рубль");
        if (x == 1)
          System.out.println(cash + " рублей");
        if ((9 >= x && x >= 2) || (y > 1 && y < 5))
            System.out.println(cash + " рубля");
       if (20 > x && x > 10 || y >= 5 && y < 10)
          System.out.println(cash + " рублей");
    }
}
