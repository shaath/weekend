import java.util.Scanner;


public class switchcase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String course=sc.next();
		
		switch (course) 
		{
		case "selenium":
			System.out.println("You are slected selenium");
			
			break;
			
		case "UFT":
			System.out.println("You are selected UFT");
			break;
			
		case "Loadrunner":
			System.out.println("You are selected loadrunner");
			break;
		default:
			System.out.println("Select a proper option");
			break;
		}
		
	}

}
