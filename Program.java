import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value:");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd value:");
        double num2 = sc.nextDouble();

        double value = Math.max(num1, num2);
        System.out.println("Max value:" + value);
    }
}
