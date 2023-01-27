package ArratListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		
		//1. Sort and the equals
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));

		Collections.sort(l1);
		Collections.sort(l2);

		System.out.println(l1.equals(l3));

		//2. compare two list and find additional eolement
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

		l4.removeAll(l5);
		System.out.println(l4);


		//3. finfout missing element
		l5.removeAll(l4);
		System.out.println(l5);

		//4. common elements
		l4.retainAll(l5);
		System.out.println(l5);





	}

}
