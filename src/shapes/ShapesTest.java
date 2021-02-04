package shapes;

public class ShapesTest {

    public static void main(String[] args) {


        Measurable myShape = new Rectangle(4, 5);
        System.out.println("The area is: " + myShape.getArea());
        System.out.println("The perimeter is: " + myShape.getPerimeter());

        Measurable myShape2 = new Square(5);
        System.out.println("The area is: " + myShape2.getArea());
        System.out.println("The perimeter: " + myShape2.getPerimeter());

    }
}
