package by.it.Java2.Lesson2;

public class task6 {
    public static void main(String[] args) {


        int[][] array1 = {{4, 6}, {7, 8}};
        int[][] array2 = {{4, 3}, {2, 1}};

        int j = 0;
        int i = 0;
        int a = 0;
        int b = 0;
        if (array1[i][j] == array2[a][b]) {
            System.out.println("Соответствующие элементы равны ");
            i++;
            j++;
            a++;
            b++;
        }
        else
            System.out.println("Соответствующи элементы не равны");



    }

}


