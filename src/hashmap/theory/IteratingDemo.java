package hashmap.theory;

import java.util.HashMap;
import java.util.Map;

public class IteratingDemo {

    public static void main(String[] args) {


        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);

        /*
          Using entrySet()  with for-each loop
          This method provide both key and value, using  Map.Entry  interface
         */

           for(Map.Entry<String,Integer> mmap: map.entrySet()){
               System.out.println("key"+ mmap.getKey() + ":" +  "value" + mmap.getValue());
           }

        /**
         * Iterating through keys using keySet()
         */

        for(String key : map.keySet()){
            System.out.println("key : " + key);
        }

        /**
         *  Iterating through the values
         */

        for (Integer value: map.values()){
            System.out.println("value :" + value);
        }


    }
}
