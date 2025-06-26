package selenium;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String f="SeSr";
String reverse="";
for(int i=f.length()-1; i>=0; i--)
{
	reverse=reverse+f.charAt(i);
	
	
}
System.out.println(reverse);
{
if(f.equals(reverse))
{
	System.out.println("It is an palindrom");
}
else
{
	System.out.println("THis is not an palindrom");
}
	}

}}
