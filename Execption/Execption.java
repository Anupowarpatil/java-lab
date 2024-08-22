import java.util.Scanner;

class Execption{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Program is started");
		int dividend[] = new int[5];
		int remainder[] = new int[5]; 
		int divisor;
		System.out.println("Enter 5 dividend:");
		for(int i=0;i<5;i++)
		{
			dividend[i]=sc.nextInt();
		}
		System.out.println("Enter divisor:");
		divisor=sc.nextInt();
		System.out.println("Your solution:");
		for(int i=0;i<5;i++){
			try{
				remainder[i]=dividend[i]/divisor;
				System.out.println(remainder[i]);
			}
			catch(Exception e){
				System.out.println("Number is not divisible by 0");
			}
		}
		System.out.println("Program is ended");

	}
}