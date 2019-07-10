package Lesson2_Arrays;

public class task6 {
    public static void main(String[] args) {


        int[][] array1 = {{6, 6}, {6, 14}};
        int[][] array2 = {{4, 2}, {7, 6}};

        int j = 0;
        int i = 0;
        int s = 0;
        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array1[i].length; j++) {
                if (array1[i][j] == array2[i][j]) {
                    s = s + array1[i][j];
                }
            }
        }
        if (s > 0)
            System.out.println("Есть равные соответствующие элементы");
        else
            System.out.println("Нет равных соответствующих элементов");
    }
}

