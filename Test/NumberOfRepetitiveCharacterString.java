package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOfRepetitiveCharacterString {

	public static void main(String[] args)
	{
		String s="cucumber";
		HashMap<Character,Integer> mp=new HashMap<>();
		for(char c:s.toCharArray())
		{
			mp.put(c, mp.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry:mp.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
		
	}
}
