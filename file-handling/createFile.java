import java.io.*;

class createFile{
	public static void main(String args[])
	{
		File newFile = new File("D:\\23UAI316\\newFile.txt"); 
		
		try{
			newFile.createNewFile();
			System.out.println("File Created Successfully!!");
		}
		catch(IOException e)
		{
			System.out.println("Error occured!!"+e);
		}
	}
}
