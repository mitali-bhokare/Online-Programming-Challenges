import java.io.;
import java.util.;
import java.text.;
import java.math.;
import java.util.regex.;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        HashMapString,Integer hmap = new HashMap();
        for(int magazine_i=0; magazine_i  m; magazine_i++){
            magazine[magazine_i] = in.next();
            int value = 0;
            if(hmap.containsKey(magazine[magazine_i]))
            {
                value = hmap.get(magazine[magazine_i]);
                hmap.put(magazine[magazine_i],value+1);
            }
            else
            {
                hmap.put(magazine[magazine_i],1);
            }
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i  n; ransom_i++){
            ransom[ransom_i] = in.next();
            int value = hmap.get(ransom[ransom_i]);
            if(hmap.containsKey(ransom[ransom_i]) && value  0)
            {
                hmap.put(ransom[ransom_i],value-1);
            }
            else
            {
                System.out.println(No);
                System.exit(0);
            }
        }
        System.out.println(Yes);
    }
}
