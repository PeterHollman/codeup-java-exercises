package shapes;

public class Square extends Quadrilateral implements Measureable {

    public Square(double length, double width) {
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
