package by.it.Java2.Lesson2;

import java.util.Scanner;

/**
 * Created by user on 21.06.2019.
 */
public class task10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число ");
        int a=sc.nextInt();
       //for (a=0;a<=1;a++){
         //  System.out.println("Факториал числа = 1");
           //break;}
        int i=1;
        int c;
        while (i<a){
            c=i*(i+1);
            i++;
            System.out.println("Факториал числа =" + c);

            }

    }
}
