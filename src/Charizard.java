
/**
 * @author Imsa Student
 *
 */
public class Charizard extends Pokemon {
private int maxHP = 78;
  
  
  /**
 * @param name
 * @param ownerName
 * @param ownerEmail
 * @param id
 * @param weight
 * @param hp
 * @throws IllegalEmailException
 * @throws IDException
 */
public Charizard(String name, String ownerName, String ownerEmail, String id, double weight, int hp) throws IllegalEmailException, IDException
  {
    super(name, ownerName, ownerEmail, id, weight, hp);
  }

  /* (non-Javadoc)
 * @see Pokemon#toString()
 */
public String toString()
  {
	  return null;
  }
  
  /**
 * @return
 */
public int getMaxHp()
  {
	  return maxHP;
  }

 
}
