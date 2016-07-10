package day2;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList<Object> s=new ArrayList<Object>();
		//writing data into array list
		
		s.add("Selenium");
		s.add(1, "UFt");
		s.add("Loadrunner");
		s.add(5, "Manual");
		
		
		//size of the arraylist
		
		System.out.println(s.size());
		
		//reading the data from array list
		
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
			
			
		}

	}

}
