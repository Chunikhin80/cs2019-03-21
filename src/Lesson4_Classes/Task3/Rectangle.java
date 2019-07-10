package Lesson4_Classes.Task3;

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
