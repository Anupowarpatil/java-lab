import java.util.Scanner;
class addition_using_scanner{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,sum;
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Addition:"+sum);
	}
}