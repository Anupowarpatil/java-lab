import java.util.*;

class info {
  
    String name;
    int age;
	info()
    {
        this.name="purva";
	this.age=20;
    }


    info(String n, int a)
    {
        this.name=n;
	this.age=a;
    }
 
	void display()
	{
    		System.out.println("Your name:"+name);
		System.out.println("Your age:"+age);
	}
}

class student{
    public static void main(String[] args)
    {
        info i = new info();
	i.display();
	info i1 = new info("Anu",21);
	i1.display();
    }
}
