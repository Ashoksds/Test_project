package Test;

public class ReverseArrayWithStringBuilder {
	public static void main(String[] args)
	{
		String s="home";
		StringBuilder sb=new StringBuilder(s);
		s=sb.reverse().toString();
		System.out.println(s);
	}

}
