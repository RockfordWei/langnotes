package langnotes;
import java.util.*;

public class dict {
    public static void main(String[] args) {
        HashMap<String, String> dinner = new HashMap<>();
        dinner.put("appetizer", "apple");
        dinner.put("beverage", "beer");
        dinner.put("course", "crawfish");
        dinner.put("desert", "donut");
        for(Iterator i = dinner.entrySet().iterator(); i.hasNext();) {
            Map.Entry j = (Map.Entry)i.next();
            System.out.printf("%s: %s\t", j.getKey(), j.getValue());
        }
        return;
    }
}