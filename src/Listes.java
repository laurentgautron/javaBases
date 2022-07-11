import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class Listes {
    public static void main(String[] args) {
        List<Cat> chats = new ArrayList<>();

        HashMap<String, Integer> essai = new HashMap<>();

        essai.put("a", 1);
        essai.put("b", 3);
        essai.put("a", 4);

        System.out.println("la collection: " + essai);

        Cat cat1 = new Cat("Manoa");
        Cat cat2 = new Cat("Kawaï");
        Cat cat3 = new Cat("Poppy");
        Cat cat4 = new Cat("Maki");

        String name = "Bro";
        System.out.println(name.contains("B"));

        chats.add(cat1);
        chats.add(cat2);
        chats.add(cat3);
        chats.add(cat4);

        System.out.println(chats.contains(cat1));

        ListIterator<Cat> lit = chats.listIterator();

        while (lit.hasNext()) {
            lit.next().Meow();
        }
    }
}
