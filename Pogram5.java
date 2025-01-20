import java.util.Scanner;

public class Pogram5 {
    public static void main(String args[]) {
        double num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num:");
        if (sc.hasNextDouble() && !sc.hasNextInt()) {
            num1 = sc.nextDouble();
        } else {
            System.out.println("Enter valid number!!");
            num1 = 0;
        }
        System.out.println("Enter 2nd num:");
        if (sc.hasNextDouble() && !sc.hasNextInt()) {
            num2 = sc.nextDouble();
        } else {
            System.out.println("Enter valid number!!");
            num2 = 0;
        }
        sc.close();
        if(num1!=0 && num2!=0)
        {
            double avg = (num1 + num2) / 2;
            System.out.println("Average:" + avg);
        }
    }
}
