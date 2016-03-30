import java.io.FileNotFoundException;


/**
 * @author Anna and Angelina
 *
 */
public class TestClass {
	private static Charizard p1;
	private static Mareep p2;
	private static Klefki p3;
	private static Shellos p4;
	private static Gastrodon p5;

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		intro();

		try {
			p1 = new Charizard("Char", "Mike", "mrgiggles@yahoo.com", "77986", 67, 6);
			p2 = new Mareep("Horse", "Eric", "tswift@yahoo.com", "78980", 98, 9, true);
			p3 = new Klefki("Stuart", "Omar", "jbluv@yahoo.com", "54738", 43, 7, 5, false);
			p4 = new Shellos("Patrick", "Ari", "badger@yahoo.com", "45344", 32, 10, 1);
			p5 = new Gastrodon("Mew", "Crystal", "pupperoni@yahoo.com", "23432", 64, 11, 0);

		} catch (IllegalEmailException e) { //TODO: check that all exceptions are caught 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		p1.setBoardStart(11,21,2005);
		p1.setBoardEnd(12,25,2005);
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
		System.out.println("Is clipped? " + p2.getClipped()); //TODO: mareep clip thing
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println(p3.getClass().getSimpleName().toUpperCase() + ": ");
		System.out.println(p3.getName() + " owned by " + p3.getOwnerName());
		System.out.println("owner's email: " + p3.getOwnerEmail());
		System.out.println(p3.getHp() + "/" + p3.getMaxHp() + " HP");
		System.out.println("Holding keys? " + p3.getHoldingKey());
		System.out.println(p3.getKeys());
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println(p4.getClass().getSimpleName().toUpperCase() + ": ");
		System.out.println(p4.getName() + " owned by " + p4.getOwnerName());
		System.out.println("owner's email: " + p4.getOwnerEmail());
		System.out.println(p4.getHp() + "/" + p4.getMaxHp() + " HP");
		System.out.println("From the " + p4.getEastWest()); //TODO: make something to print east or west
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println(p5.getClass().getSimpleName().toUpperCase() + ": ");
		System.out.println(p5.getName() + " owned by " + p5.getOwnerName());
		System.out.println("owner's email: " + p5.getOwnerEmail());
		System.out.println(p5.getHp() + "/" + p5.getMaxHp() + " HP");
		System.out.println("From the " + p5.getEastWest());
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
}
