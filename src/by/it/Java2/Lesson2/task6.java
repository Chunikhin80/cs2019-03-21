package by.it.Java2.Lesson2;

public class task6 {
    public static void main(String[] args) {


        int[][] array1 = {{4, 2}, {7, 9}};
        int[][] array2 = {{4, 3}, {3, 6}};

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
            System.out.println("Соответствующие элементы равны");
        else
            System.out.println("Соответствующие элементы не равны ");
    }
}

