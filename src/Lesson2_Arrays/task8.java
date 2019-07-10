package Lesson2_Arrays;

public class task8 {
    public static void main(String[] args) {
        String[] ranks = {"Two", "Three", "For", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suits = {" of Hearts", " of Spades", " of Clubs", " of Diamonds"};
        int n = ranks.length * suits.length; //кол-во карт в колоде
        String[] deck = new String[n];

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = ranks[i] + suits[j];
            }
        }
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i)); // случайная карта в колоде
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(deck[i]);
        }
    }
}