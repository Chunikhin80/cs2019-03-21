package Lesson3_Strings;

public class task1 {
    public static  void main(String[] args) {
        String s= "Дай пять.";
        s+="Дай еще раз";
        System.out.println(s);

        StringBuilder str=new StringBuilder(" Дай пять!");
        str.append("Дай еще раз");
        System.out.println(str);

    }
}

