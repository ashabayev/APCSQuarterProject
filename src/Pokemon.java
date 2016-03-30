import java.util.Calendar;
public abstract class Pokemon implements Boardable{

	private String name, ownerName, ownerEmail;
private double weight;
private String id;
private int hp;
private HospitalStart = new Calendar();
private HospitalEnd = new Calendar();

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

public String getOwnerEmail() {
	return ownerEmail;
}


public String getOwnerName() {
	return ownerName;
}

public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
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


public void setBoardStart(int month, int day, int year) {
HospitalStart.set(int year, int month, int date)


}


public void setBoardEnd(int month, int day, int year) {
	
HospitalEnd.set(int year, int month, int date);	
}

public boolean boarding(int month, int day, int year) {
	
	HospitalCheck.set(int year, int month, int date);
	return HospitalStart.compareTo(HospitalCheck) * HospitalCheck.compareTo(HospitalEnd) > 0;
	



	return false;

}
}
	

}
