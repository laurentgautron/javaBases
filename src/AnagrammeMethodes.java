import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class AnagrammeMethodes {

    // Rentre des chaines et retourne des chaines formatées
    static String inputUserChaine() {
        Scanner input = new Scanner(System.in);
        String returnedChaine = "";
        System.out.print("Entrer la première chaîne de caractères: ");
        returnedChaine = input.nextLine();
        // input.close();
        String chaineFormatee = returnedChaine.replaceAll("[^A-Za-z]", "").toLowerCase();
        // System.out.println(chaineFormatee);
        return chaineFormatee;
    }
    static Boolean isAnagramme(HashMap<Character, Integer> occurences1, HashMap<Character, Integer> occurences2) {
        boolean anagramme = true;
        if (occurences1.size() != occurences2.size()) {
            anagramme = false;
        } else {
            // liste de clé
            Set<Character> keys = occurences1.keySet();
            for ( char key : keys) {
                // vérifie sie les clés existe dans l'autre hashmap et que le nombre est le même
                boolean sameValues = occurences2.get(key) == occurences1.get(key);
                boolean keyExist = occurences2.containsKey(key);
                if (!keyExist || !sameValues) {
                    anagramme = false;
                    break;
                }
            }
        }
        return anagramme;
    }
    static HashMap<Character, Integer> createHasMapOccurences (String chaine) {

        int taille = chaine.length();
        HashMap<Character, Integer> occurences = new HashMap<>();
        for (int index = 0; index < taille; index++) {
            char lettre  = chaine.charAt(index);
            if (occurences.containsKey(lettre)) {
                int ancienneValeur = occurences.get(lettre);
                occurences.replace(lettre, ancienneValeur + 1);
            } else {
                occurences.put(lettre, 1);
            }
        }
        return occurences;
    }

    public static void main(String[] args) {

        String chaine1 = inputUserChaine();
        String chaine2 = inputUserChaine();

        // occurences chaine1
        HashMap<Character, Integer> occurencesChaine1 = createHasMapOccurences(chaine1);
        // occurences chaine2
        HashMap<Character, Integer> occurencesChaine2 = createHasMapOccurences(chaine2);

        System.out.println(occurencesChaine1);
        System.out.println(occurencesChaine2);

        // affiche réponse
        String response = isAnagramme(occurencesChaine1, occurencesChaine2) ? "Les chaines sont des anagrammes" : "Les chaines ne sont pas des anagrammes";
        System.out.println(response);
    }
}
