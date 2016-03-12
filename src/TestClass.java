import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TestClass {
	public static void main(String[] args) throws IOException	
	{
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


		System.out.println("#############################################################################################################");
		System.out.println("");
		System.out.println("Welcome to the PokéCenter! ");
		System.out.println("May we have your Pokémon? ");
		System.out.println("Please bear with us while we nurse your Pokémon back to full health. ");
		System.out.println("Your Pokémon have been healed. ");
		System.out.println("You will also now return here if all your Pokémon faint at once! ");
		System.out.println("We hope to see you again soon. ");
		System.out.println("");
	}
}
