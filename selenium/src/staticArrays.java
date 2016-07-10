
public class staticArrays 
{
	public static void main(String[] args)
	{
//		int[] s={2000,3000,4000,5000,5000,60000,5000};
		Object[] s={3000,"Selenium",'M',4444.444,false};
		//length of the array

		System.out.println(s.length);
		
//		System.out.println(s[5]);
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]);
		}
		
	}

}
