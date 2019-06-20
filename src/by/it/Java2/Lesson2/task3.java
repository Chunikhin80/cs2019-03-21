package by.it.Java2.Lesson2;

public class task3 {
    public static void main(String[] args) {
        int array[];
        array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100)+10;
            System.out.print(array[i] + "  ");
        }
        if (array[2]>array[1] && array[1]>array[0]){
        System.out.println("Это строго возрастающая последовательность");}
    }
}