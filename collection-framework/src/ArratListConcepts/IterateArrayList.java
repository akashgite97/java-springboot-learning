package ArratListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrString= new ArrayList<String>();
		arrString.add("Akash");
		arrString.add("Raj");
		arrString.add("Om");
		
		//forLoop
		for(int i=0;i<arrString.size();i++) {
			System.out.println(arrString.get(i));
		}
		
		//forEach  loop
		for(String name:arrString) {
			System.out.println(name);
		}
		
		//JDK8 lambda function
		arrString.stream().forEach(name->System.out.println(name));
		
		//Iterator interface
		Iterator<String> nameIt =arrString.iterator();
		while(nameIt.hasNext()) {
			System.out.println(nameIt.next());
		}
		
		//Create list with other collection
		ArrayList<Integer> intArry= new ArrayList<Integer>(Arrays.asList(10,20,35,87));
		System.out.println(intArry);
		
	}

}
