
public class IDException extends Exception{

IDException()
{
}

IDException(int length)
{
System.out.println("The trainer ID you have entered is the incorrect length. Please enter an ID of length 6");
}
IDException(char a)
{
System.out.println("The trainer ID is only composed of digits 0-9.");
}



}
