package by.it.Java2.Lesson4.Task3;

public class Service {

    public static double square(Rectangle rec) {
        double sideOne = rec.getLeftUp().getY() - rec.getRightDown().getY();
        double sideTwo = rec.getRightDown().getX() - rec.getLeftUp().getX();
        return (sideOne + sideTwo) * 2;
    }

    public static double diagonal(Rectangle rec) {
        Point one = new Point(rec.getRightDown().getX(), rec.getLeftUp().getY());
        return Point.distance(one);
    }
}
