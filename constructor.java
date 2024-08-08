import java.util.Scanner;

class employee{
	private int id;
	private String name;
	private double salary;

	employee(int E_id,String E_name,double E_salary)
	{
		this.id=E_id;
		this.name=E_name;
		this.salary=E_salary;
	} 
	
	void setId(int Id)
	{
		this.id=Id;
	}
	void setName(String Name)
	{
		this.name=Name;
	}
	void setSalary(double Salary)
	{
		this.salary=Salary;
	}

	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	double getSalary()
	{
		return salary;
	}

	void raiseSalary()
	{
		this.salary=salary*1.10;
	}
}

class constructor{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String EmName;
		int EmId;
		double Emsalary;
		System.out.println("Enter your data!");
		System.out.print("Id:");
		EmId=sc.nextInt();
		System.out.print("Name:");
		EmName=sc.next();
		System.out.print("Salary:");
		Emsalary=sc.nextDouble();
		
		employee em = new employee(EmId,EmName,Emsalary);
		System.out.println("Id:"+em.getId());
		System.out.println("Name:"+em.getName());
		System.out.println("Salary:"+em.getSalary());

		em.raiseSalary();
		System.out.println("Updated Salary:"+em.getSalary());
	}
}