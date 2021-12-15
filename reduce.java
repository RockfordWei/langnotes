package langnotes;
import java.util.*;

public class reduce {
    public static void main(String[] args) {
        List<Integer> data
            = List.of(1, 2, 3);
        int total
            = data.stream()
            .reduce(0, 
            (x, y) -> x + y);
        System.out.println(total);
        return;
    }
}