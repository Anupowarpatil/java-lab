import java.util.Scanner;

class Basic{
	public static void main(String args[])
	{
		System.out.println("Program is started");
		int a=10,b=0,c;
		try{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Number is not divisible by 0");
		}
		System.out.println("Program is ended");

	}
}
