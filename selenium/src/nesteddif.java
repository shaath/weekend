import java.util.Scanner;


public class nesteddif
{


	public static void main(String[] args)
	{
//		int a=200000;
//		int b=3000;
//		int c=5000;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value:");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println("Enter C value");
		int c=sc.nextInt();
		
		if (a>b & a>c)
		{
			System.out.println("A is bigger");
		}
		else if (b>c & b>a)
		{
			System.out.println("B id bigger");
		}
		else
		{
			System.out.println("C is bigger");
		}
		

	}

}
