package ArratListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.make arrayLisy synchronized
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		nameList.add("java");
		nameList.add("html");
		nameList.add("js");
		
		//add, remove -no need explicit synchronizaton
		
		// fetch/traverse vlaues - need explicit synchronization
		synchronized (nameList) {
			 Iterator<String> list =nameList.iterator();
			 while(list.hasNext()) {
				 System.out.println(list.next());
			 }
		}
 		
		// threadsafe arrayList
		//2.copyOnWriteArrayList - it's calss
		// by default synchronized
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		list.add("tom");
		list.add("steve");
		
		Iterator<String> it =list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		
		
		
		
		

	}

}
