package by.it.Java2.Lesson2;

public class task6 {
    public static void main(String[] args) {


        int[][] array1 = {{1, 2}, {3, 4}};
        int[][] array2 = {{4, 3}, {2, 1}};
        boolean b = false;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != array2[i][j])
                     b=false;
                else b=true;}
        }
        if (b=true)
            System.out.println("Соответствующие элементы равны ");
        else
            System.out.println("Соответствующи элементы не равны");
    }

}


