
public class reversestring {

	public static void main(String[] args)
	{
		String original="QEdge";
		
		//finding the length of the string
		
		int length=original.length();
		
		System.out.println(length);
		
		for (int i = length-1; i >= 0 ; i--) 
		{
			//reading a char from a string
			char reverse=original.charAt(i);
			System.out.print(reverse);
			
		}
	

	}

}
