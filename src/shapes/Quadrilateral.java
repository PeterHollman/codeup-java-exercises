package shapes;

abstract class Quadrilateral extends shape implements Measureables {
    protected double length;
    protected double width;
    public Quadrilateral(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    protected double getWidth(){
     this.width = setWidth();
     return width;
    }

    protected double getLength(){
        this.length = setLength();
        return length;
    }



    public abstract double setWidth();
    public abstract double setLength();


}
