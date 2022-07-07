import java.util.HashMap;

public class HMapConcept {
    public static void main(String[] args) {
        // à partir d'une phrase afficher le nombre d'occurence de chaque caractère
        String phrase = "je suis dans une joie immense. Et je sais que c'st aussi le cas pour vous";

        //
        String phraseFormatee = phrase.replaceAll("[^A-Za-z]", "").toLowerCase();
        System.out.println(phraseFormatee);

        // creation du Hmap: on décide le type de clé et la valeur
        // on ne passe jamais de type primitif
        // le int primitif va être converti en integer: autoboxing
        HashMap<Character, Integer> occurences = new HashMap<>();

        for (int index = 0; index <phrase.length(); index++) {
            char lettre = phrase.charAt(index);
            if (occurences.containsKey(lettre)) {
                int ancienneValeur = occurences.get(lettre);
                occurences.replace(lettre, ancienneValeur +1 );
            } else {
                occurences.put(lettre, 1);
            }
        }
        System.out.println(occurences);
    }
}
