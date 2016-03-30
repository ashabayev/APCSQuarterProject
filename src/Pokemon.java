import java.util.Calendar;
/**
 * @author Anna and Angelina
 *
 */
public abstract class Pokemon implements Boardable{

	private String name, ownerName, ownerEmail;
private double weight;
private String id;
private int hp;
private Calendar hospitalStart;
private Calendar hospitalEnd;
private Calendar hospitalCheck;

//private Date boardStart, boardEnd;

/**
 * Constructor
 */
public Pokemon()
{
	name = "Omar";
	ownerName = "Omar";
	ownerEmail = "oaldawud@imsa.edu";
	weight = 0;
	id = null;
	hp = 0;
}

/**
 * @param name
 * @param ownerName
 * @param ownerEmail
 * @param id
 * @param Weight
 * @param hp
 * @throws IllegalEmailException
 * @throws IDException
 */
public Pokemon(String name, String ownerName, String ownerEmail, String id, double Weight, int hp) throws IllegalEmailException, IDException
{
  setOwnerEmail(ownerEmail);
  setOwnerName(ownerName);
  setName(name);
  setWeight(Weight);
  setID(id);
  setHp(hp);
  
}
//setters and getters

/**
 * @return
 */
public String getOwnerEmail() {
	return ownerEmail;
}


/**
 * @return
 */
public String getOwnerName() {
	return ownerName;
}

/**
 * @param ownerName
 */
public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

/**
 * @return
 */
public String getId() {
	return id;
}

/**
 * @param id
 */
public void setId(String id) {
	this.id = id;
}

/**
 * @param ownerEmail
 * @throws IllegalEmailException
 */
public void setOwnerEmail(String ownerEmail) throws IllegalEmailException{
	this.ownerEmail = ownerEmail;
}

/**
 * @param namer
 */
public void setName(String namer)
{
  name = namer;
}

/**
 * @param weighty
 */
public void setWeight(double weighty)
{
  weight = weighty;
}

/**
 * @param ego
 * @throws IDException
 */
public void setID(String ego) throws IDException
{
  id = ego;
}

/**
 * @return
 */
public String getName()
{
  return name;
}
/**
 * @return
 */
public double getWeight()
{
  return weight;
}
/**
 * @return
 */
public String getid()
{
  return id;
}

/**
 * @return
 */
public int getHp() {
	return hp;
}


/**
 * @param HP
 */
public void setHp(int HP)
{
	hp = HP;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
public String toString()
{
	return null;
}


/* (non-Javadoc)
 * @see Boardable#setBoardStart(int, int, int)
 */
public void setBoardStart(int month, int day, int year) {
	
hospitalStart.set(year, month, day);


}


/* (non-Javadoc)
 * @see Boardable#setBoardEnd(int, int, int)
 */
public void setBoardEnd(int month, int day, int year) 
{
hospitalEnd.set(year, month, day);	
}

/* (non-Javadoc)
 * @see Boardable#boarding(int, int, int)
 */
public boolean boarding(int month, int day, int year) {
	
	hospitalCheck.set(year, month, day);
	return hospitalStart.compareTo(hospitalCheck) * hospitalCheck.compareTo(hospitalEnd) > 0;
}
}
	
