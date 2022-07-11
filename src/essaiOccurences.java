import java.util.HashMap;

// on peux comparer les Hasmap avec oc1.equals(oc2) !
public class essaiOccurences {
    public static void main(String[] args) {
        HashMap<Character, Integer> oc1 = new HashMap<>() {{
            put('j', 3);
            put('g', 4);
            put('h', 5);
        }};
        HashMap<Character, Integer> oc2 = new HashMap<>() {{
            put('j', 3);
            put('g', 4);
            put('h', 3);
        }};
        System.out.println(oc1.equals(oc2));
    }
}
