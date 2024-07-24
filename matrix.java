import java.util.Scanner;
class mat{
	int a[][]=new int [2][2];
	int b[][]=new int [2][2];
	void SetArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st matrix:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2nd matrix:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}
	int GetArray()
	{
		System.out.println("1st matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("2nd matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		return 0;
	}
	int Addition()
	{	
		int add;
		System.out.println("Addition");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{	
				add=a[i][j]+b[i][j];
				System.out.print(add+" ");
			}
			System.out.println();
		}
		return 0;
	}
	int Subtraction()
	{	
		int sub;
		System.out.println("Subtraction");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{	
				sub=a[i][j]-b[i][j];
				System.out.print(sub+" ");
			}
			System.out.println();
		}
		return 0;
	}
	int Multiplication()
	{	
		int mul;
		System.out.println("Multiplication");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{	
				mul=a[i][j]*b[i][j];
				System.out.print(mul+" ");
			}
			System.out.println();
		}
		return 0;
	}
}
class matrix{
	public static void main(String args[])
	{
		mat Mt = new mat();
		Mt.SetArray();
		Mt.GetArray();
		Mt.Addition();
		Mt.Subtraction();
		Mt.Multiplication();
	}
}
