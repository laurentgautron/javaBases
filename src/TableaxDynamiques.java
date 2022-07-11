import java.util.ArrayList;

public class TableaxDynamiques {
    public static void main(String[] args) {
        ArrayList<Integer> notes = new ArrayList<>();

        // afficher la taille
        System.out.println("1: Taille du tableau => " + notes.size());

        // ajout: les elements sont ajoutés à la fin
        notes.add(15);
        notes.add(17);
        notes.add(12);
        notes.add(14);

        System.out.println("2: Taille du tableau => " + notes.size());

        // lire le tableau: methode get
        // afficher 15
        System.out.println("Afficher 15 => " + notes.get(0));

    }
}
