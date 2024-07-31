import java.util.Scanner;
class customer{
	private double Balance,Interest;
	private static double IntRate;
	customer(double amount)
	{
		this.Balance=amount;
	}
	static void annulInt(double rate)
	{
		IntRate=rate;
	}
	void calculate()
	{
		Interest=(Balance*IntRate/12)/100;
		//System.out.println(Interest);
		Balance=Balance+Interest;
	}
	void print()
	{
		System.out.println("Your Balance:"+Balance);
	}

}
class SavingAccount{
	public static void main(String args[])
	{
		customer cu1 = new customer(10000);
		customer cu2 = new customer(32656);
		System.out.println("Balance before Interest:");
		cu1.print();
		cu2.print();
		System.out.println("Balance After 4% Interest:");
		customer.annulInt(4);
		cu1.calculate();
		cu1.print();
		cu2.calculate();
		cu2.print();
		System.out.println("Your Balance After 5% Interest:");
		customer.annulInt(5);
		cu1.calculate();
		cu1.print();
		cu2.calculate();
		cu2.print();
	}
}