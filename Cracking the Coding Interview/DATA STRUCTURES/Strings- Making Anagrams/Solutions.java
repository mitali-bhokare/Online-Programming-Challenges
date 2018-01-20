import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
        int diff = Math.abs(first.length() - second.length());
        String a = first;
        String b = second;
        if(first.length() > second.length())
        {
            a = second;
            b = first;
        }
        
        
        //System.out.println("First string Length "+first.length());
        //System.out.println("Second string Length "+second.length());
        
        HashMap<Character,Integer> hmap = new HashMap<>();
        
        for(int i=0;i<a.length();i++)
        {
            char c = a.charAt(i);
            //System.out.println("First string chars "+c);
            int value = 0;
            if(hmap.containsKey(c))
            {
                value = hmap.get(c);
                hmap.put(c,value+1);
            }
            else
            {
                hmap.put(c,1);
            }
        }
        int countMatch = 0;
        for(int i=0;i<b.length();i++)
        {
            char c = b.charAt(i);
            //System.out.println("First string chars "+c);
            int value = 0;
            if(hmap.containsKey(c) && hmap.get(c)>0)
            {
                //System.out.println("chars "+c);
                value = hmap.get(c);
                hmap.put(c,value-1);
                //System.out.println("Matched Letters "+c);
                countMatch ++;
            }           
        }
        //System.out.println("Count Match "+countMatch);
        
        int matched = Math.abs(b.length() - countMatch - diff);
        
        return diff + matched * 2;     
        
        
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
