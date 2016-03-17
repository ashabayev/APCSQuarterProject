import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class pokemonCenter{
	//private static pokemonCenter...
	
	public static void main(String[] args) throws IOException	
{
		//private ArrayList<Pokemon>...
	String fileName = "pokemonData.dat";
	try
	{
		byte[] buffer = new byte[1000];
		FileInputStream fStream = new FileInputStream(fileName);
		DataInputStream inFile = new DataInputStream(fStream);

		while(true){
			try
			{inFile.readInt();}
			catch(Exception e)
			{
				break;
			}
		}
		int total = 0;
		int nRead = 0;
		while((nRead = fStream.read(buffer)) != -1) {
			System.out.println(new String(buffer));
			total += nRead;
		}
		fStream.close();

		System.out.println("Read " + total + " bytes");


	}
	catch  (FileNotFoundException e)
	{
		System.out.println("Unable to open file '" + fileName + "'");
	}
	catch(IOException e) {
		System.out.println( "Error reading file '" + fileName + "'");
	}

	/**PokemonCenter(String inputFile); 
	void printPokemonInfoByName(String name); 
	void printPokemonInfoByOwner(String name); 
	void printPokemonBoarding(int   month, int day, year); 
*/
}

	
	
}
