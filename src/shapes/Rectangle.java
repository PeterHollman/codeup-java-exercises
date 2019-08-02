package shapes;

public class Rectangle extends Quadrilateral implements Measureables {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double setWidth() {
        return 0;
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
