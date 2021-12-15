package langnotes;
import java.util.*;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> data 
            = new ArrayList<>(
                Arrays.asList(9, 5, 2, 7)
                );
        Collections.sort(data);
        System.out.println(data);
        return;
    }
}