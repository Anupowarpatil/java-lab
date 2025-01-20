class Circle {
    private static double pi = 3.14;
    private int radius;

    public Circle() {
        radius = 12;
    }

    double areaOfCircle() {
        return pi * radius * radius;
    }

    double circumference() {
        return 2 * pi * radius;
    }
}

public class Area {
    public static void main(String args[]) {
        Circle c = new Circle();
        System.out.println("Area of Circle:" + c.areaOfCircle());
        System.out.println("Circumference of Circle:" + c.circumference());
    }
}
