package ArratListConcepts;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr = new ArrayList<Object>();
		
		System.out.println(arr.size());

		arr.add(100);
		System.out.println(arr.size());
		
		arr.add(300);
		System.out.println(arr.size());
		
	}

}
