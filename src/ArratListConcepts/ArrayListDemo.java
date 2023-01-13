package ArratListConcepts;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//default generics
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(12);
		arr.add(135);
		arr.add("hello akash");
		arr.add(true);
		System.out.println(arr);
		System.out.println(arr.get(2));
		
		System.out.println(arr.size());
		

	}

}
