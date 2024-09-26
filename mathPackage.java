import java.io.*;
import java.util.*;
import java.lang.*;

class mathPackage{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
			for(int i=0;i<=2;i++)
			{	
				System.out.println("1.Arithmetic operation\n2.Statistical operation\n3.Trignometric operation");
				System.out.println("Enter your choice:");
				int choice=sc.nextInt();
				switch(choice)
				{
					case 1:
						System.out.println("Enter value for A:");
						int num1=sc.nextInt();
						System.out.println("Enter value for B:");
						int num2=sc.nextInt();
						int add,sub,multi;
						add=num1+num2;
						sub=num1-num2;
						multi=num1*num2;
						System.out.println("Addition:"+add);
						System.out.println("Subtraction:"+sub);
						System.out.println("Multiplication:"+multi);
					break;
					case 2:
						System.out.println("Enter values:");
						System.out.println("Enter value for A:");
						int a=sc.nextInt();
						System.out.println("Enter value for B:");
						int b=sc.nextInt();
						System.out.println("Enter value for C:");
						int c=sc.nextInt();
						System.out.println("Enter value for D:");
						int d=sc.nextInt();
						int total=a+b+c+d;
						int avg=total/4;
						System.out.println("Average:"+avg);
					break;
					case 3:
						System.out.println("Enter angle:");
						int angle=sc.nextInt();
						System.out.println("sine:"+Math.sin(angle));
						System.out.println("cosine:"+Math.cos(angle));
						System.out.println("tangent:"+Math.tan(angle));
					break;
					
					default:
                    System.out.println("Invalid choice. Please select a valid option.");
				}
			}
	}
}
