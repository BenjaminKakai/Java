// Define the interface
public interface Shape {
    double getArea();
    double getPerimeter();
}

// Implement the interface
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// Use the interface
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
