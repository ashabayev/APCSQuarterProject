import java.io.FileNotFoundException;


public class TestClass {
	private static Charizard p1; //TODO: these should be of these object types, right?
	private static Mareep p2;
	
	public static void main(String[] args) throws FileNotFoundException {
		//PokemonCenter pc = PokemonCenter...
		intro();
		
		try {
			p1 = new Charizard("Char", "Mike", "mrgiggles@yahoo.com", "77986", 67, 6);
			//p2 = new Mareep("Horse", "Eric", "tswift@yahoo.com", "78980", 67, 6);
			//TODO: the charizard and the mareep class are structered slightly differently
			//TODO: add 3 more pokemon
		} catch (IllegalEmailException e) { //TODO: check that all exceptions are caught 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TODO: scanner class
		
		//TODO: methods setBoardStart() and setBoardEnd()
		//TODO: System.out.println("List of animals boarded on: " + pokemonCenter.getListOfPokemon().get(0).setBoardingDate("2005/8/25")); 
		
		
		System.out.println("**************************");
		System.out.println(p1.getClass().getSimpleName().toUpperCase() + ": ");
		System.out.println(p1.getName() + " owned by " + p1.getOwnerName());
		System.out.println("owner's email: " + p1.getOwnerEmail());
		System.out.println(p1.getHp() + "/" + p1.getMaxHp() + " HP");
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println(p2.getClass().getSimpleName().toUpperCase() + ": ");
		System.out.println(p2.getName() + " owned by " + p2.getOwnerName());
		System.out.println("owner's email: " + p2.getOwnerEmail());
		System.out.println(p2.getHp() + "/" + p2.getMaxHp() + " HP");
		System.out.println("stuff about getting clipped"); //TODO: mareep clip thing
		System.out.println("**************************");
		
	}
	
public static void intro(){
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
