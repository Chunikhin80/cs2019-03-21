package by.it.Java2.Lesson2;

public class task8 {
    public static void main(String[] args) {
        String[] ranks = {"Two", "Three", "For", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        String[] suits = {" of Hearts", " of Spades", " of Clubs", " of Diamonds"};
        int n = ranks.length * suits.length; //кол-во карт в колоде
        String[] deck = new String[n];
        int a = 0;
            for (int i = 0; i < ranks.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    deck[a] = ranks[i] + suits[j];
                    System.out.println(deck[a]);
                }
            }
        }
    }

