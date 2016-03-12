
public class Pokemon implements Boardable{
private String name, ownerName, ownerEmail;


private double weight;
private String id;
private int hp;

public Pokemon(String name, String ownerName, String ownerEmail, String id, double Weight, int hp)
{
  
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

public void setID(String ego)
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
public String id()
{
  return id;
}

public int getHp() {
	return hp;
}

public String toString()
{
	
	return null;
}

}
