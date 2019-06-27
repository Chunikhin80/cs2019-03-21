package by.it.Java2.Lesson3;

public class task3 {
    public static void main(String[] args) {
     String s="я ты он она оно они ";
     boolean end=s.endsWith("я");
     boolean start=s.startsWith("я");
        GetWordLineEqual(end, start);

    }

    private static void GetWordLineEqual(boolean end, boolean start) {
        if ((end & start)==true)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
