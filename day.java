import java.util.Scanner;
class day{
	public static void main(String args[])
	{
		int DD,MM,YY;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date:");
		DD=sc.nextInt();
		System.out.println("Enter Month:");
		MM=sc.nextInt();
		System.out.println("Enter Year:");
		YY=sc.nextInt();
		
		int year[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((YY%4==0 && YY%100!=0) || YY%400==0)
		{
			year[2]=29;
		}
		
		if(DD<1 && DD>year[MM])
		{
			System.out.println("Invalid Date!!");
		}
		
		if(MM<1 && MM<12)
		{
			System.out.println("Invalid Month!!");
		}
		
		int Total=DD;
		for(int i=1;i<MM;i++)
		{
			Total=Total+year[i];
		}
		System.out.println("Total Days:"+Total);
		
		int oddTotal = (YY-1)*365+(YY-1)/4-(YY-1)/100+(YY-1)/400+Total;
		//System.out.println(oddTotal);
		int WeekD = oddTotal%7;
		
		switch(WeekD)
		{
			case 0:
			System.out.println("Sunday");
			break;
			case 1:
			System.out.println("Monday");
			break;
			case 2:
			System.out.println("Tuesday");
			break;
			case 3:
			System.out.println("Wednesday");
			break;
			case 4:
			System.out.println("Thursday");
			break;
			case 5:
			System.out.println("Friday");
			break;
			case 6:
			System.out.println("Saturday");
			break;
			default:
			break;
		}
	}
}