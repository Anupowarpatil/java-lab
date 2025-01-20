class Calculate {
    private int side;

    public Calculate() {
        side = 10;
    }

    int area() {
        return side * side;
    }

    int perimeter() {
        return side * 4;
    }
}

public class Square {
    public static void main(String args[]) {
        Calculate c = new Calculate();
        System.out.println("Area of sqaure:" + c.area());
        System.out.println("Perimeter of sqaure:" + c.perimeter());
    }
}
