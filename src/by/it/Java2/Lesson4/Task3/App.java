package by.it.Java2.Lesson4.Task3;

public class App {
    public static void main(String[] args) {

        Point one = new Point(0, 4);
        Point two = new Point(3, 0);

        Rectangle rectangle = new Rectangle(one, two);

        double square = Service.square(rectangle);
        double diagonal = Service.diagonal(rectangle);

        System.out.println("Площадь = " + square + " " + "Диагональ = " + diagonal);
    }
}
