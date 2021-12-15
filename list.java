package langnotes;
import java.util.*;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            lst.add(i);
            lst.set(i, i + 1);
        }
        for(int i = 0; i < lst.size(); i++) {
            System.out.printf("%d\t", lst.get(i));
        }
        return;
    }
}