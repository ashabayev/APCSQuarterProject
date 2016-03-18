public class Mareep extends Pokemon
{
private boolean isClipped;
public Mareep()
{
}

public void setClipped(boolean yes)
{
isClipped = yes;
}

public boolean getClipped()
{
return isClipped;
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
