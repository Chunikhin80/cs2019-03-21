package Lesson2_Arrays;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int array[];
        array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = diapazon();
            System.out.print(array[i] + " ");
        }
        if (array[2]>array[1] && array[1] > array[0]){
            System.out.println("\n" + "Это строго возрастающая последовательность");
        }
    }
    private static int diapazon() {
        Random rand=new Random();
        int t=rand.nextInt(95)+4;
        return t;
            }
}
