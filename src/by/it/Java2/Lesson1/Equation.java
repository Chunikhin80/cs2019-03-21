package by.it.Java2.Lesson1;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = s.nextInt();
        System.out.println("Введите b: ");
        int b = s.nextInt();
        System.out.println("Введите c: ");
        int c = s.nextInt();
        double d=b*b-4*a*c;
        double x1,x2;
        if (d>0){
            x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
            x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
        else if (d == 0){
            x1 = ((-1)*b)/(2*a);
            System.out.println("x1 = " + x1);
        }
        else
            System.out.println("Отрицательный дискриминант");
    }
}

