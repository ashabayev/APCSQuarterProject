import java.io.FileNotFoundException;


public class TestClass {
	private static Pokemon p1;
	
	public static void main(String[] args) throws FileNotFoundException {
		//PokemonCenter pc = PokemonCenter...
	}
	
public void intro(){
		System.out.println("#############################################################################################################");
		System.out.println("");
		System.out.println("Welcome to the PokéCenter! ");
		System.out.println("May we have your Pokémon? ");
		System.out.println("Please bear with us while we nurse your Pokémon back to full health. ");
		System.out.println("Your Pokémon have been healed. ");
		System.out.println("You will also now return here if all your Pokémon faint at once! ");
		System.out.println("We hope to see you again soon. ");
		System.out.println("");
		
		//pokemonCenter.getListOfPokemon().get(0).setBoardingDate("2005/8/25");
		
		p1 = new Charizard("Char", "Mike", "mrgiggles@yahoo.com", "77986", 67, 6);
		
		System.out.println("**************************");
		System.out.println("POKEMON: " + "pokemontype");
		System.out.println(p1.getName() + " owned by " + p1.getOwnerName());
		System.out.println("owner's email: " + p1.getOwnerEmail());
		System.out.println("**************************");
}
}
