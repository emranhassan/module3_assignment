
public class Rectangle {
	protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
 }

    public double calculateArea() {
        return length * width;
        }

    public double calculatePerimeter() {
      return 2 * (length + width);
        }
}

class Square extends Rectangle {
       public Square(double side) {
        super(side, side);
        }
}
