package by.it.Java2.Lesson1;

import java.util.Scanner;

public class Dom1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размеры первого дома: a и b ");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Введите размеры первого дома: c и d ");
        int c=s.nextInt();
        int d=s.nextInt();
        System.out.println("Введите размеры участка: e и f ");
        int e=s.nextInt();
        int f=s.nextInt();
        if ((e >= (a + c)) && (f >= (b+d))) {
            System.out.println(" Можно построить 2 дома");}
        else if ((e >= (a + d)) && (f >= (b+c))) {
            System.out.println(" Можно построить 2 дома");}
        else if ((e >= (a+ c)) && (f >= b && f >= d)) {
            System.out.println(" Можно построить 2 дома");}
        else if ((e >= (a + d)) && (f >= b && b >= c)) {
            System.out.println(" Можно построить 2 дома");}
        else if ((f >= (a + c)) && (e >= (b+d))) {
            System.out.println(" Можно построить 2 дома");}
        else if ((f >= (a + d)) && (e >= (b+c))) {
            System.out.println(" Можно построить 2 дома");}
        else if ((f >= (a+ c)) && (e >= b && f >= d)) {
            System.out.println(" Можно построить 2 дома");}
        else if ((f >= (a + d)) && (e >= b && b >= c)) {
            System.out.println(" Можно построить 2 дома");}

        else
            System.out.println("Нельзя построить 2 дома");
    }
}
