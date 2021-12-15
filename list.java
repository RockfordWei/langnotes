package langnotes;
import java.util.*;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> lst
            = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            lst.add(i);
            lst.set(i, i + 1);
        }
        // lst.get(i)
        System.out.println(lst);
        return;
    }
}