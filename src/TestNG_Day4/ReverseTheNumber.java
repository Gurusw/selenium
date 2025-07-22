package TestNG_Day4;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1234;
		//int i=5;
		int c=0;
		while(a!=0)
		{
			int digit=a%10;
			c=c*10+digit;
			a=a/10;
		}
		System.out.println(c);
		

	}

}
