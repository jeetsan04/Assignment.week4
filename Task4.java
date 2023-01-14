package assignment.week4;

import java.util.Arrays;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		
		
		List<Integer> EnteredNumber= Arrays.asList(30,50,70,199,130,150);
		System.out.println("List is below"+EnteredNumber);
		
		int sum=0;
		
		for (int i = 0; i < EnteredNumber.size(); i++) 
		{
			sum=sum+EnteredNumber.get(i);
		}
		System.out.println("Sum of List is: " +sum);

	}

}
