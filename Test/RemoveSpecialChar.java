package Test;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="asd__f457444";
		String result=s.replaceAll("[^a-zA-Z]", "");
System.out.println(result);
	}

}
