package assignment.week4;

import java.util.Arrays;
import java.util.List;

public class Task5 {

	public static void main(String[] args) {
		
		
		List<Integer> EnteredNumber= Arrays.asList(33,44,55,66,77,88);
		System.out.println(EnteredNumber);
		
		//Remove second element from list using index
		System.out.println(EnteredNumber.remove(1));
		System.out.println(EnteredNumber);
		
		//Remove second element from list using value
		System.out.println(EnteredNumber.remove(55));
		System.out.println(EnteredNumber);
		
		//Add 90 at index 3
		System.out.println(EnteredNumber.add(90));
		

	}

}
