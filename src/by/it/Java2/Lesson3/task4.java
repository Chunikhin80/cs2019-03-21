package by.it.Java2.Lesson3;

public class task4 {
    public static void main(String[] args) {
        String FIO = getInitials("Иванов", "иван", "иванович");

        print(FIO);
    }


    public static String getInitials(String name, String surname, String name2) {
        String s1 = name.substring(0, 1);
        String s2 = surname.substring(0, 1);
        String s3 = name2.substring(0, 1);
        return s1.concat(".") + s2.concat(".") + s3;
    }

    public static void print(String out) {
        System.out.println(out.toUpperCase());
    }

}






