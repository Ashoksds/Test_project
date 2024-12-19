package Test;

import java.util.ArrayList;

public class ReverseStringWithoutStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "test";
		char[] c=s.toCharArray();
		ArrayList<Character> ch=new ArrayList<>();
		int j=0;
		for(int i=c.length-1;i>=0;i--)
		{
			ch.add(c[i]);
			System.out.print(ch.get(j));
			j++;
		}

	}

}
