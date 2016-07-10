
public class twodimArray {

	
	public static void main(String[] args)
	{
		Object[][] s=new Object[2][5];
		
		
		System.out.println(s.length);
		
		System.out.println(s[1].length);
		
		s[0][4]="Selenium";
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.println(s[i][j]);
			}
			
		}
		

	}

}
