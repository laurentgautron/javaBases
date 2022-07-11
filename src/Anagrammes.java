import java.util.*;

public class Anagrammes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String chaine1 = "";
        System.out.print("Entrer la première chaîne de caractères: ");
        chaine1 = input.nextLine();
        String chaine1Formatee = chaine1.replace(" ", "").toLowerCase();

        String chaine2 = "";
        System.out.print("Entrer la deuxième chaîne de caractères: ");
        chaine2 = input.nextLine();
        String chaine2Formatee = chaine2.replace(" ", "").toLowerCase();

        // occurences chaine1
        HashMap<Character, Integer> occurencesChaine1 = new HashMap<>();
        for (int index = 0; index < chaine1Formatee.length(); index++) {
            char lettre  = chaine1Formatee.charAt(index);
            if (occurencesChaine1.containsKey(lettre)) {
                int ancienneValeur = occurencesChaine1.get(lettre);
                occurencesChaine1.replace(lettre, ancienneValeur + 1);
            } else {
                occurencesChaine1.put(lettre, 1);
            }
        }

        // occurences chaine2
        HashMap<Character, Integer> occurencesChaine2 = new HashMap<>();
        for (int index = 0; index < chaine2Formatee.length(); index++) {
            char lettre  = chaine2Formatee.charAt(index);
            if (occurencesChaine2.containsKey(lettre)) {
                int ancienneValeur = occurencesChaine2.get(lettre);
                occurencesChaine2.replace(lettre, ancienneValeur + 1);
            } else {
                occurencesChaine2.put(lettre, 1);
            }
        }

        System.out.println(occurencesChaine1);
        System.out.println(occurencesChaine2);

        // vérifie si les chaines haschées ont la même taille
        boolean anagramme = true;
        if (occurencesChaine1.size() != occurencesChaine2.size()) {
            anagramme = false;
        } else {
            // liste de clé
            Set<Character> keys = occurencesChaine1.keySet();
            for ( char key : keys) {
                // vérifie sie les clés existe dans l'autre hashmap et que le nombre est le même
                boolean sameValues = occurencesChaine2.get(key) == occurencesChaine1.get(key);
                boolean keyExist = occurencesChaine2.containsKey(key);
                if (!keyExist || !sameValues) {
                    anagramme = false;
                    break;
                }
            }
        }

        // affiche réponse
        String response = anagramme ? "Les chaines sont des anagrammes" : "Les chaines ne sont pas des anagrammes";
        System.out.println(response);
    }
}
