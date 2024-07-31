class mobile{
	String brand;
	int price;
	static String name;
	void show()
	{
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Name:"+name);
	}
}
class Demo{
	public static void main(String args[])
	{
		mobile m1 = new mobile();
		mobile m2 = new mobile();
		m1.brand="Redmi";
		m1.price=20000;
		m1.name="Iphone";
		m2.brand="Samsung";
		m2.price=50000;
		m2.name="Android";
		m1.name="Iphone";
		m1.show();
		m2.show();
	}
}