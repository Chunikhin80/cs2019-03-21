package by.it.Java2.Lesson2;

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
        int max=99;
        int min=10;
        int r;
        int z;
        r= (max-min);
        z= (int) Math.floor(Math.random() * ++r)+min;
        return z;
            }
}
