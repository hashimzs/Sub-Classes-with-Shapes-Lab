public class Circle extends Shape{
    public  double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    public double getArea() {
        return Math.PI*(Math.pow(radius,2));
    }

}
