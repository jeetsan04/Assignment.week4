package assignment.week4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		
		
		List<Integer> EnteredNumber=Arrays.asList(10,50,80,120,410,600);
		
		Iterator<Integer> itr= EnteredNumber.iterator();
		
		while (itr.hasNext()) {
			Integer value = itr.next();
			System.out.println(value);
			
		}
		

	}

}
