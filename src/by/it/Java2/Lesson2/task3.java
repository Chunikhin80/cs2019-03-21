package by.it.Java2.Lesson2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int array[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив чисел");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        // поиск макс. и мин. индекса
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
            }
            System.out.println(indexOfMin + " " +  indexOfMax);

            // суммирование элементов между макс. и мин. индексами
            int sum=0;
            for (int i=indexOfMin+1; i<indexOfMax; i++){
                sum+=array[i];
            }
        System.out.println(sum);
        }
}

