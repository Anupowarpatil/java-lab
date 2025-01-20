java.util.Scanner;
public class max {
    public static void maion(Sting args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value:");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd value:");
        double num2 = sc.nextDouble();

        maxValue= Double.MAX_VALUE(num1,num2);
        System.out.println("Max value:"+maxValue);
    }
}
