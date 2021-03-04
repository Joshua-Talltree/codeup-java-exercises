package shapes;

public class Shape {
    public static void main(String[] args) {


        Measurable myShape = new shapes.Measurable(4, 5);
        System.out.println("The area is: " + myShape.getArea());
        System.out.println("The perimeter is: " + myShape.getPerimeter());

        Measurable myShape2 = new shapes.Measurable(4);
        System.out.println("The area is: " + myShape2.getArea());
        System.out.println("The perimeter: " + myShape2.getPerimeter());

    }
}

