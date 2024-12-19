package Test;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="malasdyalam";
		int l=0;
		int r=s.length()-1;
		boolean s2 = true;
		while(l<r)
		{
			if(s.charAt(l)!=s.charAt(r))
			{
				//System.out.println("Not palindrome");
				s2=false;
				break;
			}
			r--;
			l++;
		}
		
			System.out.println("Is Palindrome :"+s2);
		

	}

}
