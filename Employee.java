import java.util.Scanner;

class info{
	Object Info[] = new Object[5];
	String name;
	int Id;
	float salary;
	void SetData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.next();
		System.out.println("Enter your ID:");
		Id=sc.nextInt();
		System.out.println("Enter your Salary:");
		salary=sc.nextFloat();
		Info[0]=name;
		Info[1]=Id;
		Info[2]=salary;
	}
	void GetData()
	{	
		System.out.println("Your Information:");
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+Info[i]);
		}
	}
}
class Employee{
	public static void main(String args[])
	{
		info i = new info();
		i.SetData();
		i.GetData();
	}
}
