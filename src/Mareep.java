/**
 * @author Anna and Angelina
 *
 */
public class Mareep extends Pokemon{
	private int maxHP = 55;
private boolean isClipped;

public Mareep(String name, String ownerName, String ownerEmail, String id, double weight, int hp, boolean clip) throws IllegalEmailException, IDException
{
	super(name, ownerName, ownerEmail, id, weight, hp);
	isClipped = clip;
}

/**
 * @param yes
 */
public void setClipped(boolean yes)
{
isClipped = yes;
}

/**
 * @return
 */
public boolean getClipped()
{
return isClipped;
}

public int getMaxHp()
{
	  return maxHP;
}


}
