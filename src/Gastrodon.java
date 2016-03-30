/**
 * @author Anna and Angelina
 *
 */
public class Gastrodon extends Pokemon{

	private int eastWest;
	private int maxHP = 78;

	/**
	 * @param name
	 * @param ownerName
	 * @param ownerEmail
	 * @param id
	 * @param weight
	 * @param hp
	 * @param ew
	 * @throws IllegalEmailException
	 * @throws IDException
	 */
	public Gastrodon(String name, String ownerName, String ownerEmail, String id, double weight, int hp, int ew) throws IllegalEmailException, IDException
	{
		super(name, ownerName, ownerEmail, id, weight, hp);
		eastWest = ew;
	}


	/**
	 * @param i
	 */
	public void seteastWest(int i)
	{
		eastWest = i;
	}

	/**
	 * @return
	 */
	public int geteastWest()
	{
		return eastWest;
	}

	/**
	 * @return
	 */
	public int getMaxHp()
	{
		return maxHP;
	}


}
