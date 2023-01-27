package ArratListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrString = new ArrayList<String>();
		arrString.add("akash");
		arrString.add("raj");
		arrString.add("om");
		arrString.add("raj");
		arrString.add("raj");
		
		
		ArrayList<String> arrString1 = new ArrayList<String>();
		arrString.add("df");
		arrString.add("sdf");
		arrString.add("fsf");
		
		//addAll - to combine two arrays
		arrString.addAll(arrString1);
		System.out.println(arrString);
		
		//clear - to clear array
		
		//contains - returns true
		System.out.println(arrString.contains("om"));
		
		//indexOf - check index of element
		System.out.println(arrString.indexOf("raj"));
		
		//lastIndexOf -if multiple element with same name then we can use this method
		//if not availabe then it will gives -1
		System.out.println(arrString.lastIndexOf("raj"));
		
		//remove(index)
		
		//removeIf - conatin condition same as filter
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(15,87,99,245,77,20,86));
		number.removeIf(num->num%2 == 0);
		System.out.println(number);
		
		//retainAll - retain those values which are pasing through parameter
		ArrayList<String> arrString2 = new ArrayList<String>();
		arrString2.add("akash");
		arrString2.add("raj");
		arrString2.add("om");
		arrString2.add("om");
		arrString2.retainAll(Collections.singleton("om"));
		System.out.println(arrString2);
				
		//toArray()
		
		
		

	}

}
