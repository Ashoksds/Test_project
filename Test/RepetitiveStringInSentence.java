package Test;

import java.util.HashMap;
import java.util.Map;

public class RepetitiveStringInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="test is the not the test";
		String[] sps=s.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		for(String sp:s.split(" "))
		{
			map.put(sp, map.getOrDefault(sp, 0)+1);
		}
		
		/*for(String s2:map.keySet())
		{
			if(map.get(s2)>1)
			{
				System.out.println(s2);
			}
		}*/
		
		for(Map.Entry<String,Integer> mp:map.entrySet())
		{
			if(mp.getValue()>1)
			{
				System.out.println(mp.getKey()+" "+mp.getValue());
			}
		}
	}

}
