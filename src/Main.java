
public class Main {
	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Square square = new Square(6);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}
