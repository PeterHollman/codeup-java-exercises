package shapes;

public class Circle {
    private double radius;
    public Circle(double radius) {
    this.radius = radius;
    }
    public double getArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }
    public double getCircumference(){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());
    }
}
