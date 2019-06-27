package by.it.Java2.Lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int array[] = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int min = getMin(array);
        System.out.println("Min value is: " + min);

        int max = getMax(array);
        System.out.println("Max value is: " + max);

        int[] indexes = getIndexesNumberToArray(array, min, max);
        
        sumBetweenMinAndMax(array, indexes);
    }

    private static int getMin(int[] array) {
        int min = array[0];
        for (int i=1; i<array.length; i++)
             {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }


    private static int[] getIndexesNumberToArray(int[] array, int min, int max) {
        int[] indexes = new int[array.length];
        int count = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == min || array[index] == max) {
                indexes[count++] = index;
            }
        }
        indexes = Arrays.copyOf(indexes, count);
        return indexes;
    }

    private static void sumBetweenMinAndMax(int[] array, int[] indexes) {
        int sum = 0;
        for (int i = 0; i < indexes.length; i++) {
            int start = indexes[i];
            i++;
            int end = indexes[i];
            for (int index = start; index < end; index++) {
                sum += array[index];
            }
        }
        System.out.print("Sum is: " + sum);
    }
}

