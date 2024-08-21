import java.util.Scanner;
class Person{
	static int date,month,year;
	float height,weight;
	String city;
	
	Person()
	{
		this.date=23;
		this.month=9;
		this.year=2003;
		this.height=5;
		this.weight=80;
		this.city="Warana";
	}	

	int calAge()
	{
		int current_year=2024;
		int age=current_year-year;
		return age;	
	}
}

class Employee extends Person{
	int EmpId;
	float salary;
	
	Employee(int EmpId,float salary)
	{
		this.EmpId=EmpId;
		this.salary=salary;
	}

	double calTax()
	{
		double tax=salary*0.5;
		return salary-tax;
	}
}

class Student extends Person{
 	int roll;
	int phy,math,chem;
	
	Student(int roll,int phy,int math,int chem)
	{
		this.roll=roll;
		this.phy=phy;
		this.math=math;
		this.chem=chem;	
	}	
	
	float calAvg()
	{
		float avg=(phy+math+chem)/3;
		return avg;
	}

	public static void main(String args[])
	{
		Employee em = new Employee(564156,8541415);
		Student st = new Student(2,55,95,72);
		System.out.println("Date of Birth:"+date+"/"+month+"/"+year);
		System.out.println("Age:"+em.calAge());
		System.out.println("Height:"+em.height);
		System.out.println("Weight:"+em.weight);
		System.out.println("City:"+em.city);
		System.out.println("Employee ID:"+em.EmpId);
		System.out.println("Salary:"+em.salary);
		System.out.println("Tax:"+em.calTax());

		System.out.println("Roll:"+st.roll);
		System.out.println("Average:"+st.calAvg());
		
	}
}







