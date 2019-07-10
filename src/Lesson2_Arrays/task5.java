package Lesson2_Arrays;

public class task5 {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 1, 1}, {0, 1, 1, 1, 0}, {0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}, {1, 1, 1, 1, 1}};
        int i;
        int j;

            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[i].length; j++) {
                    if (array[i][j] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }
    }
