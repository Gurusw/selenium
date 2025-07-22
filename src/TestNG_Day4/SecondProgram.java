package TestNG_Day4;

public class SecondProgram {
	public static void main(String[]a)
	{
		String bring="Broken hurt";
		String Reverse="";
		for(int i=bring.length()-1;i>=0;i--)
		{
			Reverse=Reverse+bring.charAt(i);
			
		}
		System.out.println(Reverse);
	}

}
