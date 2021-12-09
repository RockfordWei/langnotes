package langnotes;
import java.util.*;
import java.lang.Math.*;

public class set {
    public static void main(String [] args) {
        HashSet<Integer> s = new HashSet<>();
        for(int x = 0; x < 10; x++) {
            int y = (int)Math.pow((double)-1, (double)x);
            s.add(y);
        }
        for(Iterator<Integer> i = s.iterator(); i.hasNext();) {
            Integer x = i.next();
            System.out.printf("%d\t", x);
        }
        System.out.println();
    }
}