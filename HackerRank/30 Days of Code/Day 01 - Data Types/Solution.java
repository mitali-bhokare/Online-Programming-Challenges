import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		
		int intValue = scan.nextInt();
        double doubleValue = scan.nextDouble();
        String stringValue = scan.next() + scan.nextLine();

        System.out.println(i+intValue);
        System.out.println(d+doubleValue);
        System.out.println(s.concat(stringValue));
		
		 scan.close();
    }
}