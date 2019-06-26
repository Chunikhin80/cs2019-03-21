package by.it.Java2.Lesson2;

public class task5 {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        int i;
        int j;
        for (i = 0; i < array.length; i++){
        for (j=0; j<array[i].length; j++){
        System.out.print(array[i][j] + " ");}
        System.out.println();}
    }
}