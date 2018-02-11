package LeetCode;

import java.util.HashMap;

public class MapSum {
    /*
    Implement a MapSum class with insert, and sum methods.

    For the method insert, you'll be given a pair of (string, integer).
    The string represents the key and the integer represents the value.
    If the key already existed, then the original key-value pair will be overridden to the new one.

    For the method sum, you'll be given a string representing the prefix,
    and you need to return the sum of all the pairs' value whose key starts with the prefix.
     */
    /**
     * Using the HashMap approach to solve
     */

    HashMap<String,Integer> sumMap ;

    public static void main(String args[]) {
        MapSum obj = new MapSum();

        obj.insert("aa", 3);
        int param_2 = obj.sum("a");
        System.out.println("Value is: " + param_2);

        obj.insert("aa", 2);
        param_2 = obj.sum("a");

        System.out.println("Value is: " + param_2);
    }

    public MapSum() {
        sumMap= new HashMap<>();
    }

    public void insert(String key, int val) {
       sumMap.put(key,sumMap.getOrDefault(key,0)+val);

    }


    public int sum(String prefix) {
        int count = 0;

        for(String value:sumMap.keySet())
        {
            if(value.startsWith(prefix))
                count += sumMap.get(value);
        }
        sumMap= new HashMap<>();
        return count;
    }
}
