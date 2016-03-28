public class Mareep extends Pokemon{
	private int maxHP = 55;
private boolean isClipped;

public Mareep(String name, String ownerName, String ownerEmail, String id, double weight, int hp) throws IllegalEmailException, IDException
{
	super(name, ownerName, ownerEmail, id, weight, hp);
}

public void setClipped(boolean yes)
{
isClipped = yes;
}

public boolean getClipped()
{
return isClipped;
}

public int getMaxHp()
{
	  return maxHP;
}

//not sure if this should be here. i don't think it is
@Override
public void setBoardStart(int month, int day, int year) {
	// TODO Auto-generated method stub
	
}

@Override
public void setBoardEnd(int month, int day, int year) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean boarding(int month, int day, int year) {
	// TODO Auto-generated method stub
	return false;
}

}
