import java.util.*;
import java.io.*;
public class Reader {
	private Scanner read;
	private ArrayList<String> pet;
	public Reader()
	{
		readFile();
	}
	
	private void readFile()
	{
		String infile = read.nextLine();
		File file = new File(infile);
		try
		{
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine())
			{
				String information = sc.nextLine();
				pet.add(information);
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public String getArray(int i)
	{
		
		return pet.get(i);
	}

}
