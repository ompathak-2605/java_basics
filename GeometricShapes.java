
    import java.util.Scanner;

abstract class Shape {
    public abstract int numberOfSides();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

interface Colorable {
    void setColor(String color);
}

class Rectangle extends Shape implements Colorable {
    double length, width; String color;
    Rectangle(double l, double w) { length = l; width = w; }
    public int numberOfSides() { return 4; }
    public double calculateArea() { return length * width; }
    public double calculatePerimeter() { return 2 * (length + width); }
    public void setColor(String c) { color = c; }
    public void displayDetails() {
        System.out.println("\nShape: Rectangle\nColor: " + color +
            "\nSides: " + numberOfSides() +
            "\nArea: " + calculateArea() +
            "\nPerimeter: " + calculatePerimeter());
    }
}

class Triangle extends Shape implements Colorable {
    double base, height; String color;
    Triangle(double b, double h) { base = b; height = h; }
    public int numberOfSides() { return 3; }
    public double calculateArea() { return 0.5 * base * height; }
    public double calculatePerimeter() {
        double hypo = Math.sqrt(base*base + height*height);
        return base + height + hypo;
    }
    public void setColor(String c) { color = c; }
    public void displayDetails() {
        System.out.println("\nShape: Right-angled Triangle\nColor: " + color +
            "\nSides: " + numberOfSides() +
            "\nArea: " + calculateArea() +
            "\nPerimeter: " + calculatePerimeter());
    }
}

class Hexagon extends Shape implements Colorable {
    double side; String color;
    Hexagon(double s) { side = s; }
    public int numberOfSides() { return 6; }
    public double calculateArea() {
        return (3 * Math.sqrt(3) / 2) * side * side;
    }
    public double calculatePerimeter() { return 6 * side; }
    public void setColor(String c) { color = c; }
    public void displayDetails() {
        System.out.println("\nShape: Regular Hexagon\nColor: " + color +
            "\nSides: " + numberOfSides() +
            "\nArea: " + calculateArea() +
            "\nPerimeter: " + calculatePerimeter());
    }
}

public class GeometricShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rectangle - Enter length & width: ");  
        Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
        System.out.print("Color: "); r.setColor(sc.next()); r.displayDetails();

        System.out.print("\nTriangle - Enter base & height: ");
        Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble());
        System.out.print("Color: "); t.setColor(sc.next()); t.displayDetails();

        System.out.print("\nHexagon - Enter side: ");
        Hexagon h = new Hexagon(sc.nextDouble());
        System.out.print("Color: "); h.setColor(sc.next()); h.displayDetails();

        sc.close();
    }
}

