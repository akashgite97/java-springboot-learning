package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareHashmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "A");
        map2.put(3, "C");
        map2.put(2, "B");

        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(1, "A");
        map3.put(3, "C");
        map3.put(2, "B");
        map3.put(3, "B");

        //1. based on key:value pairs
        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));

        //2. compare using keySet() based on keys
        System.out.println("===compare bases on keySet===");
        System.out.println(map1.keySet().equals(map2.keySet())); //true
        System.out.println(map1.keySet().equals(map3.keySet()));  //true - ignores duplicate

        //3.find out extra key
        HashMap<Integer, String> map4 = new HashMap<Integer, String>();
        map4.put(1, "A");
        map4.put(2, "B");
        map4.put(3, "C");
        map4.put(4, "D");

        //Combine keys from both hashmap : HashSet
        HashSet<Integer> combineKeys = new HashSet<Integer>(map1.keySet());
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
  

        //4. Compare by values
        // duplicates are not allowed
        System.out.print(new ArrayList<>(map4.values()).equals(new ArrayList<>(map2.values())));




    }
}
