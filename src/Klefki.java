public class Klefki extends Pokemon{

private booleean isHoldingkey;
private int keys;

public Klefki()
{
}

public void setHoldingkey(boolean yes)
{
isHoldingkey = yes;
}

public boolean getKey()
{
return isHoldingkey;
}

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

public void getKeys(int i)
{
return keys;
}
 public void addKeys(int i)
 {
 keys += i;
 }
 
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
