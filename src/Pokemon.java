import java.util.Calendar;
public class Pokemon implements Boardable{

	private String name, ownerName, ownerEmail;
private double weight;
private String id;
private int hp;
//private Date boardStart, boardEnd;

public Pokemon()
{
	name = "Omar";
	ownerName = "Omar";
	ownerEmail = "oaldawud@imsa.edu";
	weight = 0;
	id = null;
	hp = 0;
}

public Pokemon(String name, String ownerName, String ownerEmail, String id, double Weight, int hp)
{
  setOwnerEmail(ownerEmail);
  setName(name);
  setWeight(Weight);
  setID(id);
  setHp(hp);
  
}
//setters and getters

public String getOwnerEmail() {
	return ownerEmail;
}


public void setOwnerEmail(String ownerEmail) throws IllegalEmailException{
	this.ownerEmail = ownerEmail;
}

public void setName(String namer)
{
  name = namer;
}

public void setWeight(double weighty)
{
  weight = weighty;
}

public void setID(String ego) throws IDException
{
  id = ego;
}

public String getName()
{
  return name;
}
public double getWeight()
{
  return weight;
}
public String getid()
{
  return id;
}

public int getHp() {
	return hp;
}

public void setHp(int HP)
{
	hp = HP;
}

public String toString()
{
	
	return null;
}

}
