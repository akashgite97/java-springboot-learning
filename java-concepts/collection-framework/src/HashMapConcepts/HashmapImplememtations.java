package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashmapImplememtations {
    
    public static Map<String, Integer> marksMap;
        static {
            marksMap = new HashMap<>();
            marksMap.put("java",58);
        }

    public static void main(String[] args) {

        

        //1.using Hashmap class

        HashMap<String, String> map = new HashMap<String, String>();
        Map<String, String> map1 = new HashMap<String, String>();

        //2. Static way : static hashmap - not recommnded

        System.out.println(HashmapImplememtations.marksMap.get("java"));

        //3. immutable Map : with single enyry
         
         Map<String, Integer> immutableMap =  Collections.singletonMap("test", 100);
         //immutableMap.put("abc",522);   //java.lang.UnsupportedOperationExceptio
         System.out.println(immutableMap.get("test"));

         //4. JDK8: 

         


        
        

    }
    
}
