package Test;

public class SwappingIntegerWithoutemp {
	
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("swapped number-"+"a="+a+" b="+b);
	}

}
