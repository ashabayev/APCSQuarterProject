/**
 * @author Anna and Angelina
 *
 */
public class Klefki extends Pokemon{

	private boolean isHoldingKey;
	private int keys;
	private int maxHP = 78;

	/**
	 * @param name
	 * @param ownerName
	 * @param ownerEmail
	 * @param id
	 * @param weight
	 * @param hp
	 * @param numKey
	 * @param holdKey
	 * @throws IllegalEmailException
	 * @throws IDException
	 */
	public Klefki(String name, String ownerName, String ownerEmail, String id, double weight, int hp, int numKey, boolean holdKey) throws IllegalEmailException, IDException
	{
		super(name, ownerName, ownerEmail, id, weight, hp);
		isHoldingKey = holdKey;
		keys = numKey;

	}

	/**
	 * @param yes
	 */
	public void setHoldingkey(boolean yes)
	{
		isHoldingKey = yes;
	}

	/**
	 * @return
	 */
	public boolean getHoldingKey()
	{
		return isHoldingKey;
	}

	/**
	 * @param i
	 */
	public void setKeys(int i)
	{
		if (keys>0)
		{
			keys = i;
		}
		else
		{
			System.out.println("Please enter a positive integer");
		}
	}

	/**
	 * @param i
	 * @return
	 */
	public int getKeys()
	{
		return keys;
	}
	/**
	 * @param i
	 */
	public void addKeys(int i)
	{
		keys += i;
	}

	/**
	 * @param i
	 */
	public void takeKeys(int i)
	{
		if (keys>i)
		{
			keys -=i;
		}
		else
		{
			System.out.println("You're taking more than it has");
		}
	}

	/**
	 * @return
	 */
	public int getMaxHp()
	{
		return maxHP;
	}
}