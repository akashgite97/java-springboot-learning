package HashMapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {
    public static void main(String[] args) {

        //synchronized map method
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("name","akash");
        map1.put("age","25");
        map1.put("city","pune");

        //create synchronizwd map
       Map<String, String> syncmap = Collections.synchronizedMap(map1);
       System.out.println(syncmap);

       //create concurrenthashMap : does not throw any ConcurrentModificationExeption
       ConcurrentHashMap<String, String> conCurMap = new ConcurrentHashMap<>();
       conCurMap.put("uname","ak");
       System.out.println(conCurMap.get("uname"));


    }
}
