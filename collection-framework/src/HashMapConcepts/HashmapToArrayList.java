package HashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashmapToArrayList {
    
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("India","delhi");
		map.put("US","Washington");
		map.put("US","Washington123");

        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry paris = (Map.Entry) it.next();
            System.out.println(" key="+ paris.getKey() + " value=" + paris.getValue());
        }

        //convert hashmapkeys into arraylist
        List<String> keyList = new ArrayList<String>(map.values());  //map.Values()
        System.out.println(keyList);
        keyList.forEach(data->{
            System.out.print(data);
        });

    }
}
