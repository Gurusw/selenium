package TestNG_Day4;

public class CountNumberOFDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3425432;
		int count = 0;
		while(a!=0)
		{
			a=a/10;
			count++;
		
		
		}
		System.out.println(count);
	}

}
