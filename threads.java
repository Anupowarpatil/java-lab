import java.io.*;
import java.util.*;

class threads extends Thread
{
	public void run()
	{
			System.out.println("your thread is in running state.");
	}
	public static void main(String args[])
	{
		threads th = new threads();
		th.start();
	}
}