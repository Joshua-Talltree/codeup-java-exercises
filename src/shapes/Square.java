package shapes;

public class Square extends Rectangle {

    public Square(int side) {
        super(4 * side, side ^ 2);
    }
}
