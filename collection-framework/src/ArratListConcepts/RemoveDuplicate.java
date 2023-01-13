package ArratListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.using linkedHashSet
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,2,8,9,1,1,6,7,2));
		
		LinkedHashSet<Integer> linkedHash =new LinkedHashSet<Integer>(numbers);

		ArrayList<Integer> withoutDuplicate = new ArrayList<Integer>(linkedHash);

		System.out.println(withoutDuplicate);


		//2. stream() - jdk8

		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(10,20,30,5,48,7,87,87,65,65,95,95));
		List<Integer> uniqueMarkList = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueMarkList);
		

	}

}
