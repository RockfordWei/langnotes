package langnotes;
import java.util.*;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        List<Integer> a 
            = List.of(1, 2, 3);
        List<Integer> b 
            = a.stream().filter(x -> x % 2 != 0)
        .collect(
            Collectors.toCollection(
                ArrayList::new));
        System.out.println(b);
        return;
    }
}