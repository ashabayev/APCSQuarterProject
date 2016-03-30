import java.io.FileNotFoundException;


public class TestClass {
	private static Charizard p1;
	private static Mareep p2;
	private static Mareep p3;
	private static Mareep p4;
	private static Mareep p5;

	public static void main(String[] args) throws FileNotFoundException {
		intro();

		try {
			p1 = new Charizard("Char", "Mike", "mrgiggles@yahoo.com", "77986", 67, 6);
			p2 = new Mareep("Horse", "Eric", "tswift@yahoo.com", "78980", 98, 9, true);
			p3 = new Mareep("Stuart", "Omar", "jbluv@yahoo.com", "54738", 43, 7, false); //TODO: change to different pokemon
			p4 = new Mareep("Patrick", "Ari", "badger@yahoo.com", "45344", 32, 10, true); //TODO: change to different pokemon
			p5 = new Mareep("Mew", "Crystal", "pupperoni@yahoo.com", "23432", 64, 11, false); //TODO: change to different pokemon

		} catch (IllegalEmailException e) { //TODO: check that all exceptions are caught 
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		p1.setBoardStart(11,21,2005);  //TODO: is this supposed be object of p1?
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
		System.out.println(p2.getClipped()); //TODO: mareep clip thing
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println(p3.getClass().getSimpleName().toUpperCase() + ": ");
		System.out.println(p3.getName() + " owned by " + p3.getOwnerName());
		System.out.println("owner's email: " + p3.getOwnerEmail());
		System.out.println(p3.getHp() + "/" + p3.getMaxHp() + " HP");
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println(p4.getClass().getSimpleName().toUpperCase() + ": ");
		System.out.println(p4.getName() + " owned by " + p4.getOwnerName());
		System.out.println("owner's email: " + p4.getOwnerEmail());
		System.out.println(p4.getHp() + "/" + p4.getMaxHp() + " HP");
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println(p5.getClass().getSimpleName().toUpperCase() + ": ");
		System.out.println(p5.getName() + " owned by " + p5.getOwnerName());
		System.out.println("owner's email: " + p5.getOwnerEmail());
		System.out.println(p5.getHp() + "/" + p5.getMaxHp() + " HP");
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
