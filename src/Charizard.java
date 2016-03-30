
public class Charizard extends Pokemon {
private int maxHP = 78;
  
  
  public Charizard(String name, String ownerName, String ownerEmail, String id, double weight, int hp) throws IllegalEmailException, IDException
  {
    super(name, ownerName, ownerEmail, id, weight, hp);
  }

  public String toString()
  {
	  return null;
  }
  
  public int getMaxHp()
  {
	  return maxHP;
  }

 
}
