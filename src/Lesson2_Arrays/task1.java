package Lesson2_Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);}
        System.out.println(" ");

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);}
    }
}
