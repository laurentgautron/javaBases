import java.util.HashMap;
import java.util.Set;

public class PourcentagesTableaux {
    public static void main(String[] args) {
        String[] emails = {"christian.lisangola@gmail.com","jean.paul@gmail.com,","alain@gmail.com",
                          "lydie@yahoo.fr","josephine.lajoie@yahoo.com","luise@hotmail.fr","philemon.turion@gmail.com",
                          "jules.cesar@hotmail.fr"};

        int sommeGmail = 0;
        int sommeHotmail = 0;
        int sommeYahoo = 0;

        HashMap<String, Double> moyennes = new HashMap<>();

        // calcul nombre d'occurence pour gmail, yahoo, hotmail
        for (String email : emails) {
            if (email.contains("@gmail.com")) {
                sommeGmail++;
            } else if (email.contains("@yahoo.fr")) {
                sommeYahoo++;
            } else if (email.contains("@hotmail.fr")) {
                sommeHotmail++;
            }
        }

        // moyennes
        int nbEmails = emails.length;
        moyennes.put("gmail", ((double)sommeGmail/nbEmails)*100);
        moyennes.put("yahoo", ((double)sommeYahoo/nbEmails)*100);
        moyennes.put("hotmail", ((double)sommeHotmail/nbEmails)*100);

        // affichage des moyennes : lecture du hashmap
        Set<String> moyennesKeys = moyennes.keySet();
        for (String key : moyennesKeys) {
            System.out.printf("Moyenne des adresse contenant %s : %.1f %%\n",key, moyennes.get(key));
        }
    }
}
