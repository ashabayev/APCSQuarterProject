
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

  //not sure if this should be here or not
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
