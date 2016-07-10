
public class dynamicarrays {

	public static void main(String[] args) 
	{
		
		int[] s=new int[10];
		
		System.out.println(s.length);
		
		//writing the data into the array
		
		s[0]=2000;
		s[2]=6000;
		s[9]=4000;
		s[0]=5000;
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
	}

}
