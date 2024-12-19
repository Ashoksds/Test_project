package Test;

public class ReverseIntegerString {

	public static void main(String[] args)
	{
		int a=1445;
		int reverse=0;
		while(a!=0)
		{
			int i=a%10;
			reverse=reverse*10+i;
			a/=10;
			
		}
		System.out.println(reverse);
	}
}
