package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		//add values
		capitalMap.put("India","delhi");
		capitalMap.put("US","Washington");
		capitalMap.put("US","Washington123");
		capitalMap.put(null,"Berlin");
		capitalMap.put(null,"Berlin1123");
		
		// get values based on key
		System.out.println(capitalMap.get("India")); 
		System.out.println(capitalMap.get("US"));
		System.out.println(capitalMap.get(null));

		// iterator over key
		Iterator<String> it = capitalMap.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = capitalMap.get(key);
		    System.out.println("capitals though iteration " +value);
		}

		//iterate over set(pair) : using entrySet
		Iterator<Entry<String,String>> it1 = capitalMap.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String, String> entry = it1.next();
			System.out.println(" Key= "+ entry.getKey() + " value= " + entry.getValue());
		}

		//iterate using forEach and lambda : jdk8
		System.out.println("===================");
		capitalMap.forEach((key, value)-> System.out.println(" Key= "+ key + "value= " + value));

		











	}

}
