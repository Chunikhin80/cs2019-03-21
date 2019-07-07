package by.it.Java2.Lesson4.Task3;

public class Rectangle {

    private Point leftUp;
    private Point rightDown;

    public Rectangle(Point leftUp, Point rightDown) {
        this.leftUp = leftUp;
        this.rightDown = rightDown;
    }

    public Point getLeftUp() {
        return leftUp;
    }

    public Point getRightDown() {
        return rightDown;
    }
}
