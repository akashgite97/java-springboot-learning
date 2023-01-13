package TreeMapConcepts;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapBasics {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(150,"java");
        treeMap.put(110,"javaScript");
        treeMap.put(100,"Py");
        treeMap.put(200,"C");

        System.out.println(treeMap);
        treeMap.forEach((k,v)->{
            System.out.println(" key = "+ k + " value " + v);
        });

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());

        // get values less tha 130
        Set<Integer> lessThan130 =  treeMap.headMap(130).keySet();
        System.out.println(lessThan130);
       
        // get values greater than 130
        Set<Integer> lgreaterThan130 =  treeMap.tailMap(130).keySet();
        System.out.println(lgreaterThan130);


        // Resverse Order Sorting
        TreeMap<Integer, String> reverseMap = new TreeMap<Integer, String>(Comparator.reverseOrder());
        reverseMap.put(150,"java");
        reverseMap.put(110,"javaScript");
        reverseMap.put(100,"Py");
        reverseMap.put(200,"C");
        System.out.println(reverseMap);
         


    }
}
