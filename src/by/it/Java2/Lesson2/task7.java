package by.it.Java2.Lesson2;

import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        String[] ranks = {"Two", "Three", "For", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suits = {" of Hearts", " of Spades", " of Clubs", " of Diamonds"};
         int i=0;
         int j=0;
         ranks[i] = ranks[randomize()];
         suits[j] = suits[randomize1()];
         System.out.println(ranks[i] + suits[j]);
         }


        private static int randomize () {
            Random suit = new Random();
            int s = suit.nextInt(13);
            return s;

        }
        private static int randomize1 () {
            Random rank = new Random();
            int r = rank.nextInt(4);
            return r;
        }


}