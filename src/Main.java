public class Main {
    public static void main(String[] args) {
        Triangle triangle= new Triangle(3,4,5);
        Rectangle rectangle=new Rectangle(4,5);
        Circle circle= new Circle(4);
        Square square=new Square(4);


        System.out.println("Triangle " + getCircumfrenceAndArea(triangle));
        System.out.println("Rectangle " + getCircumfrenceAndArea(rectangle));
        System.out.println("Circle " + getCircumfrenceAndArea(circle));
        System.out.println("Square " + getCircumfrenceAndArea(square));

    }

    public static String getCircumfrenceAndArea(Shape shape){
        double area=shape.getArea();
        double circumf=shape.getCircumference();

        return "circumfrence,area="+circumf+","+area;
    }
}