import java.io.*;

class writeFile{
	public static void main(String args[])
	{
		try{
			FileWriter fw = new FileWriter("D:\\23UAI316\\newFile.txt");
			fw.write("hello!!");
			fw.close();
			System.out.println("file updated!!");
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}