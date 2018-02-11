package LeetCode;

import java.util.*;

public class TopKFrequent {

    /*
    * Given a non-empty array of integers, return the k most frequent elements.

    For example,
    Given [1,1,1,2,2,3] and k = 2, return [1,2].

    Note:
    You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
    Your algorithm's time complexity must be better than O(n log n), where n is the array's size.*/

    public static void main(String args[]) {
        int[] arr = {1, 1, 1, 2, 2, 3, 5, 5, 5};
        int k = 2;
        TopKFrequent inst = new TopKFrequent();

        System.out.println("Top K frequent elements are: "+inst.topKFrequent(arr, k));
    }

    /**
     *
     * @param nums Input array
     * @param k number of most frequent elements to be found
     * @return A list of k frequent elements
     * Approach: 1. Creating a HashMap with unique numbers as key and value as their frequency
     *           2. Creating a TreeMap using the HashMap with Frequency as Key and Value as List of Integers
     *           3. Reading the TreeMap with highest key using pollLastEntry()
     */
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
        }

        TreeMap<Integer, List<Integer>> tmap = new TreeMap<>();
        for(int value: hmap.keySet())
        {
            int frequency = hmap.get(value);
            if(!tmap.containsKey(frequency))
            {
                tmap.put(frequency,new LinkedList<>());
            }
            tmap.get(frequency).add(value);
        }

        List<Integer> result = new ArrayList<>();

        while(result.size()<k)
        {
            result.addAll(tmap.pollLastEntry().getValue());
        }


        return result;

    }
}
